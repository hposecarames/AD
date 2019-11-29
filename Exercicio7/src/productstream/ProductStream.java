/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class ProductStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Product po1 = new Product("cod1", "parafusos", 3.0);
        Product po2 = new Product("cod2", "cravos", 4.0);
        Product po3 = new Product();

        File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
        File f = new File(ruta, "productos.txt");

        try {
            f.createNewFile();
            DataInputStream ler = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
            DataOutputStream escribir = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));

            escribir.writeUTF(po1.getCodigo());
            escribir.writeUTF(po1.getDescripcion());
            escribir.writeDouble(po1.getPrezo());
            escribir.writeUTF(po2.getCodigo());
            escribir.writeUTF(po2.getDescripcion());
            escribir.writeDouble(po2.getPrezo());
            escribir.close();

            while (ler.available() > 0) {
                
                po3.setCodigo(ler.readUTF());
                po3.setDescripcion(ler.readUTF());
                po3.setPrezo(ler.readDouble());
                
                System.out.println(po3.getCodigo() + ", " + po3.getDescripcion() + ", " + po3.getPrezo());
            }
            ler.close();
        } catch (IOException ex) {
            Logger.getLogger(ProductStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
