package br.ufrn.imd.model;

public class Rato extends AnimalEstimacao{
    public Rato(String nome) {
        super(nome, Especie.RATO);
    }

    @Override
    public String toString() {
        return String.format("Rato %d - %s", getId(), getNome());
    }
}
