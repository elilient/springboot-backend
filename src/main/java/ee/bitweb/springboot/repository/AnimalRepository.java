package ee.bitweb.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ee.bitweb.springboot.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
