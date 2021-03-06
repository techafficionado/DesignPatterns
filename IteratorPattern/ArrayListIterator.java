import java.util.ArrayList;
import java.util.List;
class ArrayListIterator <T> implements IIterator<T>{
  private List<T> fArrayList = new ArrayList<>();
  private int fCurrentIndex = -1; 
  public ArrayListIterator(){
    /*for(int i=1;i<=10;i++){
      fArrayList.add(i*10);
    }*/
  }
  public void addElement(T el){
    fArrayList.add(el);
  }
  public boolean hasNext(){
    if (fCurrentIndex+1 < fArrayList.size())
      return true;
    return false;
  }
  public T next(){
    fCurrentIndex += 1;
    return fArrayList.get(fCurrentIndex);
  }
}