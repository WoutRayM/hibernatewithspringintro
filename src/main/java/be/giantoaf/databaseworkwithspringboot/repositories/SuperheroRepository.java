package be.giantoaf.databaseworkwithspringboot.repositories;

import be.giantoaf.databaseworkwithspringboot.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.LockModeType;
import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {

    @Lock(LockModeType.OPTIMISTIC)
    List<Superhero> findByNameContainingAndAlignmentLike(String name, String alignment);

    List<Superhero> findByBicepsCircumferenceGreaterThan(Double bicepsLimit);

    @Query("select s.name from Superhero s where name like :iets")
    List<Superhero> findMyShit(String iets);

}
