public class FanOffCommand implements ICommand{
  private Fan fan;
  public FanOffCommand(Fan f){
    fan = f;
  }
  public void execute(){
    fan.off();
  }
}