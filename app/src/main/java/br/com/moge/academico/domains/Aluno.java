package br.com.moge.academico.domains;

import java.io.Serializable;

/**
 * Created by cd-107 on 31/01/2015.
 */
public class Aluno implements Serializable{

    private int id;
    private String nome;
    private String cpf;
    private String foto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
