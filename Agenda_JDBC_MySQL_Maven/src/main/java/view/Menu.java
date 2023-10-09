/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import Model.dao.ContatoDaoJDBC;
import Model.dao.DaoFectory;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Contato;

/**
 *
 * @author lucas
 */
public class Menu {

    private static ContatoDaoJDBC dao;

    public static void main(String[] args) {

        try {
            dao = DaoFectory.novoContatoDao();

            int opcao = -1;

            while (opcao != 0) {

                String menu = "Agenda de contatos\n"
                        + "------------------\n"
                        + "1.Inclusão\n"
                        + "2.Edição\n"
                        + "3.Exclusão\n"
                        + "4.Litagem\n"
                        + "0.sair\n"
                        + "------------------\n"
                        + "Digite uma opção: \n";

                opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));

                switch (opcao) {
                    case 1:
                        incluir();
                        break;
                    case 2:
                        editar();
                        break;

                    case 3:
                        excluir();
                        break;

                    case 4:
                        listar();
                        break;
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void incluir() throws Exception{
        String nome = JOptionPane.showInputDialog("Nome:");
        String email = JOptionPane.showInputDialog("Email:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        
        Contato c = new Contato(nome, email, telefone);
        dao.incluir(c);

    }
    
    public static void excluir() throws Exception{
        String id = JOptionPane.showInputDialog("ID do contato:");
        
        Contato c = new Contato();
        c.setId(Integer.parseInt(id));
        dao.excluir(c);
        
    }
    
    public static void editar() throws Exception{
        String id = JOptionPane.showInputDialog("ID do contato:");
        String nome = JOptionPane.showInputDialog("Nome:");
        String email = JOptionPane.showInputDialog("Email:");
        String telefone = JOptionPane.showInputDialog("Telefone:");
        
        Contato c = new Contato(nome, email, telefone);
        c.setId(Integer.parseInt(id));
        dao.editar(c);

    }
    
    public static void listar() throws Exception{
        List<Contato> lista = new ArrayList();
        lista = dao.litar();
        String contatos = "";
        for(Contato c : lista){
            contatos += c + "\n";
        }
        JOptionPane.showMessageDialog(null, contatos);

    }
}
