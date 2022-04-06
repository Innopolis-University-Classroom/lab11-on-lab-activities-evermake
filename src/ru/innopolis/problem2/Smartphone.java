package ru.innopolis.problem2;

abstract class Smartphone<P extends Port> implements EnergyReceiver {
  public P port;
  int charge = 0;

  @Override
  public void receiveEnergy(double energy) {
    this.charge += energy;
  }
}
