import java.awt.Graphics; 

public class What {
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
  public void draw(Graphics g) {
    g.drawOval(this.x, this.y, 60, 60); 
    g.drawString("" + this.value, this.x, this.y); 
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