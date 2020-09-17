package com.vacatime.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "package")
public class Package {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name= "package_code")
    private String packageCode;

    @Column(name= "price")
    private String price;

    
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (foreignKey = @ForeignKey( name= "destination_id"),referencedColumnName = "id", insertable = false)
    private String destinationId;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (foreignKey = @ForeignKey(name= "description_id"),referencedColumnName = "id", insertable = false)
    private String descriptionId;
 


    public Package() {
        super();
    }

    Package(String packagecode, String price, String destinationId, String descriptionId){
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

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(String descriptionId) {
        this.descriptionId = descriptionId;
    }

    
}
