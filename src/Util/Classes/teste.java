/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

public class teste {

    public static void main(String[] args) {
        Conexao con = new Conexao();
        if (con.getConexao("192.168.1.3", "oftaldb", "root", "1234") != null) {
            System.out.println("conectou");
        }else
        {
            System.out.println("erro");
        }
    }
}
