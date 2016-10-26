package spel;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel 
{	
	Ball ball = new Ball(this);
	
	private void move(){
		ball.move();
	}  
	public void paint(Graphics g)
	{
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	ball.paint(g2d);
	}
	public static void main(String[] args) 
	{
		 JFrame frame = new JFrame(); 
		 Game game = new Game();
				 
		frame.setSize(1000, 600); //x,y
		frame.setLocation(300,150);
		frame.setDefaultCloseOperation(3);
		frame.add(game);
		frame.setTitle("Orange");
		frame.setResizable(false);
		frame.setVisible(true);
		
		while(true)
		{
		game.moveBall();	
		game.repaint();
		try 
		{
			Thread.sleep(10);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		}
	}

}
// Avsnitt 7 4,00 sek eller 5,28 