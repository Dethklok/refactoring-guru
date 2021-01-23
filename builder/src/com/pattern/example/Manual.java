package com.pattern.example;

public class Manual {

  private final CarType type;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private final TripComputer tripComputer;
  private final GPSNavigator gpsNavigator;

  public Manual(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
             GPSNavigator gpsNavigator) {
    this.type = type;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.tripComputer = tripComputer;
    this.gpsNavigator = gpsNavigator;
  }

  public String getInfo() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Type of car: ").append(type).append("\n");
    stringBuilder.append("Count of seats: ").append(seats).append("\n");
    stringBuilder.append("Engine: volume - ").append(engine.getVolume()).append("; meleage - ")
      .append(engine.getMileage()).append("\n");
    stringBuilder.append("Transmission: " + transmission + "\n");

    if (this.tripComputer != null) stringBuilder.append("Trip Computer: Functional").append("\n");
    else stringBuilder.append("Trip Computer: N/A").append("\n");

    if (this.gpsNavigator != null) stringBuilder.append("GPS Navigator: Functional").append("\n");
    else stringBuilder.append("GPS Navigator: N/A").append("\n");

    return stringBuilder.toString();
  }

}
