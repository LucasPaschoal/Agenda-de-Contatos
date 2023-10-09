/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.dao;

import java.util.List;

/**
 *
 * @author lucas
 */
public interface InterfaceDao<T> {
    
    public abstract void incluir(T entidade) throws Exception;
    
    public abstract void editar(T entidade) throws Exception;
    
    public abstract void excluir(T entidade) throws Exception;
    
    public abstract T pesquisarPorId(int id) throws Exception;
    
    public abstract  List<T> litar() throws Exception;
    
}
