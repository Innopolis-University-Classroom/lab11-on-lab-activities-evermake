package ru.innopolis.problem2;

public class IPhone extends Smartphone<LightningPort> {
  public IPhone() {
    this.charge = 50;
    this.port = new LightningPort(this);
  }
}
