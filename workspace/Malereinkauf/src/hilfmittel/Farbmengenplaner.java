package hilfmittel;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.Popup;
import javax.xml.ws.handler.MessageContext;

import java.awt.Font;
import java.awt.TextField;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Farbmengenplaner {

	private JFrame Farbmengenplaner;
	private JTextField TF_InputRaumLaenge;
	private JTextField TF_InputRaumBreite;
	private JTextField TF_InputRaumHoehe;
	private JTextField TF_InputFensterFlaeche;
	private JTextField TF_InputTuerFlaeche;

	/*
	 * parsen der übergebenen werte zum typ float zur weiterverwendung
	 * zusätzliche überprüfung ob der wert unter 1 bzw eine zahl ist
	 * rückgabe als float
	 */
	
	private float parseToFloat(String value)
	{
		float parsed;
		
		try
		{
			parsed = Float.parseFloat(value);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(Farbmengenplaner, "Der Wert '" + value + "' ist keine Zahl!");
			return 0;
		}
		if(parsed < 1.0f)
		{
			JOptionPane.showMessageDialog(Farbmengenplaner, "Der Wert '" + value + "' ist zu klein!");
			return 0;
		}
		else
		{
			return parsed;
		}
	}
	
	/*
	 * berechnen der fläche des raumes
	 * mit folgender subtraktion der fenster und türflächen
	 * rückgabe als float
	 */
	
	private float CalculatePaintedSurface(float[] raumMaße, float fensterFlaeche, float tuerFlaeche)
	{
		float ergebnis;
		
		float raumFlaeche = (raumMaße[0]*raumMaße[2]*2) + (raumMaße[1]*raumMaße[2]*2) + (raumMaße[0]*raumMaße[1]);
		
		ergebnis = raumFlaeche - fensterFlaeche - tuerFlaeche;
		
		return ergebnis;
	}
	
	/*
	 * zeigen eines dialogs zum nachfragen ob das programm beendet werden soll
	 * falls ja --> beenden ohne resourcenhandling
	 */
	
	private void ExitProgram()
	{
		if(JOptionPane.showOptionDialog(Farbmengenplaner, "Moechten Sie das Programm wirklich beenden?", "Beenden", 1, 3, null, new String[] {"Ja","Nein"}, Farbmengenplaner) == 0)
		{
			System.exit(0);
		}

	}	
	
	/**
	 * Hauptklasse
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Farbmengenplaner window = new Farbmengenplaner();
					window.Farbmengenplaner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * aufruf der initialisierung des frames
	 */
	public Farbmengenplaner() {
		initialize();
	}

	/**
	 * festlegung des contents der jframe 
	 * label > textfield > button
	 */
	private void initialize() {
		Farbmengenplaner = new JFrame();
		Farbmengenplaner.setTitle("Farbmengenplaner");
		Farbmengenplaner.setBounds(100, 100, 450, 430);
		Farbmengenplaner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Farbmengenplaner.getContentPane().setLayout(null);
		
		JLabel LBL_InfoRaum = new JLabel("Zu streichender Raum (Waende und Decke)");
		LBL_InfoRaum.setForeground(Color.BLUE);
		LBL_InfoRaum.setBounds(10, 11, 414, 14);
		Farbmengenplaner.getContentPane().add(LBL_InfoRaum);
		
		JLabel LBL_RaumLaenge = new JLabel("Laenge (m)");
		LBL_RaumLaenge.setForeground(Color.BLUE);
		LBL_RaumLaenge.setBounds(10, 47, 75, 14);
		Farbmengenplaner.getContentPane().add(LBL_RaumLaenge);
		
		JLabel LBL_RaumBreite = new JLabel("Breite (m)");
		LBL_RaumBreite.setForeground(Color.BLUE);
		LBL_RaumBreite.setBounds(10, 78, 75, 14);
		Farbmengenplaner.getContentPane().add(LBL_RaumBreite);
		
		JLabel LBL_RaumHoehe = new JLabel("Hoehe (m)");
		LBL_RaumHoehe.setForeground(Color.BLUE);
		LBL_RaumHoehe.setBounds(10, 109, 75, 14);
		Farbmengenplaner.getContentPane().add(LBL_RaumHoehe);
		
		JLabel LBL_InfoFenster = new JLabel("abzueglich Fensterflaechen");
		LBL_InfoFenster.setForeground(new Color(160, 82, 45));
		LBL_InfoFenster.setBounds(10, 143, 414, 14);
		Farbmengenplaner.getContentPane().add(LBL_InfoFenster);
		
		JLabel LBL_FensterFlaeche = new JLabel("Flaeche (m\u00B2)");
		LBL_FensterFlaeche.setForeground(new Color(160, 82, 45));
		LBL_FensterFlaeche.setBounds(10, 168, 75, 14);
		Farbmengenplaner.getContentPane().add(LBL_FensterFlaeche);
		
		JLabel LBL_InfoTuer = new JLabel("abzueglich Tuerflaechen");
		LBL_InfoTuer.setForeground(new Color(60, 179, 113));
		LBL_InfoTuer.setBounds(10, 205, 414, 14);
		Farbmengenplaner.getContentPane().add(LBL_InfoTuer);
		
		JLabel LBL_TuerFlaeche = new JLabel("Flaeche (m\u00B2)");
		LBL_TuerFlaeche.setForeground(new Color(60, 179, 113));
		LBL_TuerFlaeche.setBounds(10, 230, 75, 14);
		Farbmengenplaner.getContentPane().add(LBL_TuerFlaeche);
		
		JLabel LBL_InfoVerbrauch = new JLabel("Bestellung bei 0,150 l pro m\u00B2");
		LBL_InfoVerbrauch.setFont(new Font("Tahoma", Font.ITALIC, 11));
		LBL_InfoVerbrauch.setForeground(new Color(106, 90, 205));
		LBL_InfoVerbrauch.setBounds(10, 287, 414, 14);
		Farbmengenplaner.getContentPane().add(LBL_InfoVerbrauch);
		
		JLabel LBL_Output = new JLabel("");
		LBL_Output.setFont(new Font("Tahoma", Font.ITALIC, 11));
		LBL_Output.setForeground(new Color(106, 90, 205));
		LBL_Output.setBounds(10, 301, 414, 14);
		Farbmengenplaner.getContentPane().add(LBL_Output);
		
		TF_InputRaumLaenge = new JTextField();
		TF_InputRaumLaenge.setForeground(Color.WHITE);
		TF_InputRaumLaenge.setBackground(Color.BLUE);
		TF_InputRaumLaenge.setBounds(95, 36, 136, 20);
		Farbmengenplaner.getContentPane().add(TF_InputRaumLaenge);
		TF_InputRaumLaenge.setColumns(10);
		
		TF_InputRaumBreite = new JTextField();
		TF_InputRaumBreite.setForeground(Color.WHITE);
		TF_InputRaumBreite.setBackground(Color.BLUE);
		TF_InputRaumBreite.setBounds(95, 75, 136, 20);
		Farbmengenplaner.getContentPane().add(TF_InputRaumBreite);
		TF_InputRaumBreite.setColumns(10);
		
		TF_InputRaumHoehe = new JTextField();
		TF_InputRaumHoehe.setForeground(Color.WHITE);
		TF_InputRaumHoehe.setBackground(Color.BLUE);
		TF_InputRaumHoehe.setBounds(95, 106, 136, 20);
		Farbmengenplaner.getContentPane().add(TF_InputRaumHoehe);
		TF_InputRaumHoehe.setColumns(10);
		
		TF_InputFensterFlaeche = new JTextField();
		TF_InputFensterFlaeche.setBackground(new Color(233, 150, 122));
		TF_InputFensterFlaeche.setBounds(95, 165, 136, 20);
		Farbmengenplaner.getContentPane().add(TF_InputFensterFlaeche);
		TF_InputFensterFlaeche.setColumns(10);
		
		TF_InputTuerFlaeche = new JTextField();
		TF_InputTuerFlaeche.setBackground(new Color(143, 188, 143));
		TF_InputTuerFlaeche.setBounds(95, 227, 136, 20);
		Farbmengenplaner.getContentPane().add(TF_InputTuerFlaeche);
		TF_InputTuerFlaeche.setColumns(10);
		
		JButton BTN_Calc = new JButton("Berechnen");
		BTN_Calc.setBounds(241, 226, 103, 23);
		Farbmengenplaner.getContentPane().add(BTN_Calc);
		
		JButton BTN_Exit = new JButton("Beenden");
		BTN_Exit.setBounds(241, 326, 103, 23);
		Farbmengenplaner.getContentPane().add(BTN_Exit);
		
		/*
		 * clickevent der berechnen-buttons 
		 */
		
		BTN_Calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * berechnung der zu streichenenden fläche über den methodenaufruf 
				 * wertfestlegung des float-variable mithilfe des rückgabewertes
				 */
				
				float flaeche = CalculatePaintedSurface(
						new float[] { parseToFloat(TF_InputRaumLaenge.getText()), parseToFloat(TF_InputRaumBreite.getText()), parseToFloat(TF_InputRaumHoehe.getText()) }, 
						parseToFloat(TF_InputFensterFlaeche.getText()), 
						parseToFloat(TF_InputTuerFlaeche.getText()));
				
				/*
				 * festlegung des textes des ausgabelabels
				 */
				
				LBL_Output.setText(flaeche + " m² sind zu streichen und " + (flaeche * 0.150f) + " l werden benoetigt");
			}
			
		});
		
		/*
		 * clickevent des beenden-buttons
		 * aufruf der exitprogram methode 
		 */
		BTN_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ExitProgram();
				
			}
		});
	}
}
