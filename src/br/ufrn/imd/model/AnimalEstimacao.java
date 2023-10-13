package br.ufrn.imd.model;

public class AnimalEstimacao {
    private static int proximoId = 0;

    private int id;
    private String nome;
    private Especie especie;

    public AnimalEstimacao() {}

    public AnimalEstimacao(String nome, Especie especie) {
        this.id = proximoId++;
        this.nome = nome;
        this.especie = especie;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome(){
          return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especie getEspecie() {
        return especie;
    }
}