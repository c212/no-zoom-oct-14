import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.awt.Graphics; 
import java.awt.Color;

public class Example extends JComponent {
  What a;
  public Example() {
    a = new What(9, new What(2, new What(-3, new What(4))));     
  }
  public static void main(String[] args) {
    JFrame a = new JFrame("no zoom today; what the what?");
    Example b = new Example(); 
    a.add(b); 
    a.setVisible(true); 
    a.setSize(600, 600); 
  }
  public void paintComponent(Graphics g) {
    What what = this.a;
    while (what != null) {
      what.draw(g); 
      if (what.next != null) { 
        g.setColor(Color.RED); 
        g.drawLine(what.x + What.radius, what.y + What.radius, 
                   what.next.x + What.radius, what.next.y + What.radius);
        g.setColor(Color.BLACK); 
      }
      what = what.next; 
    }
  }
}