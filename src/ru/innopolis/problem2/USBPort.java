package ru.innopolis.problem2;

public class USBPort extends Port {
  public USBPort(EnergyReceiver receiver) {
    super(receiver);
  }

  @Override
  public void receiveEnergy(int electricity) {
    System.out.println("Receiving energy via USB");
    receiver.receiveEnergy((double) electricity / 2);
  }
}
