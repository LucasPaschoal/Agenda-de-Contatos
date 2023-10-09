/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.dao;

/**
 *
 * @author lucas
 */
public class DaoFectory {
    public static ContatoDaoJDBC novoContatoDao() throws Exception{
        return new ContatoDaoJDBC();    
    }
}
