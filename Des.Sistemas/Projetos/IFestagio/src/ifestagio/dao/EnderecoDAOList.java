/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifestagio.dao;

import ifestagio.model.Endereco;
import java.util.ArrayList;

/**
 *
 * @author ifnmg
 */
public class EnderecoDAOList implements EnderecoDAO {
    
    private static ArrayList <Endereco> enderecos = new ArrayList(); 
    private long id = 0; 

    @Override
    public void salvar(Endereco endereco) {
        if(endereco.getId() == 0){
            //olhando para ver se tem um endereço registrado
            id++; 
            endereco.setId(id); 
            enderecos.add(endereco); 
        }
        else{ }
        
    }

    @Override
    public Endereco get(long idEndereco) {
        
        return null;  

    }

    @Override
    public void remover(long idEndereco) {
     
    }
    
    
    
}
