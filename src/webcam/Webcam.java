/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcam;

/**
 *
 * @author ahmed
 */
public class Webcam {

     public static void main(String args[]) {
      

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WebCamForm().setVisible(true);
            }
        });
    }
    
}
