/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1;
public class punto {
public float x;
public float y;
public 
        punto(float a, float b){
            x=a;
            y=b;
        }
        punto(float b){
            x=b;
            y=y;
        }
        float obtx(){
            return x;
        }
        float obty(){
            return y;
        }
        void coor_polares (){
            double l;
            int d=2;
            l=Math.sqrt(Math.pow(x, d)+(Math.pow(y, d)));
        }
        float obtangulo(){
        return (float) Math.toDegrees(Math.atan2(y,x));
    }     
          public String toString() {
        return "Punto(x=" + x + ", y=" + y + ")";
    }
    public static void main(String[] args) {
       punto p1=new punto(2,3);
       System.out.println(p1);
        System.out.println("Coordenadas Cartesianas: (x=" + p1.obtx() + ", y=" + p1.obty() + ")");
        System.out.println("Coordenadas Polares: (r=" + p1.obtangulo() + ", θ=" + p1.obtangulo() + "°)");
    
    }
    
}
