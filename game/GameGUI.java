package game;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameGUI extends JFrame implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel[][] labels;
	Game g;
	public GameGUI()
	{
		labels = new JLabel[4][4];
		g = new Game();
		GridLayout glayout = new GridLayout(4,4);
		this.setLayout(glayout);
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				labels[i][j] = new JLabel();
				labels[i][j].setSize(100,100);
				labels[i][j].setAlignmentX(JLabel.CENTER_ALIGNMENT);
				labels[i][j].setAlignmentY(JLabel.CENTER_ALIGNMENT);
				this.add(labels[i][j]);
			}
		}
		setLabels();
		this.addKeyListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	public void setLabels()
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				int no = g.gameGrid[i][j];
				if(no!=0)
				labels[i][j].setText(" "+Integer.toString(no));
				else
					labels[i][j].setText(" ");
				this.add(labels[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		GameGUI game = new GameGUI();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			g.pressedUp();
			setLabels();
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			g.pressedDown();
			setLabels();
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			g.pressedRight();
			setLabels();
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			g.pressedLeft();
			setLabels();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
