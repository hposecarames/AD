/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class CopiarUTF {

    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "texto.txt");
    File f2 = new File(ruta, "texto2.txt");

    public void copiar() throws FileNotFoundException, IOException {

        FileInputStream fileinput = new FileInputStream(f2);
        FileOutputStream fileoutput = new FileOutputStream(f2);
        BufferedInputStream bis = new BufferedInputStream(fileinput);
        BufferedOutputStream bos = new BufferedOutputStream(fileoutput);
        DataInputStream dis = new DataInputStream(bis);
        DataOutputStream dos = new DataOutputStream(bos);
        String cadena;

        if (!f2.exists()) {
            f2.createNewFile();

        } else {

            System.out.println("O arquivo existe");
        }

        cadena = dis.readUTF();

        dos.writeUTF(cadena);

        dis.close();
        dos.close();

        bis.close();
        bos.close();

        fileinput.close();
        fileoutput.close();
        System.out.println("Arquivo copiado");

    }

}
