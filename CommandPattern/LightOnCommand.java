// LightOnCommand is the Concerte Command class
public class LightOnCommand implements ICommand{
  private Light light; // actual receiver that executes the command
  public LightOnCommand(Light li){
    light = li;
  }
  public void execute(){
    light.on();
  }
}