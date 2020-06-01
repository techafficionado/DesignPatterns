public class MochaDecorator implements IBeverage{
  private final double cost = 0.50;
  private final String description = "Add Mocha";
  private final IBeverage beverage;
  public MochaDecorator(IBeverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription() + description;
  }
  public double getCost(){
    return cost+beverage.getCost();
  }
}