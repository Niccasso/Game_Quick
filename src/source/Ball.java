package source;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends GameObject{

	private int width = 60, height = 60;
	private int counter = 0;
	
	Random random = new Random();
	
	public Ball(int x, int y, ID id, boolean visible) {
		super(x, y, id, visible);

	}

	public void tick() {
		if(counter <= 60){
			this.width -= 2;
			this.x += 1;
			counter++;
		}else if(counter > 60){
			counter = 0;
			this.width = 60;
			this.x =  random.nextInt(540) + 1; 
			this.y =  random.nextInt(475) + 1;
			
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, width, height);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
