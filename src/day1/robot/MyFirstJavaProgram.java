package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot pauBot = new Robot ();
for (int i = 0; i < 4; i++); {
	pauBot.penDown();
	pauBot.move(100);
	pauBot.turn(90);
}
}
}