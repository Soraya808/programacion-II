
package ejer1;
import java.awt.*;
import javax.swing.*;
 class Punto{
    float x;
    float y;
    public Punto(float x, float y){
    this.x=x;
    this.y=y;
    }
}
public class Linea extends JPanel{
Punto p1,p2;

public 
        Linea(Punto a,Punto b ){
            this.p1=a;
            this.p2=b;
            setPreferredSize(new Dimension(400,400));
        }  
        Linea(Punto b){
            this.p1=b;
           
        }
        Punto obtp1(){
            return p1;
        }
      Punto obtp2(){
            return p2;
        }
          public String toString() {
        return "Punto(x=" + p1 + ", y=" +p2 + ")";
    }
        public void paint(Graphics g) {
        super.paint(g);
        // Dibuja la línea con color negro
        g.setColor(Color.BLUE);
       g.drawLine( 50, 50,200,150);
    }
        public void dibujaLinea(){
            JFrame ventana = new JFrame("Dibujar");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(this);
        ventana.pack();
        ventana.setVisible(true);}
public static void main(String[] args) {
       Punto p1=new Punto(5,5);
       Punto p2=new Punto(3,3);
       Linea recta=new Linea(p1,p2);
       recta.dibujaLinea();

}}


