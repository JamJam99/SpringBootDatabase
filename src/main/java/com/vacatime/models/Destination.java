package com.vacatime.models;

import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "destination")

public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String city;
    private String description;

    @Override
    public String toString() {
        return "Destination{" + "id=" + id
        + ", cityname='" + city + '\''
        + '}'; 
    }

}