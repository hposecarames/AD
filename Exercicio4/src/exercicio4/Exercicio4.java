/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CopiarUTF obx = new CopiarUTF();
        try {
            obx.copiar();
        } catch (IOException ex) {
            
            System.out.println(ex);
            Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
