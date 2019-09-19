package source;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter{

	private Handler handler;
	
	public MouseInput(Handler handler){
		this.handler = handler;
	}
	
	public void mousePressed(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		System.out.println(x + " " + y);
		if(handler.object.getFirst().id == ID.Ball){
			GameObject tempObject = handler.object.getFirst();
			if(tempObject.getBounds().contains(x, y)){
				HUD.score++;
			}else{
				HUD.score = 0;
			}
		}
		
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	
	//override more mouse adapter methods if needed for game
	
}
