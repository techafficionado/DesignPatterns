public interface IIterator <T>{
  public void addElement(T a);
  public boolean hasNext();
  public Object next();
}