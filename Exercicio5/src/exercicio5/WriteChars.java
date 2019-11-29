/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author oracle
 */
public class WriteChars {

    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "texto4.txt");

    public void copiarChar() throws FileNotFoundException, IOException {

        f.createNewFile();

        FileInputStream fileinput = new FileInputStream(f);
        FileOutputStream fileoutput = new FileOutputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fileinput);
        BufferedOutputStream bos = new BufferedOutputStream(fileoutput);
        DataInputStream dis = new DataInputStream(bis);
        DataOutputStream dos = new DataOutputStream(bos);
        String cadena = "o tempo está xélido\n";
        int numero = cadena.length();
        char car;

        dos.writeChars(cadena);
        dos.writeChars(cadena);
        dos.close();
        while (dis.available() != 0) {

            car = dis.readChar();
            System.out.print(car);

        }

        dis.close();

        bis.close();
        bos.close();

        fileinput.close();
        fileoutput.close();
        System.out.println("Arquivo copiado");

    }
}
