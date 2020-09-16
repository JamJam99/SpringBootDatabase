package com.vacatime.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "description")
public class Description {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "descripstion")
    private String description;

    @Column(name= "itineraries")
    private String itineraries;

    @Column(name= "facilities")
    private String facilities;

    public Description() {
        super() ;
    }

    Description(String description, String itineraries, String facilities){
        super();
        this.description = description;
        this.itineraries = itineraries;
        this.facilities = facilities;

    };

    public Long getId() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItineraries() {
        return itineraries;
    }

    public void setItineraries(String itineraries) {
        this.itineraries = itineraries;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
		this.facilities = facilities;
    }
}
