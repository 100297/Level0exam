
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class eggxam {

    public static void main(String[] args) {
   	Robot x = new Robot();
    	
   String color = JOptionPane.showInputDialog("What color do you want the robot to draw"); 	
   x.penDown();
   if(color.equals("black")) {   	
	 x.setPenColor(0,0,0);
 } else if(color.equals("white")) {
	 x.setPenColor(255,255,255);
	 }else if (color.equals("yellow")) {
		 x.setPenColor(255,255,0);
	 }
	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

   	 // 2. set the pen width to 10
x.setPenWidth(10);
   	
   	 x.move(100);
   	 x.turn(90);
   	x.move(100);
  	 x.turn(90);
  	x.move(100);
  	 x.turn(90);
  	x.move(100);
  	 x.turn(90);
    }

}
