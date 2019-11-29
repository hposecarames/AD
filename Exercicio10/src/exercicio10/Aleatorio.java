/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 *
 * @author oracle
 */
public class Aleatorio {
    
    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "texto12.txt");
    String [] codes = {"p1", "p2", "p3"};
    String [] descripcion = {"parafusos", "cravos", "tachas"};
    int [] prices = {3, 4, 5};
    String codigo;
    String descrip;
    
    public void grabarCodes() throws FileNotFoundException, IOException{
    
        try (RandomAccessFile fichero = new RandomAccessFile(f, "rw")) {
         
            for (int i =0; i<3;i++){
                
                codigo = codes[i];
                descrip = descripcion[i];
                
                fichero.writeChars(codigo);
                fichero.writeChars(descrip);
                
            }
            
            
            
            fichero.close();
            
        }
    }
    
    public void leerCodes(){
        
    }
}
