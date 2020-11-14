package ee.bitweb.springboot;

import ee.bitweb.springboot.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ee.bitweb.springboot.model.Animal;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public void run(String... args) throws Exception {
        this.animalRepository.save(new Animal("dog"));
        this.animalRepository.save(new Animal("cat"));
        this.animalRepository.save(new Animal("cat"));
        this.animalRepository.save(new Animal("dog"));
    }

}
