
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//for static final variables use ALL UPPERCASE
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25;
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);
	//the higher the delay the slower is the game
	static final int DELAY = 175;
	//the arrays bellow hold the coordinates for all the body parts of the snake including the head of the snake
	final int x[] = new int[GAME_UNITS/(SCREEN_WIDTH/UNIT_SIZE)];
	final int y[] = new int[GAME_UNITS/(SCREEN_HEIGHT/UNIT_SIZE)];
	//set initial amount of body parts including head of the snake
	int bodyParts = 6;
	//declaring variables
	int applesEaten;
	//X and Y coordinates of the apple, that will change every time the snake eats them
	int appleX;
	int appleY;
	//just setting up a direction initializing it with R (could be any direction)
	char direction = 'R';
	//boolean value to stop or start the game 
	boolean running = false;
	//declaring Timer
	Timer timer;
	//creating an instance of Random
	Random random;
	
	
	GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		//question: why use setFocusable??????
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
	}
	
	//setting up all the methods of the game
	
	public void startGame() {
		newApple();
		running = true;
		//create an instance of our timer and we pass this because we are using the action listener interface
		//this will dictate how fast the game is going
		timer = new Timer(DELAY,this);
		timer.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		if(running) {
			//grid to make easier to see the size of the game unit and apple
			//drawing line across X and Y axis
			for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
				//starting coordinates the 2 first ones on the left, end coordinates the 2 second ones on the right
				//X-axis lines
				g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
				//Y-axis lines
				g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
			}
			
			//draw apple
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
			
			//draw head and snake's body parts
			for(int i = 0;i<bodyParts;i++) {
				if(i == 0) {
					//snake's head color
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
				else {
					//snake's body color
					g.setColor(new Color(45,180,0));
					//random body color
					g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			}
			
			//draw the score(how many apples were eaten)
			g.setColor(Color.red);
			g.setFont(new Font("Ink Free",Font.BOLD,40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: " + applesEaten,(SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());
			
		}
		
		else {
			gameOver(g);
		}
	}
	
	//method to populate the game with an apple
	//generate the coordinates of the new apple (when the game starts or snake eat apple)
	public void newApple() {
		//cast as int to not brake the program
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE
				;
	}
	
	public void move() {
		
		for(int i = bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		switch(direction) {
		case'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		
		}
	}
	public void checkApple() {
		if((x[0] == appleX)&& (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
			
		}
		
	}
	public void checkCollisions() {
		//this checks if head collides with body
		for(int i = bodyParts; i>0;i--) {
			//this means that the head collide with the body
			if((x[0] == x[i]) && y[0] == y[i]) {
				running = false;
			}
		}
		
		//check if head touches left border
		if(x[0] < 0) {
			running = false;
		}
		//check if head touches right border
		if(x[0] > SCREEN_WIDTH - UNIT_SIZE) {
			running = false;
		}
		//check if head touches top border
		if(y[0] <0) {
			running = false;
		}
		//check if head touches bottom border
		if(y[0] > SCREEN_HEIGHT - UNIT_SIZE) {
			running = false;
		}
		
		if(!running) {
			timer.stop();
		}
		
	}
	
	public void gameOver(Graphics g) {
		//Score
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free",Font.BOLD,40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: " + applesEaten,(SCREEN_WIDTH - metrics1.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());
		
		
		//Game Over text
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free",Font.BOLD,75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over",(SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(running) {
			move();
			checkApple();
			checkCollisions();
		
		}
		//if the game is no longer running we call repaint method
		repaint();
	}
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			//this key event are to limit the user to 90 degrees turn
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}

	

}
