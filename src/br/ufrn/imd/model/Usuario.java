package br.ufrn.imd.model;

public class Usuario {
    private static int proximoId = 0;

    private int id;
    private String nome;

    public Usuario(String nome) {
        this.id = proximoId++;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("Usuário %d - %s", this.id, this.nome);
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}