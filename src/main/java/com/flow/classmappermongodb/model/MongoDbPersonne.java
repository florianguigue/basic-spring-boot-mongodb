package com.flow.classmappermongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "test")
public class MongoDbPersonne extends Personne {

    @MongoId
    private ObjectId mongoId;
}
