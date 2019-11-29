/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class CopiarImaxe {
    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "prueba.jpg");
    File f2 = new File(ruta, "prueba2.jpg");

    public void copiar() throws FileNotFoundException, IOException {

        FileInputStream fileinput = new FileInputStream(f);
        FileOutputStream fileoutput = new FileOutputStream(f2);
        BufferedInputStream bis = new BufferedInputStream(fileinput);
        BufferedOutputStream bos = new BufferedOutputStream(fileoutput);
        byte foto;

        int valor ;//= bis.read();
        if (!f2.exists()) {
            f2.createNewFile();

        } else {
            

            System.out.println("O arquivo existe");
        }
        do{
            valor = bis.read();
            bos.write(valor);
        
        }while(bis.available() > 0);

        fileinput.close();
        fileoutput.close();
        bis.close();
        bos.close();
        System.out.println("Arquivo copiado");

    }
    
}
