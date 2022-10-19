package com.flow.classmappermongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Personne {

    // @Field is required on this one because MongoDb map id named field as MongoDb ObjectId
    // Good practice would be to name the field differently, and keep 'id' only for the MongoDb ObjectId
    @Field("id")
    private Integer id;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private String numeroTelephone;
}
