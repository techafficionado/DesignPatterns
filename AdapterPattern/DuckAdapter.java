class DuckAdapter implements IDuck{
  private final turkey;
  public DuckAdapter(Turkey t){
    turkey = t;
  }
  public void quack(){
    turkey.gobble();
  }
  public void fly(){
    turkey.fly();
  }
}