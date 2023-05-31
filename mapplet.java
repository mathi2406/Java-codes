import java.applet.*;
import java.awt.*;
public class mapplet extends Applet {
 
 public void paint(Graphics g) {
 //for rectangle
  g.setColor(Color.red);
  g.drawRect(40,120,180,180);
//for circle
g.setColor(new Color(153,102,0));
g.drawOval(90,170,70,70);
//fill circle
g.setColor(new Color(255,204,0));
g.fillOval(91,171,69,69);
//drawing lines
g.setColor(Color.yellow);
g.drawLine(210,50,200,200);
g.setColor(Color.red);
g.drawLine(210,45,210,220);
 }
}
/* <applet code="mapplet" width="400" height="300">
   </applet>
*/
 