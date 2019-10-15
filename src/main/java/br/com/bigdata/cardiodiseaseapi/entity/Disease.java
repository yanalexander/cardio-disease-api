package br.com.bigdata.cardiodiseaseapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "disease")
public class Disease {

    @Id
    private String id;

    private Long age;

    private Integer gender;

    private Double weight;

    private Integer ap_hi;

    private Integer ap_lo;

    //1: normal, 2: above normal, 3: well above normal
    private Integer cholesterol;

    //1: normal, 2: above normal, 3: well above normal
    private Integer gluc;

    //whether patient smokes or not
    private Integer smoke;

    private Integer alco;

    private Integer active;

    private Integer cardio;

    public Disease(String id, Long age, Integer gender, Double weight, Integer ap_hi, Integer ap_lo, Integer cholesterol, Integer gluc, Integer smoke, Integer alco, Integer active, Integer cardio) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.ap_hi = ap_hi;
        this.ap_lo = ap_lo;
        this.cholesterol = cholesterol;
        this.gluc = gluc;
        this.smoke = smoke;
        this.alco = alco;
        this.active = active;
        this.cardio = cardio;
    }

    public Disease() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAp_hi() {
        return ap_hi;
    }

    public void setAp_hi(Integer ap_hi) {
        this.ap_hi = ap_hi;
    }

    public Integer getAp_lo() {
        return ap_lo;
    }

    public void setAp_lo(Integer ap_lo) {
        this.ap_lo = ap_lo;
    }

    public Integer getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Integer cholesterol) {
        this.cholesterol = cholesterol;
    }

    public Integer getGluc() {
        return gluc;
    }

    public void setGluc(Integer gluc) {
        this.gluc = gluc;
    }

    public Integer getSmoke() {
        return smoke;
    }

    public void setSmoke(Integer smoke) {
        this.smoke = smoke;
    }

    public Integer getAlco() {
        return alco;
    }

    public void setAlco(Integer alco) {
        this.alco = alco;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCardio() {
        return cardio;
    }

    public void setCardio(Integer cardio) {
        this.cardio = cardio;
    }
}
