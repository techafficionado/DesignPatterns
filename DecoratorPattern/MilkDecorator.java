public class MilkDecorator implements IBeverage{
  // MilkDecorator implements ICondimentDecorator/IBeverage and has a IBeverage

  private final double cost = 0.25;
  private final String description = "Add Milk";
  private final IBeverage beverage;
  public MilkDecorator(IBeverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription() + description;
  }
  public double getCost(){
    return cost+beverage.getCost();
  }
}