package br.ufrn.imd.model;

public class Gato extends AnimalEstimacao{
    public Gato(String nome) {
        super(nome, Especie.GATO);
    }

    @Override
    public String toString() {
        return String.format("Gato %d - %s", getId(), getNome());
    }
}
