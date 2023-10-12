package br.ufrn.imd.model;

import java.util.ArrayList;
import java.util.List;

public class PrestadorDeServicos extends Usuario {
    private List<Especialidade> especialidades;

    public PrestadorDeServicos(String nome) {
        super(nome);
        this.especialidades = new ArrayList<Especialidade>();
    }

    public PrestadorDeServicos(String nome, List<Especialidade> especialidades) {
        super(nome);
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return String.format("Prestador de Serviços %d - %s", getId(), getNome());
    }

    public List<Especialidade> getEspecialidades() {
        return this.especialidades;
    }

    public void adicionarEspecialidade(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public boolean removerEspecialidade(Especialidade especialidade) {
        return this.especialidades.remove(especialidade);
    }
}
