/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapetime;

/**
 *
 * Utils class
 */
public class Utils
{
    void zoom(Zoomable[] arr) throws Zoomable.IllegalOperationException
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i].zoomIn();
            }
            else
            {
                arr[i].zoomOut();
            }
        }
    }
    
}
