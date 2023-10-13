package br.ufrn.imd.model;

public class Especialidade {
  private int id;
  private String nome;

  public int getId() {
    return this.id;
  }
  public void setId(int newId){
    this.id = newId;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String newNome) {
    this.nome = newNome;
  }
}