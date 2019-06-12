import java.awt.Color;
import javax.swing.*;
 
public class JAddData {
    public static void main(String[] args) {
		// Erstellen des Fensters und des Panels
        JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("Hinzufuegen von Daten");
        meinJFrame.setSize(300, 150);
		meinJFrame.setLocation(200, 200);
		
        JPanel panel = new JPanel();
 
        // 1. Textfeld wird erstellt
        JTextField tfNameStern = new JTextField("Name des Sterns", 15);
        panel.add(tfNameStern);

        // 2. Textfeld wird erstellt
        JTextField tfNameDistanz = new JTextField("Distanz zur Erde in LJ", 15);
        panel.add(tfNameDistanz);
 
		// Füge Buttons Hinzu
        JButton buttonOK = new JButton("Hinzufuegen");
        panel.add(buttonOK);

        JButton buttonCancel = new JButton("Abbrechen");
        panel.add(buttonCancel);

		/// Zeichnen
        meinJFrame.add(panel);
        meinJFrame.setVisible(true); 
    }
}