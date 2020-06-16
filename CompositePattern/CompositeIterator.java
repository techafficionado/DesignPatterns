import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*
Use stack to keep state of current pointer to element, in interator
First add the composite list that needs to be iterated
Keep adding single list iterator to this stack.
*/
public class CompositeIterator{
  private int currentIndex = -1;
  private Stack<Object> fStack = new Stack<>();

  public CompositeIterator(List<Object> li){
    fStack.push(new ArrayListIterator(li));
  }

  /*
  if stack is empty that means we reached end of the collections/composite list, so just return false (base case)
  Else:
  peek stack, get the iterator and check if there is next, if there is return true, else we are done with this individual list iterator, just pop it off from the stack and recursively call hasNext() in case there is another iterator below the popped one.
  */
  public boolean hasNext(){
    if (fStack.empty()){
      return false;
    }else{
      ArrayListIterator iter = (ArrayListIterator) fStack.peek();
      if (iter.hasNext()){
        return true;
      } else {
        System.out.println("Popping");
        fStack.pop();
        return hasNext();
      }
    }
  }
  /*
  First check if there hasNext(), if there is, peek the iterator from the stack and get the next element.
  If the next element is also a list, then create iterator and add it to the stack and then recursively call next()
  */
  public Object next(){
    if (hasNext()){
      ArrayListIterator iter = (ArrayListIterator)fStack.peek();
      Object obj = iter.next();
      if (obj instanceof List){
        fStack.push(new ArrayListIterator((List)obj));
        return next();
      } else{
        return obj;
      }
    }
    return null;
  }
}