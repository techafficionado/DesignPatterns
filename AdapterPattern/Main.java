class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Actual Duck quack");
    MallardDuck md = new MallardDuck();
    md.quack();
    md.fly();
    System.out.println("Turkey through DuckAdapter");
    Turkey t = new Turkey(); // vendor specific code
    DuckAdapter da = new DuckAdapter(t); // turkey is the adaptee here
    da.quack();
    da.fly();
  }
}