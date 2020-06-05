public abstract class ACaffeineBeverageTemplate{
  // method made final to prevent overriding
  // beverageRecipe is an algorithm that applies to both Tea and coffee.
  // we will be implementing methods that are common across tea and coffee making and will leave out the methods that are different as abstract methods that need to be overriden by the respective classes
  public final void beverageRecipe(){
      boilWater();
      brew();
      pourInCup();
      addCondiments();
      // hook in a template method, this gives concrete classes flexibility to enable and disable behaviors
      if (customerWantsSpecialCondimentsHook()){ 
        addSpecialCondiments();
      }

  }
  abstract void brew();
  abstract void addCondiments();
  public void boilWater(){
    System.out.println("Boiling the Water");
  }
  public void pourInCup(){
    System.out.println("Pouring beverage in cup");
  }
  public boolean customerWantsSpecialCondimentsHook(){
    return false;
  }
  public void addSpecialCondiments(){
    System.out.println("Not so special condiments from base class");
  }
}