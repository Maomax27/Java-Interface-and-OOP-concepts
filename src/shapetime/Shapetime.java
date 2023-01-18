/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapetime;

/**
 *
 * @author Mauricio Garzon Llanos
 * ID: 1172366
 */
public class Shapetime
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Zoomable.IllegalOperationException 
    {
        // TODO code application logic here
        /*
        initializing test shapes
        */
        Circle c1 = new Circle();
        c1.Circle(8, 0, 0);
        Circle c2 = new Circle();
        c2.Circle(10,4, 4);
        Rectangle r1 = new Rectangle();
        r1.Rectangle(6, 4, 7, 9);
        Rectangle r2 = new Rectangle();
        r2.Rectangle(8, 10, -3, -4);
        Zoomable []arr = new Zoomable[4];
        
        arr[0]=c1;
        arr[1] = c2;
        arr[2]=r1;
        arr[3]=r2;
        
        Utils testing = new Utils();//Utils to test
        testing.zoom(arr);
        
        System.out.println("c1 new size: "+ c1.getR());
        System.out.println("c2 new size: "+ c2.getR());
        System.out.println("r1 new size: Length:"+ r1.getLength()+ " Witdh: "+ r1.getWidth());
        System.out.println("r2 new size: Length:"+ r2.getLength()+ " Witdh: "+ r2.getWidth());
    }
    
}
