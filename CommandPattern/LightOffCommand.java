public class LightOffCommand implements ICommand{
  private Light light;
  public LightOffCommand(Light li){
    light = li;
  }
  public void execute(){
    light.off();
  }
}