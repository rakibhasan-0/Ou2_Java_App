public class EditorTextMemento {
    private final String text;
    private final int cursorPosition;
    private final int selectionEnd;

    public EditorTextMemento(String text, int cursorPosition, int selectionEnd) {

        if(cursorPosition != selectionEnd){
            this.text = text.substring(cursorPosition, selectionEnd);
        }
        else{
            this.text = text;
        }
        this.cursorPosition = cursorPosition;
        this.selectionEnd = selectionEnd;
    }

    public String getText() {
        return text;
    }

    public int getCursorPosition() {
        return cursorPosition;
    }

    public int getSelectionEnd() {
        return selectionEnd;
    }

}
