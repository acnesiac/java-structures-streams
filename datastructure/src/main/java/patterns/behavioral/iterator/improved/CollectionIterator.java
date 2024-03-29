package patterns.behavioral.iterator.improved;

public class CollectionIterator implements Iterator<String>{

    private final Collection collection;

    private int cursor=0;

    public CollectionIterator(Collection collection) {
        this.collection = collection;
    }

    public String getNext() {
        if(!isDone()){
            String item = collection.getItems()[cursor];
            cursor++;
            return item;
        }
        return null;
    }

    public boolean isDone() {
        return cursor == collection.getItems().length;
    }
}

