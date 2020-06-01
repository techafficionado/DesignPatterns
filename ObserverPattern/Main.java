class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    WeatherData weatherData = new WeatherData();
    DisplayObserver disObs = new DisplayObserver(weatherData);
    disObs.display();
    weatherData.setMeasurements(50,100,150);
    disObs.display();
  }
}