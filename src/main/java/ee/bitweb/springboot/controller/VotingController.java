package ee.bitweb.springboot.controller;

import java.util.List;

import ee.bitweb.springboot.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ee.bitweb.springboot.model.Animal;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class VotingController {

    @Autowired
    private AnimalRepository animalRepository;

    /*@GetMapping("voting")
    public List<Animal> getResults() {
        return this.animalRepository.findAll();
    }*/

    @PostMapping("voting")
    public Animal postVote(@RequestBody Animal data) {
        return animalRepository.save(data);
    }
}
