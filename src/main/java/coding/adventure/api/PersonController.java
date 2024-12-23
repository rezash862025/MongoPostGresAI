package coding.adventure.api;

import coding.adventure.dto.PersonCreateOutDTO;
import coding.adventure.dto.PersonCreateDTO;
import coding.adventure.dto.PersonOutDTO;
import coding.adventure.mapper.PersonMapper;
import coding.adventure.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;
    //post to create a person -> DTO of a person
    // needs to be cast to a person and send to service

    @PostMapping
    public PersonCreateOutDTO createPerson(@RequestBody PersonCreateDTO personCreateInDTO) {
        var person = personMapper.mapPersonDTOToPerson(personCreateInDTO);
        return personService.createPerson(person);
    }

    @GetMapping
    public PersonOutDTO getPersons() {
        return personService.getAllPersons();
    }
}
