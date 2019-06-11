package be.giantoaf.databaseworkwithspringboot.service;

import be.giantoaf.databaseworkwithspringboot.model.Superhero;
import be.giantoaf.databaseworkwithspringboot.repositories.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SuperheroService {

    private final SuperheroRepository superheroRepository;

    @Autowired
    public SuperheroService(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    @PostConstruct
    public void init() {
        System.out.println("I'm alive");
        System.out.println(superheroRepository);

        Superhero neo = new Superhero()
                .setName("Neo")
                .setAlignment("Chaotic Good")
                .setBicepsCircumference(0.3);

        Superhero s = superheroRepository.save(neo);
        System.out.println(s);
    }

}
