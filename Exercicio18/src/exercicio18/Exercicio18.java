
package exercicio18;

import java.sql.SQLException;

/**
 *
 * @author oracle
 */
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Produto pro = new Produto();
        
        pro.insireProduto("p1", "parafusos", 3);
        pro.insireProduto("p2", "cravos", 4);
        pro.insireProduto("p3", "tachas", 6);
        pro.listaProductos();
        pro.actualizaPre("p3", 5);
        pro.borrarFila("p1");
        pro.amosarFila("p3");
    }
    
}
