import java.io.ObjectStreamException;

public class Names implements Container<Object> {
    DoubleLinkedList<Object> linkedList;
    DoubleLinkedList.Position position;

    public Names(){
        linkedList = new DoubleLinkedList<>();
        position = linkedList.first();
    }

    public void addName (Object name){
        linkedList.insert(name, position);
        position = linkedList.next(position);
    }


    @Override
    public Iterator<Object> createIterator() {
        return new DoubleLinkedListIterator(linkedList);
    }

}
