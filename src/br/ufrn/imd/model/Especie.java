package br.ufrn.imd.model;

public enum Especie {
  CAO("Cão"), GATO("Gato"), COELHO("Coelho"), RATO("Rato");

  private String nome;

  Especie(String nome) {
    this.nome = nome;
  }

  public String getNome() {
      return this.nome;
  }
}
