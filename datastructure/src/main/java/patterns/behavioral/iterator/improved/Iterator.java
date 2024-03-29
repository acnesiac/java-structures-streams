package patterns.behavioral.iterator.improved;


public interface Iterator<T> {

    T getNext();

    boolean isDone();

}
