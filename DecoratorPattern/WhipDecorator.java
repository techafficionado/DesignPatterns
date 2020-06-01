public class WhipDecorator implements IBeverage{
  private final double cost = 1.25;
  private final String description = "Add Whip";
  private final IBeverage beverage;
  public WhipDecorator(IBeverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription() +description;
  }
  public double getCost(){
    return cost+beverage.getCost();
  }
}