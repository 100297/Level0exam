
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class exam_2 {
public static void main(String[] args) {
String age =	JOptionPane.showInputDialog("how old are you");
int a = Integer.parseInt(age);
int d = Integer.parseInt(age);
int l = 2016 - a;
int x = l - 1;
JOptionPane.showMessageDialog(null, "You were born on the year " + l + " or " + x);
if (d > 29) {
JOptionPane.showMessageDialog(null, "You are too old to play this game");	


}
}



}














