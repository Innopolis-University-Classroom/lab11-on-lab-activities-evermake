package ru.innopolis.problem2;

public class LightningPort extends Port {
  public LightningPort(EnergyReceiver receiver) {
    super(receiver);
  }

  @Override
  public void receiveEnergy(int electricity) {
    System.out.println("Receiving energy via LightningPort");
    receiver.receiveEnergy((double) electricity / 1.5);
  }
}
