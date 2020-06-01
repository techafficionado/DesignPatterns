public class Espresso implements IBeverage{
  private final double cost = 3.0;
  private final String description = "Espresso";
  public double getCost(){
    return cost;
  }
  public String getDescription(){
    return description;
  }
} 