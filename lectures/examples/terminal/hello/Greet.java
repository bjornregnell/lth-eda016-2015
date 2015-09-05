package greeting;

import se.lth.cs.pt.window.SimpleWindow;
import java.awt.Color;

/** 
* A collection of greeting methods.
*/
public class Greet {

    /**
    * Asks for a name and then greets politely.
    */
    public static void swingGreeting(){
        String name = javax.swing.JOptionPane.showInputDialog("What name?");
        javax.swing.JOptionPane.showMessageDialog(null, "Hello " + name);
    }
    
    /**
    * Greeting of pink creature. Allows user to spam click but not too far down. 
    * Each click is awarded one point.
    *    
    * @param   color    the color of the greeting
    * @return           the number of points earned
    */
    public static int panterGreeting(Color color){
        SimpleWindow w = new SimpleWindow(200, 200, "App");
        w.setLineColor(color);
        w.moveTo(100,100);
        w.writeText("Hello Pink Panter!");
        int points = 0;
        while (w.getMouseY() < 180) {
          w.waitForMouseClick();
          points = points + 1;  //earn a point for each click
          w.lineTo(w.getMouseX(), w.getMouseY());
          w.writeText("Your hello-points: " + points);
        }
        return points;
    }
}