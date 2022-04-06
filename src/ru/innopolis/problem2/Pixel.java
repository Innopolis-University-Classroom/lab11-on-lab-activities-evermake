package ru.innopolis.problem2;

public class Pixel extends Smartphone<USBPort> {
  public Pixel() {
    this.charge = 40;
    this.port = new USBPort(this);
  }
}
