class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Calling ArrayListIterator");
    IIterator arrayListIterator = new ArrayListIterator();
    arrayListIterator.addElement(10);
    arrayListIterator.addElement(20);
    arrayListIterator.addElement(30);

    while (arrayListIterator.hasNext()){
      System.out.println(arrayListIterator.next());
    }
    System.out.println("Calling ArrayIterator");
    IIterator arrayIterator = new ArrayIterator();
    arrayIterator.addElement(1);
    arrayIterator.addElement(2);
    arrayIterator.addElement(3);
    while (arrayIterator.hasNext()){
      System.out.println(arrayIterator.next());
    }
    
  }
}