/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class ReadWrite {
    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "texto10.txt");
    File f2 = new File(ruta, "texto11.txt");
    public void lerGrabar() throws FileNotFoundException, IOException{
    
    FileReader ler = new FileReader(f);
    FileWriter grabar = new FileWriter(f2);
    int caracter;
    
    while((caracter = ler.read())!=-1){
   
    
    grabar.write(caracter);
    }
    ler.close();
    grabar.close();
    }
    
    
}
