package br.com.company.screenmatch.calculation;

import br.com.company.screenmatch.model.Movie;

public class ClassificationFilter {
    private String recommendation;

    public void filters(Classifiable classifiable){
        if (classifiable.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        } else if (classifiable.getClassificacao() >= 2) {
            System.out.println("Pode ser bom!");
        } else {
            System.out.println("Talvez outra hora!");
        }
    }
}
