public abstract class Duck{
  QuackBehavior quackBehavior = new Quack();
  FlyBehavior flyBehavior= new FlyWithWings();
  public void setQuackBehavior(QuackBehavior qb){
    this.quackBehavior = qb;
  }

  public void setFlyBehavior(FlyBehavior fb){
    this.flyBehavior = fb;
  }

  public void quack(){
    //System.out.println("Quack");
    quackBehavior.quack();
  }
  public void swim(){
    System.out.println("Swim");
  }
  abstract void display();
  public void fly(){
    //System.out.println("Fly");
    flyBehavior.fly();
  }

}