package com.flow.classmappermongodb.presentation;

import com.flow.classmappermongodb.model.Personne;
import com.flow.classmappermongodb.persistence.PersonneRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personne")
public class PersonneResource {

    private final PersonneRepository personneRepository;

    public PersonneResource(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Personne> getPersonne(@PathVariable("id") String personneId) {
        return ResponseEntity.ok(personneRepository.getPersonneById(Integer.valueOf(personneId)));
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Personne> savePersonne(@RequestBody Personne personne) {
        return ResponseEntity.ok(personneRepository.save(personne));
    }
}
