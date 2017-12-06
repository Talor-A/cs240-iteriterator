import java.util.Iterator;

public class IterIterator<T> implements Iterator<T> {
  int current;
  Iterator<T> dictIter;
  Iterator<T> stackIter;
  Iterator<T> listIter;

  IterIterator(ListArray<T> list, VectorStack<T> stack, Dictionary dictionary) {
    dictIter = dictionary.getValueIterator();
    stackIter = stack.iterator();
    listIter = list.iterator();
  }

  private Iterator iterForIndex(int index) {
    switch (index) {
    case 0:
      return dictIter;
    case 1:
      return stackIter;
    case 2:
      return listIter;
    default:
      return null;
    }
  }

  public T next() {
    while (!iterForIndex(current).hasNext()) {
      current = (current + 1) % 3;
    }
    T item = (T) iterForIndex(current).next();
    current = (current + 1) % 3;
    return item;
  }

  public boolean hasNext() {
    return dictIter.hasNext() || stackIter.hasNext() || listIter.hasNext();
  }
}