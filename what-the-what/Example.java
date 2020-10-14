import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Example extends JComponent 
                     implements MouseMotionListener, MouseListener {
  public void mouseMoved(MouseEvent e) { } 
  public void mouseDragged(MouseEvent e) { 
    System.out.println( this.current ); 
    this.current.moveTo(e.getX(), e.getY()); 
    this.repaint(); 
  } 
  public void mouseEntered(MouseEvent e) { } 
  public void mouseExited(MouseEvent e) { } 
  public void mousePressed(MouseEvent e) { 
    this.current = this.a; 
    int x = e.getX(), y = e.getY(); 
    while (current != null && ! current.contains(x, y)) {
      this.current = this.current.next; 
    }
  } 
  public void mouseReleased(MouseEvent e) { 
    this.current = null; 
  } 
  public void mouseClicked(MouseEvent e) { } 
  What a, current;
  public Example() {
    a = new What(9, new What(2, new What(-3, new What(4))));    
    this.addMouseListener(this); 
    this.addMouseMotionListener(this);     
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