class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println();
    //Duck d = new Duck();
    //d.quack();
    MallardDuck md = new MallardDuck();
    md.quack();
    md.display();
    md.fly();
    System.out.println();
    System.out.println("Making MallardDuck Mute");
    md.setQuackBehavior(new MuteQuack());
    md.quack();
    System.out.println();
    RubberDuck rd = new RubberDuck();
    rd.quack();
    rd.display();
    rd.fly();
  }
}