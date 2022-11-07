/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ifestagio.dao;

import ifestagio.model.Endereco;
import java.util.List; 

/**
 *
 * @author ifnmg
 */
public interface EnderecoDAO {
    
    void salvar(Endereco endereco); 
    Endereco get(long idEndereco); 
    void remover(long idEndereco); 
    List <Endereco> getTodos(); 
    
}
