public class DoubleLinkedListIterator implements Iterator<Object>{
    private int currentSize;
    private DoubleLinkedList<Object> list;

    DoubleLinkedList.Position currenPosition;
    public DoubleLinkedListIterator(DoubleLinkedList<Object> linkedList) {
        this.list = linkedList;
        currentSize = 0;
        currenPosition = list.first();
    }

    @Override
    public boolean hasNext() {
        return !list.end().equals(currenPosition);
    }

    @Override
    public Object next() {
        Object o = list.inspect(currenPosition);
        currenPosition = list.next(currenPosition);
        return o;
    }

}
