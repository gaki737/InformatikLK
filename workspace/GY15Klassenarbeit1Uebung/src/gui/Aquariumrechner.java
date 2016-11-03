package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.CaretEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Aquariumrechner {

	private JFrame FRM_Aquariumrechner;
	private JTextField TF_InputHoehe;
	private JTextField TF_InputBreite;
	private JTextField TF_InputTiefe;
	private JTextField TF_OutputVolumen;
	private JTextField TF_OutputInhalt;
	private JTextField TF_OutputFlaeche;
	private JTextField TF_OutputKanten;

	/*
	 * parsen der übergebenen werte zum typ float zur weiterverwendung
	 * zusätzliche überprüfung ob der wert unter 1 bzw eine zahl ist rückgabe
	 * als float
	 */

	private float parseToFloat(String value, boolean showErrorMessage, boolean colorTextField, JTextField inputField) {
		float parsed;

		try {
			parsed = Float.parseFloat(value);
		} catch (NumberFormatException e) {
			if (showErrorMessage) {
				JOptionPane.showMessageDialog(FRM_Aquariumrechner, "Der Wert '" + value + "' ist keine Zahl!");
			}
			if (colorTextField) {
				inputField.setForeground(Color.RED);
				System.out.println("''" + inputField.getText() + "''");
			}
			return 0;
		}
		if (parsed < 1.0f) {
			if (showErrorMessage) {
				JOptionPane.showMessageDialog(FRM_Aquariumrechner, "Der Wert '" + value + "' ist zu klein!");
			}
			if (colorTextField) {
				inputField.setForeground(Color.RED);
				System.out.println("''" + inputField.getText() + "''");
			}
			return 0;
		} else {
			if(colorTextField)
			inputField.setForeground(Color.BLACK);
			return parsed;
		}
	}
	
	private void ExitProgram()
	{
		if(JOptionPane.showOptionDialog(FRM_Aquariumrechner, "Moechten Sie das Programm wirklich beenden?", "Beenden", 1, 3, null, new String[] {"Ja","Nein"}, FRM_Aquariumrechner) == 0)
		{
			System.exit(0);
		}

	}

	private void Calculate() {
		// TODO Auto-generated method stub
		
		float hoehe = parseToFloat(TF_InputHoehe.getText(), true, false, null);
		float breite = parseToFloat(TF_InputBreite.getText(), true, false, null);
		float tiefe = parseToFloat(TF_InputTiefe.getText(), true, false, null);
		
		TF_OutputInhalt.setText(String.valueOf(hoehe * tiefe * breite / 1000));
		TF_OutputFlaeche.setText(String.valueOf((2 * hoehe * tiefe) + (2 * hoehe * breite) + (2 * tiefe * breite)));
		TF_OutputVolumen.setText(String.valueOf(hoehe * tiefe * breite / 1000000));
		TF_OutputKanten.setText(String.valueOf(4 * (hoehe + breite + tiefe)));
		
		
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aquariumrechner window = new Aquariumrechner();
					window.FRM_Aquariumrechner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aquariumrechner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FRM_Aquariumrechner = new JFrame();
		FRM_Aquariumrechner.setTitle("Aquariumrechner");
		FRM_Aquariumrechner.setBounds(100, 100, 395, 262);
		FRM_Aquariumrechner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRM_Aquariumrechner.getContentPane().setLayout(null);

		TF_InputHoehe = new JTextField();
		TF_InputHoehe.setBounds(10, 11, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_InputHoehe);
		TF_InputHoehe.setColumns(10);
		TF_InputHoehe.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				parseToFloat(TF_InputHoehe.getText(), false, true, TF_InputHoehe);

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);
				parseToFloat(TF_InputHoehe.getText(), false, true, TF_InputHoehe);

			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				// parseToFloat(TF_InputHoehe.getText(), false, true,
				// TF_InputHoehe);

			}
		});

		TF_InputBreite = new JTextField();
		TF_InputBreite.setBounds(10, 42, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_InputBreite);
		TF_InputBreite.setColumns(10);
		TF_InputBreite.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				parseToFloat(TF_InputBreite.getText(), false, true, TF_InputBreite);

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);
				parseToFloat(TF_InputBreite.getText(), false, true, TF_InputBreite);

			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				// parseToFloat(TF_InputHoehe.getText(), false, true,
				// TF_InputHoehe);

			}
		});

		TF_InputTiefe = new JTextField();
		TF_InputTiefe.setBounds(10, 73, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_InputTiefe);
		TF_InputTiefe.setColumns(10);
		TF_InputTiefe.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				parseToFloat(TF_InputTiefe.getText(), false, true, TF_InputTiefe);

			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);
				parseToFloat(TF_InputTiefe.getText(), false, true, TF_InputTiefe);

			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				// parseToFloat(TF_InputHoehe.getText(), false, true,
				// TF_InputHoehe);

			}
		});

		TF_OutputVolumen = new JTextField();
		TF_OutputVolumen.setEditable(false);
		TF_OutputVolumen.setBounds(10, 104, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_OutputVolumen);
		TF_OutputVolumen.setColumns(10);

		TF_OutputInhalt = new JTextField();
		TF_OutputInhalt.setEditable(false);
		TF_OutputInhalt.setBounds(10, 135, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_OutputInhalt);
		TF_OutputInhalt.setColumns(10);

		TF_OutputFlaeche = new JTextField();
		TF_OutputFlaeche.setEditable(false);
		TF_OutputFlaeche.setBounds(10, 166, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_OutputFlaeche);
		TF_OutputFlaeche.setColumns(10);

		TF_OutputKanten = new JTextField();
		TF_OutputKanten.setEditable(false);
		TF_OutputKanten.setBounds(10, 197, 86, 20);
		FRM_Aquariumrechner.getContentPane().add(TF_OutputKanten);
		TF_OutputKanten.setColumns(10);

		JLabel LBL_Hoehe = new JLabel("H\u00F6he in cm");
		LBL_Hoehe.setBounds(106, 14, 150, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Hoehe);

		JLabel LBL_Breite = new JLabel("Breite in cm");
		LBL_Breite.setBounds(106, 45, 150, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Breite);

		JLabel LBL_Tiefe = new JLabel("Tiefe in cm");
		LBL_Tiefe.setBounds(106, 76, 150, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Tiefe);

		JLabel LBL_Volumen = new JLabel("Volumen in m\u00B3");
		LBL_Volumen.setBounds(106, 107, 150, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Volumen);

		JLabel LBL_Inhalt = new JLabel("Inhalt in Liter");
		LBL_Inhalt.setBounds(106, 138, 150, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Inhalt);

		JLabel LBL_Flaeche = new JLabel("Fl\u00E4che in cm\u00B2");
		LBL_Flaeche.setBounds(106, 169, 150, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Flaeche);

		JLabel LBL_Kanten = new JLabel("Gesamte Kantenl\u00E4nge in cm");
		LBL_Kanten.setBounds(106, 200, 180, 14);
		FRM_Aquariumrechner.getContentPane().add(LBL_Kanten);

		JButton BTN_Berechne = new JButton("Berechnen");
		BTN_Berechne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calculate();
			}
		});
		BTN_Berechne.setBounds(266, 10, 107, 23);
		FRM_Aquariumrechner.getContentPane().add(BTN_Berechne);

		JButton BTN_Beenden = new JButton("Beenden");
		BTN_Beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ExitProgram();
			}
		});
		BTN_Beenden.setBounds(284, 72, 89, 23);
		FRM_Aquariumrechner.getContentPane().add(BTN_Beenden);
	}
}
