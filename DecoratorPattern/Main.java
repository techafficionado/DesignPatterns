class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Let's make some Coffee");
    System.out.println("DarkRoast Mocha with milk and whip");
    IBeverage dm = new WhipDecorator(new MilkDecorator(new MochaDecorator(new DarkRoast())));
    System.out.println("description: "+dm.getDescription());
    System.out.println("cost: " + dm.getCost());
    System.out.println("Decaf Mocha with Soy");
    IBeverage decaf = new SoyDecorator(new MochaDecorator(new Decaf()));
    System.out.println("description: "+decaf.getDescription());
    System.out.println("cost: " + decaf.getCost());
  }
}