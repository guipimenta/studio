package studio.ui;

import javax.swing.*;
import javax.swing.text.Document;

/**
 * Encapsulates a JPanel that holds a NetBeans editor
 * Created by guipimenta on 25/06/17.
 */
public class EditorTab extends JPanel {

    private JEditorPane editor;

    /**
     * Initializes a editor with blank document
     */
    EditorTab() {
        this.editor = new JEditorPane("text/q","");
        Document doc = this.editor.getDocument();
        doc.putProperty("filename", null);
    }

    JEditorPane getEditor() {
        return this.editor;
    }

}
