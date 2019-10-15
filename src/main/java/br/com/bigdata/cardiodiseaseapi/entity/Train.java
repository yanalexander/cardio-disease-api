package br.com.bigdata.cardiodiseaseapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "train")
public class Train {

    @Id
    private String id;

    private Double accuracy;

    private InductorEnum inductor;

    private Date createdAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public InductorEnum getInductor() {
        return inductor;
    }

    public void setInductor(InductorEnum inductor) {
        this.inductor = inductor;
    }
}
