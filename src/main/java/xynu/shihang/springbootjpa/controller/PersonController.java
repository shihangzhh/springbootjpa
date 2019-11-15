package xynu.shihang.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xynu.shihang.springbootjpa.bean.Person;
import xynu.shihang.springbootjpa.dao.PersonRepository;

import java.util.List;

@RestController()
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
private PersonRepository personRepository;


    @PostMapping(value = "/addPerson")
    public String  addPerson(Person person){

        personRepository.save(person);
        return  "add ok";
    }

    @RequestMapping(value = "/getAllPersons")
    public List<Person> getAllPersons(){

        return  personRepository.findAll();
    }

    @RequestMapping(value = "/geteOnePerson")
        public  Person getOnePerson(long id){

        return  personRepository.getOne(id);
    }

    @RequestMapping(value = "/updatePerson")
    public  String updatePerson(@RequestBody Person person){


        personRepository.saveAndFlush(person);
        return  "update OK";
    }

    @RequestMapping(value = "/deleteOnePerson")
    public  String  deleteOnePerson(long id){


        personRepository.deleteById(id);

        return  "delete Ok";
    }

}
