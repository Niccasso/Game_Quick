package source;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {

	public static int score = 0;
	Font scoreFont = new Font("Arial", Font.BOLD, 30);
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.blue);
		g.setFont(scoreFont);
		g.drawString("Score: " + score, 10, 50);
	}
	
}
