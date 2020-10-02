package com.example.MidtermTask.service;

import com.example.MidtermTask.model.Person;
import com.example.MidtermTask.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getAll(){
        return personRepository.findAll();
    }
    public Person getById(Long id){
        return personRepository.findById(id).orElse(null);
    }
    public Person create(Person person){
        return personRepository.save(person);
    }
    public Person update(Person person){
        return personRepository.save(person);
    }
    public void delete(Long id){
        personRepository.deleteById(id);
    }
}
