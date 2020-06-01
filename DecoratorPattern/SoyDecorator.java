public class SoyDecorator implements IBeverage{
  private final double cost = 0.75;
  private final String description = "Add Soy";
  private final IBeverage beverage;
  public SoyDecorator(IBeverage b){
    beverage = b;
  }
  public String getDescription(){
    return beverage.getDescription() + description;
  }
  public double getCost(){
    return cost+beverage.getCost();
  }
}