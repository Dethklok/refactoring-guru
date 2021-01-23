package com.pattern.example;

public interface Builder {

  void setCarType(CarType type);
  void setSeats(int count);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);

}
