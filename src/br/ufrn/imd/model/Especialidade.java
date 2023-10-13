package br.ufrn.imd.model;

public class Especialidade {
  private static int proximoId = 0;

  private int id;
  private String nome;

  public Especialidade(String nome) {
    this.id = proximoId++;
    this.nome = nome;
  }

  public int getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String newNome) {
    this.nome = newNome;
  }
}