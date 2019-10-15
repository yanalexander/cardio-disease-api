package br.com.bigdata.cardiodiseaseapi.entity;

public enum InductorEnum {

    DECISION_TREE("Decision Tree"),
    LOGISTIC_REGRESSION("Logistic Regression"),
    NEURAL_NETWORK("Neural Network"),
    RANDOM_FOREST("Random Forest"),
    SVM("Suport Vector Machine");

    private String description;

    InductorEnum(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
