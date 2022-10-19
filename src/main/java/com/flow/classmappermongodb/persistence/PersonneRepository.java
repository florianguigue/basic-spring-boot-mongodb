package com.flow.classmappermongodb.persistence;

import com.flow.classmappermongodb.model.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends MongoRepository<Personne, String> {

    @Query("{ 'id': ?0 }")
    Personne getPersonneById(Integer personneId);
}
