/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifestagio.model;

/**
 *
 * @author ifnmg
 */
public class Curso {

    private long id;
    private String nome;
    private int cargaHoarariaDeEstagio; 

    public int getCargaHoarariaDeEstagio() {
        return cargaHoarariaDeEstagio;
    }

    public void setCargaHoarariaDeEstagio(int cargaHoarariaDeEstagio) {
        this.cargaHoarariaDeEstagio = cargaHoarariaDeEstagio;
    }

    public Curso() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
