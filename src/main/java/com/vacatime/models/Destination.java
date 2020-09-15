package com.vacatime.models;

import javax.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "destination")

public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name= "cityname")
    private String cityName;

    public Destination() {
        super();
    }

    Destination (String cityName) {
        super();
        this.cityName = cityName;
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

    @Override
    public String toString() {
        return "Destination{" + "id=" + id
        + ", cityname='" + cityName + '\''
        + '}'; 
    }
};