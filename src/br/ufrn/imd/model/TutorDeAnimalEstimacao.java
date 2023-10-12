package br.ufrn.imd.model;

import java.util.ArrayList;
import java.util.List;

public class TutorDeAnimalEstimacao extends Usuario {
    private List<AnimalEstimacao> animaisEstimacao;

    public TutorDeAnimalEstimacao(String nome) {
        super(nome);
        this.animaisEstimacao = new ArrayList<AnimalEstimacao>();
    }

    public TutorDeAnimalEstimacao(String nome, List<AnimalEstimacao> animaisEstimacao) {
        super(nome);
        this.animaisEstimacao = animaisEstimacao;
    }

    @Override
    public String toString() {
        return String.format("Tutor de Animal de Estimação %d - %s", getId(), getNome());
    }

    public List<AnimalEstimacao> getAnimaisEstimacao() {
        return this.animaisEstimacao;
    }

    public void adicionarAnimalEstimacao(AnimalEstimacao animal) {
        this.animaisEstimacao.add(animal);
    }

    public boolean removerAnimalEstimacao(AnimalEstimacao animal) {
        return this.animaisEstimacao.remove(animal);
    }
}
