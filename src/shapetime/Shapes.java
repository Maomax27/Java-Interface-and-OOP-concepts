/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * shape parent class for Circle and Rectangle
 * Implememts interface Zoomable
 */
public abstract class Shapes implements Zoomable
{
    //xy position of shape
    int x;
    int y;
    abstract void setX(int x);
    abstract void setY(int y);
    @Override
    public abstract void zoomIn();
    @Override
    public abstract void zoomOut();
}
/*
Circle class
*/
class Circle extends Shapes
{
    private int r;
    
    void Circle(int r, int x, int y) 
    {
        setR(r);
        setX(x);
        setY(y);
    }
    void setR(int r)
    {
        if(r<0)
        {
            r=r*-1;
        }
        this.r =r;
    }
    @Override
    void setX(int x)
    {
        this.x = x;
    }
    @Override
    void setY(int y)
    {
        this.y = y;
    }
    
    int getR()
    {
       return this.r; 
    }
    
    @Override
    /**
     * doubles the size
     */
    public void zoomIn()
    {
        this.r = r*2;
    }
    @Override
    public void zoomOut()
    {
        if((r/2)<=0)
        {
            /*
            try-catch if size turns zero
            */
            try 
            {
                throw new IllegalOperationException();
            } 
            catch (IllegalOperationException ex) 
            {
                Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
        this.r = r/2;
        }
    }
}
/*
Rectangle class
*/
class Rectangle extends Shapes
{
    private int length;
    private int width;
    
    void Rectangle(int l,int w ,int x, int y) 
    {
        setLength(l);
        setWidth(w);
        setX(x);
        setY(y);
    }
    void setLength(int l)
    {
        if(l<0)
        {
            l = l*-1;
        }
        this.length =l;
    }
    void setWidth(int w)
    {
        if(w<0)
        {
            w= w*-1;
        }
        this.width = w;
    }
    @Override
    void setX(int x)
    {
        this.x = x;
    }
    @Override
    void setY(int y)
    {
        this.y = y;
    }
    int getLength()
    {
        return this.length;
    }
    int getWidth()
    {
        return this.width;
    }
    @Override
    /**
     * doubles the size
     */
    public void zoomIn()
    {
        this.length = length*2;
        this.width = width*2;
    }
    @Override
    public void zoomOut()
    {
        if((length/2)<=0||(width/2)<=0)
        {
            /*
            try-catch is size turns zero
            */
            try 
            {
                throw new IllegalOperationException();
            } 
            catch (IllegalOperationException ex) 
            {
                Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
        this.length = length/2;
        this.width = width/2;
        }
    }
}
