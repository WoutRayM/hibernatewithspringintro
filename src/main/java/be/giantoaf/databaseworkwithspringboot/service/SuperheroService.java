package be.giantoaf.databaseworkwithspringboot.service;

import be.giantoaf.databaseworkwithspringboot.model.Superhero;
import be.giantoaf.databaseworkwithspringboot.repositories.SuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

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

    public Superhero saveSuperhero(Superhero superhero) {
        Superhero exampleObject = new Superhero()
                .setName("Superman");

        ExampleMatcher matcher = ExampleMatcher.matchingAny()
                .withIgnoreCase("name");

        Example<Superhero> superheroExample = Example.of(exampleObject, matcher);

        List<Superhero> superheroes =
                superheroRepository.findAll(superheroExample);
        return superheroes.get(0);
    }

}
