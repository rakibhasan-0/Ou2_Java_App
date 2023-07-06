import java.util.Stack;

public class EditorTextMementoManager {
    private Stack<EditorTextMemento> mementoStack;

    public EditorTextMementoManager() {
        mementoStack = new Stack<>();
    }

    public void save(EditorTextMemento memento) {
        mementoStack.push(memento);
    }

    public EditorTextMemento restore() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }

    public boolean hasMemento() {
        return !mementoStack.isEmpty();
    }
}

