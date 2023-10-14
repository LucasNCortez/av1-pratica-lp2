package br.ufrn.imd.model;

public class Especialidade {
  private static int proximoId = 0;

  private int id;
  private String nome;

  @Override
  public String toString() {
    return String.format("Especialidade %d - %s", getId(), getNome());
  }

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