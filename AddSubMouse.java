//Program for adding and subtraction of a no. through MouseListener by moving a cursor to the result for adding and by releasing for subtraction 
import java.awt.*;
import java.awt.event.*;
class MyWindow implements MouseListener 
{
  Label l1,l2,l3;
  TextField t1,t2,t3;

  public void show()
   {
   
     Frame frame=new Frame();
     frame.setSize(300,300); // set size of the frame
     frame.setVisible(true); // making the visibility of the frame

     FlowLayout t=new FlowLayout();   // flowlayout for making a flow from left to right and top to bottom
     frame.setLayout(t);
     Label l1=new Label("First no");  // declaring label l1
     frame.add(l1);                   //add l1 to frame
     t1=new TextField(10);           // declaring textfield t1
     frame.add(t1);                   //add t1 to 
     Label l2=new Label("SECOND NO");   
     frame.add(l2);
     t2=new TextField(10);
     frame.add(t2);
     Label l3=new Label("result");
     frame.add(l3);
     t3=new TextField(10);
     frame.add(t3);
     t3.addMouseListener(this);    //adding mouselistner to t3 for the result 
 
   }

  public void mouseEntered(MouseEvent e)
   {
    int c = 0;
    String S1 = t1.getText();        // to changing the string into int 
    int a = Integer.parseInt(S1);
    String S2 = t2.getText();
    int b = Integer.parseInt(S2);
 
  
    c = a+b;      //condition of mouse entered do addition
  

    t3.setText(String.valueOf(c));
  }
  public void mouseExited(MouseEvent e)
  {
  int c = 0;
  String S1 = t1.getText();
  int a = Integer.parseInt(S1);
  String S2 = t2.getText();
  int b = Integer.parseInt(S2);

  c = a-b;         //condition of mouse exit do subtraction
  t3.setText(String.valueOf(c));
  }

  public void mouseClicked(MouseEvent e){}      //method of mouselistner
  public void mousePressed(MouseEvent e){}      //method of mouselistner
  public void mouseReleased(MouseEvent e){}      //method of mouselistner
}
public class AddSubMouse
{
  public static void main(String ar[])
   {
    MyWindow t = new MyWindow();
    t.show();
   }
}
