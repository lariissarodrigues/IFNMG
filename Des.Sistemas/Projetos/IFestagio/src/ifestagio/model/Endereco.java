/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifestagio.model;

/**
 *
 * @author ifnmg
 */
public class Endereco {

    private long id;

    private String logradoro;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco(long id, String logradoro, String bairro, String numero, String cidade, String estado, String cep, String complemento) {
        this.logradoro = logradoro;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
        
        this.id = id;
    }
    
    
    
    
    
    

    public long getId() {
        return id;
    }

    public String getLogradoro() {
        return logradoro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    

}
