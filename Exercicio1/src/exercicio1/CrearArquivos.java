/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author oracle
 */
public class CrearArquivos {

    //File f = new File("Products1.txt");
    File ruta = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
    File f = new File(ruta,"Products1.txt");
    File subdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
    
    public void crearRuta() throws IOException {

        if (!ruta.exists()) {
            ruta.mkdirs();
            System.out.println("1- Ruta creada");
        } else {
            System.out.println("1- A ruta xa existe");
        }
    }
    
    public void crearArquivo() throws IOException{
    
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("2- Arquivo creado");
                        
        }else{
            System.out.println("2- O arquivo xa existe");
        }
    }
    
    public void comprobarExistencia(){
        
        if(ruta.exists()){
            System.out.println("3- A ruta existe");
        }else{
            System.out.println("3- Ruta non encontrada");
        }
        if(f.exists()){
            System.out.println("3- O arquivo existe");
        }else{
            System.out.println("3- Arquivo non encontrado");
        }
    }
    
    public void crearSub(){
        
        if(!subdir.exists()){
            subdir.mkdir();
            System.out.println("4-Directorio creado");
        }else{
            System.out.println("4- Xa existe o directorio");
        }
    }
    
    public void listar(){
        
        System.out.println("5- " + Arrays.toString(ruta.list()));
    }
    
    public void mostrarRuta(){
        
        System.out.println("6- " + ruta.getPath());
    }
    
    public void mostrarDatos(){
        
        System.out.println("7- Nome: " + f.getName());
        System.out.println("7- Ruta: " + f.getPath());
        if (f.canWrite()){
            System.out.println("7- Pódese escreibir no arquivo");
        }else{
            System.out.println("7- Non se pode escribir no arquivo");
        }
        
        if (f.canRead()){
            System.out.println("7- Pódese ler o arquivo");
        }else{
            System.out.println("7- Non se pode ler o arquivo");
        }
        
        System.out.println("7- Lonxitude en bytes: " + f.length());
    }
    
    public void lectura(){
        
        f.setReadOnly();
        if (f.canWrite()){
            System.out.println("8- Pódese escribir no arquivo");           
        }else{
            System.out.println("8- Non se pode escribir no arquivo");
        }
    }  
    
    public void escritura(){
        
        f.setWritable(true);
        if(f.canWrite()){
            System.out.println("9- Pódese escribir no arquivo");
        }else{
            System.out.println("9- Non se pode ler do arquivo");
        }
        
    }
}
