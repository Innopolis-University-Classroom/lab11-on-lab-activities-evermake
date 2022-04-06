package ru.innopolis.problem2;

public abstract class Port {
  EnergyReceiver receiver;

  public Port(EnergyReceiver receiver) {
    this.receiver = receiver;
  }

  abstract void receiveEnergy(int electricity);
}
