package fr.epsi.b32324c2.demospringboot.dal;

import fr.epsi.b32324c2.demospringboot.bo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
