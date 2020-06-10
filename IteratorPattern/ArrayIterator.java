import java.util.Arrays;
class ArrayIterator <T> implements IIterator<T> {
  private Object[] fArray = new Object[10];//{5,15,25,35,45,55,65,75,85,95};
  private int fCurrentIndex = -1; 
  private int fInsertIndex = 0;
  public ArrayIterator(){
    
  }
  public void addElement(T el){
    fArray[fInsertIndex++] = el;
  }

  public boolean hasNext(){
    if (fCurrentIndex+1 < /*fArray.length*/fInsertIndex) {
      return true;
    }
    return false;
  }
  public T next(){
    fCurrentIndex += 1;

    return (T)fArray[fCurrentIndex];
  }
}