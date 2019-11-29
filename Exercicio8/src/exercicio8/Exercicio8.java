/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product producto = new Product();
        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        Double[] prezo = {3.0, 4.0, 5.0};
        File ruta = new File("/home/oracle/NetBeansProjects/copia2/");
        File f = new File(ruta, "texto8.txt");
        try {
            PrintWriter grabar = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            BufferedReader ler = new BufferedReader(new FileReader(f));
            
            for(int i =0;i<prezo.length;i++){
                grabar.print(cod[i]+"\t");
                grabar.print(desc[i]+"\t");
                grabar.print(prezo[i]+"\t");
                grabar.print("\n");
            }
            grabar.close();
            String cadenaLeida;
            String[] lista;
            
            while((cadenaLeida = ler.readLine())!=null){
                
                lista = cadenaLeida.split("\t");
                producto.setCodigo(lista[0]);
                producto.setDescripcion(lista[1]);
                producto.setPrezo(Double.parseDouble(lista[2]));
                System.out.println(producto.toString());
            
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Exercicio8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
