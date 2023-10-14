package br.ufrn.imd.model;

public class Coelho extends AnimalEstimacao {
    public Coelho(String nome) {
        super(nome, Especie.COELHO);
    }

    @Override
    public String toString() {
        return String.format("Coelho %d - %s", getId(), getNome());
    }
}
