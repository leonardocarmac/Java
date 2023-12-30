
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GameFrame(){
		
		//GamePanel panel = new GamePanel();
		//this.add(panel);
		//shortcut bellow
		
		this.add(new GamePanel());
		this.setTitle("SNAKE GAME");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//pack() adjusts the size of the window to fit everything we create
		this.pack();
		this.setVisible(true);
		//to show window in the middle of the screen enter null on the code bellow
		this.setLocationRelativeTo(null);
		
	}
}