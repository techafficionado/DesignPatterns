import java.util.List;
import java.util.ArrayList;
public class RemoteControl{
  List<ICommand> commands = new ArrayList<>();
  public void setCommands(List<ICommand> commands){
    this.commands = commands;
  }
  public void runCommands(){
    for(ICommand ic: commands){
      ic.execute();
    }
  }
}