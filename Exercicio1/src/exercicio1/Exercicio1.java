
package exercicio1;

import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CrearArquivos obx = new CrearArquivos();
        obx.crearRuta();
        obx.crearArquivo();
        obx.comprobarExistencia();
        obx.crearSub();
        obx.listar();
        obx.mostrarRuta();
        obx.mostrarDatos();
        obx.lectura();
        obx.escritura();
    }
    
    
}
