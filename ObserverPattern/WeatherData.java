import java.util.List;
import java.util.ArrayList;
public class WeatherData implements Subject{
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData(){
    observers = new ArrayList<>();
  }
  public void registerObserver(Observer o){
    observers.add(o);
  }

  public void unregisterObserver(Observer o){
    observers.remove(o);
  }

  public void notifyObservers(){
    for (Observer o:observers){
      o.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged(){
      notifyObservers();
  }

  public void setMeasurements(float temp, float humid, float press){
    temperature = temp;
    humidity = humid;
    pressure = press;
    measurementsChanged();
  }
}