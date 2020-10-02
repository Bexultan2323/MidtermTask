package com.example.MidtermTask.controller;

import com.example.MidtermTask.model.Person;
import com.example.MidtermTask.repository.PersonRepository;
import com.example.MidtermTask.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private final PersonService personService;
    @Autowired
    private PersonRepository personRepository;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/api/v2/users")
    public String show(Model model){
        Iterable<Person> data= personRepository.findAll();
        model.addAttribute("data",data);
        return "index";
    }



    public ResponseEntity<?> getAct(){
        return ResponseEntity.ok(personService.getAll());
    }

    @GetMapping("/api/v2/users/{id}")
    public ResponseEntity<?> getPerson(@PathVariable Long id){
        return ResponseEntity.ok(personService.getById(id));
    }

    @PostMapping("/api/v2/users")
    public ResponseEntity<?>  savePerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.create(person));
    }

    @PutMapping("/api/v2/users")
    public ResponseEntity<?> updatePerson(@RequestBody Person person){
        return ResponseEntity.ok(personService.update(person));
    }

    @DeleteMapping("/api/v2/users/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.delete(id);
    }
}