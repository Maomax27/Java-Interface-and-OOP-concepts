/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package final_exam;

/**
 *Zoomable interface
 */
public interface Zoomable 
{

      void zoomIn();

      void zoomOut() throws IllegalOperationException;

    public static class IllegalOperationException extends Exception 
    {

        public IllegalOperationException() 
        {
           
        }
    }

}
