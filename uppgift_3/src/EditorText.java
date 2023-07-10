import java.util.ArrayList;
import java.util.List;

public class EditorText implements EditorTextInterface {
    private String text;
    private int cursorPosition;
    private int selectionEnd;
    private final List<EditorTextChangeListener> changeListeners;

    public EditorText(){
        text = "";
        cursorPosition = 0;
        selectionEnd = 0;
        changeListeners = new ArrayList<>();
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text){
        this.text = text;
    }

    @Override
    public void setCursorPosition(int cursorPosition, int selectionEnd) {
        this.cursorPosition = cursorPosition;
        this.selectionEnd = selectionEnd;
    }

    @Override
    public int getCursorPosition() {
        return cursorPosition;
    }

    @Override
    public int getSelectionEndPosition() {
        return selectionEnd;
    }

    @Override
    public void addChangeListener(EditorTextChangeListener listener) {
        changeListeners.add(listener);
    }

    @Override
    public void removeChangeListener(EditorTextChangeListener listener) {
        changeListeners.remove(listener);
    }


}
