package br.ufrn.imd.model;

public class Vendedor extends Usuario {
    public Vendedor(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return String.format("Vendedor %d - %s", getId(), getNome());
    }
}
