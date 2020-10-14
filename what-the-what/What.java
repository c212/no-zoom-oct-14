import java.awt.Graphics; 
import java.awt.Color; 

public class What {
  static int radius = 20; 
  int x, y; 
  int value; 
  What next; 
  public What(int value, What next) {
    this.value = value; 
    this.next = next;
    this.x = (int)(Math.random() * 500 + 50); 
    this.y = (int)(Math.random() * 500 + 50); 
  }
  public What(int value) {
    this(value, null); 
  }
  public boolean contains(int x, int y) {
    return Math.abs(this.x - x) <= What.radius * 2 &&
           Math.abs(this.y - y) <= What.radius * 2;
  }
  public void draw(Graphics g) {
    g.setColor(Color.WHITE); 
    g.fillOval(this.x, this.y, 2 * What.radius, 2 * What.radius); 
    g.setColor(Color.BLACK); 
    g.drawOval(this.x, this.y, 2 * What.radius, 2 * What.radius); 
    g.drawString("" + this.value, this.x + What.radius, this.y + What.radius); 
  }
  public static void main(String[] args) {
    What a, b, c; 
    a = new What( 3, null); 
    b = new What(-1, null); 
    c = new What( 2, null); 
    System.out.println( a ); 
    System.out.println( b ); 
    System.out.println( c ); 
  }
}