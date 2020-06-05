public class FanOnCommand implements ICommand{
  private Fan fan;
  public FanOnCommand(Fan f){
    fan = f;
  }
  public void execute(){
    fan.on();
  }
}