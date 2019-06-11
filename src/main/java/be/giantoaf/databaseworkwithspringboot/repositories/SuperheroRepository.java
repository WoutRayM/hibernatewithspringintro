package be.giantoaf.databaseworkwithspringboot.repositories;

import be.giantoaf.databaseworkwithspringboot.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {



}
