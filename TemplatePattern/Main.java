class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Let's make some Tea");
    Tea tea = new Tea();
    tea.beverageRecipe();
    System.out.println();
    System.out.println("Let's make some Coffee");
    Coffee coffee = new Coffee();
    coffee.beverageRecipe();
    System.out.println();
    System.out.println("Let's make some Special Coffee");
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    coffeeWithHook.beverageRecipe();
  }
}