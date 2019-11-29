package exercicio6;

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
public class UtfChar {

    File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
    File f = new File(ruta, "texto5.txt");

    public void copiar() throws FileNotFoundException, IOException {
        f.createNewFile();

        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
        String cadea = "Está en casa";
        String cadea2 = "";

        dos.writeUTF(cadea);

        dos.writeChars(cadea);
        dos.writeUTF(cadea);
        dos.close();

        cadea2 = dis.readUTF();
        System.out.println(cadea2);

    }
}
