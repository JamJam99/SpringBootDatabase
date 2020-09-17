package com.vacatime.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "description")
public class Description {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "id")
    private Long id;

    @Column(name= "description")
    private String description;

    @Column(name= "itineraries")
    private String itineraries;

    @Column(name= "facilities")
    private String facilities;

    @OneToOne (mappedBy = "description", targetEntity = Package.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Package> packages;

    public Description() {
        super() ;
    }

    Description(String description, String itineraries, String facilities, Set<Package> packages){
        super();
        this.description = description;
        this.itineraries = itineraries;
        this.facilities = facilities;
        this.packages = packages;

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
    
    public Set<Package> getPackages() {
        return packages;
    }

    public void setPackages(Set<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString(){
        return "Description{" + "id=" + id
                + ", description='" + description + '\''
                + ", itineraries=' " + itineraries + '\'' 
                + ", facilities=' " + facilities +'\''
                + '}';

    }

}
