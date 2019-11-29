/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Produto {

    //para conectar co native protocal all java driver: creamos un obxecto Connection usando o metodo getConnection da clase  DriverManager            
    String codigo;
    String descricion;
    int prezo;
    
    public Produto(String codigo, String nome, int prezo) {
        this.codigo = codigo;
        this.descricion = nome;
        this.prezo = prezo;
    }
    
    public Produto() {
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricion() {
        return descricion;
    }
    
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }
    
    public int getPrezo() {
        return prezo;
    }
    
    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricion=" + descricion + ", prezo=" + prezo + '}';
    }
    
    Connection conexion() throws SQLException {
        String driver = "jdbc:oracle:thin:";
        String host = "localhost.localdomain"; // tambien puede ser una ip como "192.168.1.14"
        String porto = "1521";
        String sid = "orcl";
        String usuario = "hr";
        String password = "hr";
        String url = driver + usuario + "/" + password + "@" + host + ":" + porto + ":" + sid;
        Connection conn = null;
        try {            
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public void insireProduto(String codigo, String descricion, int prezo) throws SQLException {
        Connection conn = this.conexion();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO produtos(codigo, descricion, prezo)VALUES(?,?,?)");
        stmt.setString(1, codigo);
        stmt.setString(2, descricion);
        stmt.setInt(3, prezo);
        stmt.execute();
        stmt.close();
        
    }
    
    public void listaProductos() throws SQLException {
        Connection conn = this.conexion();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM produtos");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Produto pr = new Produto();
            pr.setCodigo(rs.getString("codigo"));
            pr.setDescricion(rs.getString("descricion"));
            pr.setPrezo(rs.getInt("prezo"));
            System.out.println(pr);
        }
        rs.close();
        stmt.close();
        
    }
    
    public void actualizaPre(String codigo, int prezo) throws SQLException {
        Connection conn = this.conexion();
        PreparedStatement stmt = conn.prepareStatement("UPDATE produtos SET prezo = ?"
                + "WHERE codigo = ?");
        
        stmt.setInt(1, prezo);
        stmt.setString(2, codigo);
        stmt.execute();
        stmt.close();
        
    }
    
    public void borrarFila(String codigo) throws SQLException {
        Connection conn = this.conexion();
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM produtos where codigo = ?");
        stmt.setString(1, codigo);
        stmt.execute();
        stmt.close();
    }
    
    public void amosarFila(String codigo) throws SQLException{
        Connection conn = this.conexion();
        PreparedStatement stmt = conn.prepareStatement("SELECT codigo, descricion, prezo FROM produtos WHERE codigo = ?");
        stmt.setString(1, codigo);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            Produto pr = new Produto();
            pr.setCodigo(rs.getString("codigo"));
            pr.setDescricion(rs.getString("descricion"));
            pr.setPrezo(rs.getInt("prezo"));
            System.out.println(pr);
        }
    }
}
