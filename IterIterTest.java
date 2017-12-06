public class IterIterTest {
  public static void main(String[] args) {
    Dictionary dict = new Dictionary<String, String>();
    dict.add("key1", "value!");
    dict.add("key2", "value!!");
    dict.add("key3", "value!!!");
    dict.add("key4", "value!!!!");
    VectorStack stack = new VectorStack<String>();
    stack.push("Stack!");
    stack.push("Stack!!");
    stack.push("Stack!!!");
    ListArray list = new ListArray<String>();
    list.add("List!");
    list.add("List!!");
    list.add("List!!!");
    IterIterator iterIter = new IterIterator(list, stack, dict);
    while (iterIter.hasNext()) {
      System.out.println(iterIter.next());
    }
  }
}