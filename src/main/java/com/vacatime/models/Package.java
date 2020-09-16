package com.vacatime.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "package")
public class Package {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name= "package_code")
    private String packageCode;

    @Column(name= "price")
    private String price;

    @Column (name= "destination_id")
    private int destinationId;

    @Column (name= "description_id")
    private int descriptionId;

    public Package() {
        super();
    }

    Package(String packagecode, String price, int destinationId, int descriptionId){
        super();
        this.packageCode = packagecode;
        this.price = price;
        this.destinationId = destinationId;
        this.descriptionId = descriptionId;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    
}
