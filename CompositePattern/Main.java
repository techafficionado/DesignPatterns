import java.util.ArrayList;
import java.util.List;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // [1,2,3[4,5,6,[7,8,[9]]]] -> [l4[l3[l2[l1]]]]
    List<Object> l1 = new ArrayList<>();
    l1.add(9);
    List<Object> l2 = new ArrayList<>();
    l2.add(7);
    l2.add(8);
    l2.add(l1);
    List<Object> l3 = new ArrayList<>();
    l3.add(4);
    l3.add(5);
    l3.add(6);
    l3.add(l2);
    List<Object> l4 = new ArrayList<>();
    l4.add(1);
    l4.add(2);
    l4.add(3);
    l4.add(l3);

    List<Object> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    List<Object> lSub1 = new ArrayList<>();
    lSub1.add(4);
    lSub1.add(5);
    lSub1.add(6);
    l.add(lSub1);
    ArrayListIterator<Object> it = new ArrayListIterator<Object>(l);
    while (it.hasNext()){
      System.out.println(it.next());
    }
    System.out.println("Composite Iterator");
    CompositeIterator comp = new CompositeIterator(l4);
    while (comp.hasNext()){
      System.out.println(comp.next());
    }
  }
}