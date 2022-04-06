package ru.innopolis.problem2;

public class Main {
  public static void main(String[] args) {
    Pixel pixel = new Pixel();
    LightningToUsbAdapter adapter = new LightningToUsbAdapter(pixel.port);
    ChargeStation station = new ChargeStation();
    station.transmitElectricityViaLightning(adapter);
  }
}
