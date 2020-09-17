package com.vacatime.models;

import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "destination")

public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name= "cityname")
    private String cityName;

    
    @OneToOne (mappedBy = "destination", targetEntity = Package.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Package> packages;

    public Destination() {
        super();
    }

    Destination (String cityName, Set<Package> packages) {
        super();
        this.cityName = cityName;
        this.packages = packages;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
    public Set<Package> getPackages() {
        return packages;
    }

    public void setPackages(Set<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "Destination{" + "id=" + id
        + ", cityname='" + cityName + '\''
        + '}'; 
    }

};