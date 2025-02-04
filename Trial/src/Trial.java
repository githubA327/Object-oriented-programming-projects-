import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trial extends JFrame {
	
	private final static JLabel label1 = new JLabel("Nombre 1 :");
    private final static JLabel label2 = new JLabel("Nombre 2 :");
    private final static JLabel label3 = new JLabel("Somme :");
    private static  JTextField nombre1= new JTextField(10);
   
    private static JTextField nombre2 = new JTextField(10);
    private static JTextField somme = new JTextField(20);
    private static JButton boutonAjouter = new JButton();
    private static JPanel conteneur = new JPanel();
	BoutonHandler handler = new BoutonHandler();
		
    
    public Trial() {
	
		super("Fenetre avec un conteneur");		
		conteneur.setBackground(Color.BLACK);
		this.setContentPane(conteneur);
		boutonAjouter.addActionListener(handler);
		
 
		boutonAjouter.setText("Additionner");
    	conteneur.setLayout(new FlowLayout());
    	somme.setHorizontalAlignment(JTextField.CENTER);
    	conteneur.add(label1);
    	conteneur.add(nombre1);
    	conteneur.add(label2);
    	conteneur.add(nombre2);
    	conteneur.add(label3);
    	conteneur.add(somme);
    	conteneur.add(boutonAjouter);
		
	}
	
	 private class BoutonHandler implements ActionListener
	    {
	    	@Override
	    	public void actionPerformed (ActionEvent e){
	    		
	    		
	    		   JButton boutonCliqué = (JButton) e.getSource();
				   String libelléBoutonCliqué = boutonCliqué.getText();
	    		   int n1, n2, s;
	    		   s= 0;
	    		   n1 = Integer.parseInt(nombre1.getText());
	    		   n2 = Integer.parseInt(nombre2.getText());
	    		   
	    		   if( libelléBoutonCliqué == "Additionner") {
	    		   
	    		   s = n1+n2;
	    		   
	    		   }
	    		   else if (libelléBoutonCliqué == "Soustraire"){
	    			   s = n1-n2;
	    			   
	    		   }
	    		   somme.setText(String.valueOf(s));
	    		
	    		
	    	}
	    }
}
