import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SSP extends JFrame implements ActionListener {
  JButton sten = new JButton("Sten");
  JButton sax  = new JButton("Sax");
  JButton p�se = new JButton("P�se");
  JPanel knappar = new JPanel();
  JButton sten2 = new JButton("Sten");
  JButton sax2  = new JButton("Sax");
  JButton p�se2 = new JButton("P�se");
  JPanel knappar2 = new JPanel();
  JLabel meddelande = new JLabel("V�lj en knapp!", JLabel.CENTER);
  int vinst, f�rlust;
  JLabel vinstL   = new JLabel("Antal vinster: 0");
  JLabel f�rlustL = new JLabel("Antal f�rluster: 0");
  JPanel statistik = new JPanel();

  SSP() {
    knappar.setLayout(new GridLayout(1,4));
    knappar.add(new JLabel("Ditt val ", JLabel.RIGHT));
    knappar.add(sten); knappar.add(sax); knappar.add(p�se);

    knappar2.setLayout(new GridLayout(1,4));
    knappar2.add(new JLabel("Datorns val ", JLabel.RIGHT));
    knappar2.add(sten2); knappar2.add(sax2); knappar2.add(p�se2);

    statistik.setLayout(new GridLayout(1,2));
    statistik.add(vinstL); statistik.add(f�rlustL);

    setLayout(new GridLayout(4,1,0,3));
    add(knappar);
    add(knappar2);
    add(meddelande);
    add(statistik);

    sten.addActionListener(this);
    sax.addActionListener(this);
    p�se.addActionListener(this);

    setSize(300,200);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE); 
  }

  public void actionPerformed(ActionEvent e) {
    final int STEN=0, SAX=1, P�SE=2;
    int val;  
    if (e.getSource()==sten) {
      val = STEN;
      sten.setBackground(Color.blue);
      sax.setBackground(Color.lightGray);
      p�se.setBackground(Color.lightGray);
    }
    else if (e.getSource()==sax) {
      val = SAX;
      sten.setBackground(Color.lightGray);
      sax.setBackground(Color.blue);
      p�se.setBackground(Color.lightGray);
    }
    else {
      val = P�SE; 
      sten.setBackground(Color.lightGray);
      sax.setBackground(Color.lightGray);
      p�se.setBackground(Color.blue);
    }
 
    int val2 = (int) (Math.random() * 3);  // Datorns val. Ger 0, 1 eller 2
    if (val2==STEN) {
      sten2.setBackground(Color.blue);
      sax2.setBackground(Color.lightGray);
      p�se2.setBackground(Color.lightGray);
    }
    else if (val2==SAX) {
      sten2.setBackground(Color.lightGray);
      sax2.setBackground(Color.blue);
      p�se2.setBackground(Color.lightGray);
    }
    else { 
      sten2.setBackground(Color.lightGray);
      sax2.setBackground(Color.lightGray);
      p�se2.setBackground(Color.blue);
    }

    if (val == val2)
      meddelande.setText("Ni valde samma. G�r ett nytt val!");   
    else if (val==STEN && val2==SAX  || 
             val==SAX  && val2==P�SE ||
             val==P�SE && val2==STEN) {
      meddelande.setText("Du vann! G�r ett nytt val!");
      vinstL.setText("Antal vinster: " + ++vinst);
    }
    else {
      meddelande.setText("Du f�rlorade! G�r ett nytt val!");
      f�rlustL.setText("Antal f�rluster: " + ++f�rlust);
    }

  }

  public static void main(String[] arg) {
    new SSP();
  }
}