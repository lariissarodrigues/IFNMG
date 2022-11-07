/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifestagio.dao;

import ifestagio.model.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ifnmg
 */
public class EnderecoDAOList implements EnderecoDAO {

    private static ArrayList<Endereco> enderecos = new ArrayList(); //Criando uma lista para armazenar o endereço. 
    private long id = 0;

    @Override
    public void salvar(Endereco endereco) {
        if (endereco.getId() == 0) {
            //olhando para ver se tem um endereço registrado
            id++;
            endereco.setId(id);
            enderecos.add(endereco);
        } else {
        }

    }

    @Override
    public Endereco get(long idEndereco) {

        for (Endereco enderecoTemporario : enderecos) {
            if (enderecoTemporario.getId() == idEndereco) {
                return enderecoTemporario;
            }

        }

        return null;

    }

    @Override
    public void remover(long idEndereco) {

        //Percorrendo a lista e olhando se o parametro passado pertence a algum endereço
        for (Endereco enderecoTemporario : enderecos) {
            if (enderecoTemporario.getId() == idEndereco) {
                enderecos.remove(enderecoTemporario); //removendo o endereço da lista
                return;

            } else {
                System.out.println("endereço não encontrado");
            }
        }

    }
    
    @Override
    public List<Endereco> getTodos(){
       return enderecos; 
    }

}
