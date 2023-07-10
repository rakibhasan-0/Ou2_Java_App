import javax.swing.*;
import java.awt.*;

public class TextEditorApp{
    private EditorText editorText;
    private EditorTextMementoManager mementoManager;
    private JETextArea textArea;

    public TextEditorApp() {

        editorText = new EditorText();
        mementoManager = new EditorTextMementoManager();

        // Create the main window
        JFrame frame = new JFrame("Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create the text area
        textArea = new JETextArea(editorText);
        textArea.setPreferredSize(new Dimension(400, 300));
        frame.add(textArea, BorderLayout.CENTER);

        // Create the save button
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveState());


        // Create the restore button
        JButton restoreButton = new JButton("Restore");
        restoreButton.addActionListener(e -> restoreState());

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(restoreButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add the frame to the screen
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    private void saveState(){
        String text = textArea.getText();
        int cursorPosition = editorText.getCursorPosition();
        //System.out.println("Current cursor position: " + cursorPosition);
        int selectionEnd = editorText.getSelectionEndPosition();
        //System.out.println("Selection end position: " + selectionEnd);
        EditorTextMemento memento = new EditorTextMemento(text, cursorPosition, selectionEnd);
        mementoManager.save(memento);
    }

    private void restoreState() {
        if (mementoManager.hasMemento()) {
            EditorTextMemento memento = mementoManager.restore();
            String text = memento.getText();
            int cursorPosition = memento.getCursorPosition();
            int selectionEnd = memento.getSelectionEnd();
            textArea.setText(text);
            editorText.setText(text);
            editorText.setCursorPosition(cursorPosition, selectionEnd);
        }
    }

    public static void main(String[] args) {
        new TextEditorApp();
    }

}
