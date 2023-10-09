/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import Model.dao.ContatoDaoJDBC;
import Model.dao.DaoFectory;
import java.util.List;
import javax.swing.JOptionPane;
import model.Contato;

/**
 *
 * @author lucas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            ContatoDaoJDBC dao = DaoFectory.novoContatoDao();
            List<Contato> lista = dao.litar();
            
            for(Contato contato: lista){
                System.out.println(contato);
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
