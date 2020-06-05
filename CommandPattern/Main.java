import java.util.List;
import java.util.ArrayList;
class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Invoking Commands");
    Light light = new Light();
    Fan fan = new Fan();
    LightOnCommand lonc = new LightOnCommand(light);
    LightOffCommand loffc = new LightOffCommand(light);
    FanOnCommand fonc = new FanOnCommand(fan);
    FanOffCommand foffc = new FanOffCommand(fan);
    // run commands individually from the invoker
    System.out.println("run commands individually from the invoker");
    lonc.execute();
    loffc.execute();
    fonc.execute();
    foffc.execute();

    // run commands as a Macro through another invoker RemoteControl
    System.out.println("run commands as a Macro through another invoker RemoteControl");
    List<ICommand> commands = new ArrayList<>();
    commands.add(lonc);
    commands.add(loffc);
    commands.add(fonc);
    commands.add(foffc);
    RemoteControl rc = new RemoteControl();
    rc.setCommands(commands);
    rc.runCommands();

  }
}