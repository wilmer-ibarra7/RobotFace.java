package week2;

import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.GOval;
import acm.graphics.GRect;

public class RobotFace extends GraphicsProgram {
 
	private static final double head_width = 200;
	
	private static final double head_height = 300;
	
	private static final double eye_radius = 30;
	
	private static final double mouth_width = 150;
	
	private static final double mouth_height = 50;
	
	public void run() {
		drawHead();
		drawLefteye();
		drawRighteye();
		drawMouth(); 
	}
	
	private void drawHead() {
		GRect head = new GRect(getWidth()/2 - head_width/2, getHeight()/2 - head_height/2, head_width, head_height);
		head.setFilled(true);
		head.setFillColor(Color.gray);
		add(head);
	}
	
	private void drawLefteye() {
		GOval lefteye = new GOval(getWidth()/2 - head_width/4 - eye_radius, getHeight()/2 - head_height/4 - eye_radius, eye_radius*2, eye_radius*2);
		lefteye.setColor(Color.yellow);
		lefteye.setFilled(true);
		lefteye.setFillColor(Color.yellow);
		add(lefteye);
	}
	
	private void drawRighteye() {
		GOval righteye = new GOval(getWidth()/2 + head_width/4 - eye_radius, getHeight()/2 - head_height/4 - eye_radius, eye_radius*2, eye_radius*2);
		righteye.setColor(Color.yellow);
		righteye.setFilled(true);
		righteye.setFillColor(Color.yellow);
		add(righteye);
	}
	
	private void drawMouth() {
		GRect mouth = new GRect(getWidth()/2 - mouth_width/2, getHeight()/2 + head_height/4 - mouth_height/2, mouth_width, mouth_height);
		mouth.setColor(Color.white);
		mouth.setFilled(true);
		mouth.setFillColor(Color.white);
		add(mouth);
	}
}