/* 
  Welcome to DrJava.  Working directory is C:\Users\dgerman\Desktop\no-zoom
  > java What
  3(94, 0)
  -1(366, 0)
  2(278, 0)
  > java What 
  3(432, 0) 
  -1(162, 0) 
  2(304, 0)  
 */
public class What {
  int x, y; 
  int value; 
  What next; 
  public What(int value, What next) {
    this.value = value; 
    this.next = next;
    this.x = (int)(Math.random() * 500 + 50); 
    this.x = (int)(Math.random() * 500 + 50); 
  }
  public String toString() {
    return this.value + "(" + this.x + ", " + this.y + ")"; 
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