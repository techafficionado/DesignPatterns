public class DisplayObserver implements Observer{
  private float fTemperature = 10;
  private float fHumidity = 20;
  //private final pressure;  // let's say pressure is not needed for this DisplayObserver
  private final Subject fWeatherData;

  public DisplayObserver(Subject weatherData){
    fWeatherData = weatherData;
    fWeatherData.registerObserver(this);
  }

  public void update(float temp, float humid, float press){
    fTemperature = temp;
    fHumidity = humid;
  }

  public void display(){
    System.out.println("Temp: "+ fTemperature + " Humid:"+ fHumidity);
  }
}