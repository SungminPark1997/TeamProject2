package kr.ac.mju.k1.k1chellin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoodCf() {
        return foodCf;
    }

    public void setFoodCf(String foodCf) {
        this.foodCf = foodCf;
    }

    @Id
    private Long id;
    private String name;
    private String party;
    private String region;
    private String storeName;
    private String address;
    private String foodCf;
}
