package ru.innopolis.problem2;

public class LightningToUsbAdapter extends LightningPort {
  USBPort usbPort;

  public LightningToUsbAdapter(USBPort usbPort) {
    super(usbPort.receiver);
    this.usbPort = usbPort;
  }

  @Override
  public void receiveEnergy(int electricity) {
    usbPort.receiveEnergy(electricity);
  }
}
