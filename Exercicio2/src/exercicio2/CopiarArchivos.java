/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class CopiarArchivos {

    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "prueba.jpg");
    File f2 = new File(ruta, "prueba2.jpg");

    public void copiar() throws FileNotFoundException, IOException {

        FileInputStream fileinput = new FileInputStream(f);
        FileOutputStream fileoutput = new FileOutputStream(f2);

        int valor = fileinput.read();
        if (!f2.exists()) {
            f2.createNewFile();

        } else {

            System.out.println("O arquivo existe");
        }
        while (valor != -1) {

            fileoutput.write(valor);
            valor= fileinput.read();
        }
        fileinput.close();
        fileoutput.close();
        System.out.println("Arquivo copiado");

    }

}
