public class CoffeeWithHook extends ACaffeineBeverageTemplate{
  public void brew(){
    System.out.println("Brewing Coffee");
  }
  public void addCondiments(){
    System.out.println("Adding Chocolate");
  }
  //overridden
  public boolean customerWantsSpecialCondimentsHook(){
    return true;
  }

  // override special condiments
  public void addSpecialCondiments(){
    System.out.println("Adding whip cream");
    System.out.println("Adding cardamom powder");
  }
}