package ee.bitweb.springboot.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;
import ee.bitweb.springboot.Sender;
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

    @GetMapping("voting")
    public List<Animal> getResults() {
        return this.animalRepository.findAll();
    }

    @PostMapping("voting")
    public Animal postVote(@RequestBody Animal data) throws IOException, TimeoutException {
        Sender.sendMessage(data.getType());
        return animalRepository.save(data);
    }

}
