package br.ufrn.imd.model;

public class Cao extends AnimalEstimacao{
    public Cao(String nome) {
        super(nome, Especie.CAO);
    }

    @Override
    public String toString() {
        return String.format("Cão %d - %s", getId(), getNome());
    }
}
