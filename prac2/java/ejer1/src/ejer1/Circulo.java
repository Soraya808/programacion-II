package ejer1;import java.awt.*;
import javax.swing.*;
class Punto{
    float x;
    float y;
    public Punto(float x, float y){
    this.x=x;
    this.y=y;
    }

}
public class Circulo extends JPanel{
Punto centro;
public float radio;
public 
        Circulo(Punto a, float b){
            centro=a;
            radio=b;
             setPreferredSize(new Dimension(500,500));
        
        }
        Circulo(Punto b ){
            centro=b;
        }
       Punto obtp1(){
            return centro;
        }
        float obtradio(){
            return radio;
        }
@Override
        public void paint(Graphics g) {
        super.paint(g);
        // Dibuja la línea con color nuevo
        g.setColor(new Color(30, 237, 97));
       g.drawOval(300,200, 100*2,100 *2);
    }
         public String toString() {
            return "Punto(centro=" + centro + ", x1=" + radio +  ")";
          }
        
        public void dibujaCirculo(){
            JFrame ventana = new JFrame("Dibujar");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(this);
        ventana.pack();
        ventana.setVisible(true);}
    public static void main(String[] args) {
       Punto centro = new Punto(2, 2);
        int radio = 5;
        Circulo circulo = new Circulo(centro, radio);
        circulo.dibujaCirculo(); 
}}
   