package br.com.company.screenmatch.calculation;

public class ClassificationFilter {
    private String recommendation;

    public void filters(Classifiable classifiable){
        if (classifiable.getClassification() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Pode ser bom!");
        } else {
            System.out.println("Talvez outra hora!");
        }
    }
}
