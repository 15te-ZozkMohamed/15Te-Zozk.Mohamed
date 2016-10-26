
public class SSP {
	   // Sten, sax och påse lek. Du trycker på en av tre knappar och datorn
	   // väljer efter slumpen

	   import java.awt.*;
	   import javax.swing.*;
	   import java.awt.event.*;
	   import extra.*;

	   public class Lek extends ExtendedJFrame implements ActionListener {
	     private int vinst, förlust;
	     private JButton sten, sax, påse;
	     private JLabel v = new JLabel("Vinster:");
	     private JLabel f = new JLabel("Förluster:");
	     private JLabel vn = new JLabel("   0  ",JLabel.CENTER);
	     private JLabel fn = new JLabel("   0  ",JLabel.CENTER);
	     private JLabel mdrag = new JLabel("             ", JLabel.CENTER);
	     private JLabel drag = new JLabel("             ", JLabel.CENTER);
	     private JPanel p = new JPanel();
	     private JPanel p1 = new JPanel();
	     private JPanel p2 = new JPanel();
	     private JPanel p3 = new JPanel();

	   // sten = 0, sax = 1, påse = 2, en tabell över resultat av
	   // olika kombinationer, 1 = vinst, -1 = förlust, 0 = oavgjort

	   private int [][] tabell = {{0, 1, -1}, {-1, 0, 1}, {1, -1, 0}};

	   // sätt upp gränssnittet

	   public Lek() {
	      Container cont = getContentPane();

	      // tappat bort koden här!

	      pack();
	      setVisible(true);
	    }
	  
	    public void actionPerformed(ActionEvent e) {

	      // kolla vilken knapp
	    
	      int val;
	      if(e.getSource() == sten) val = 0;
	      else if (e.getSource() == sax) val = 1;
	      else val = 2;
	      if (val == 0) mdrag.setText("Ditt drag: sten");
	      else if (val == 1) mdrag.setText("Ditt drag: sax");
	      else mdrag.setText("Ditt drag: påse");

	      // låt datorn välja med hjälp av slumpen

	      int d = (int) (3*Math.random());
	      if (d == 0) drag.setText("Mitt drag: sten");
	      else if (d == 1) drag.setText("Mitt drag: sax");
	      else drag.setText("Mitt drag: påse");

	      // kolla vinsttabellen

	      if (tabell[d][val] == 1) vinst++;
	      else if (tabell[d][val] == -1) förlust++;

	      // uppdatera räknarna

	      vn.setText(String.valueOf(vinst));
	      fn.setText(String.valueOf(förlust));
	    }

	    public static void main(String [] args) {
	      Lek l = new Lek();
	    }
	  }
}