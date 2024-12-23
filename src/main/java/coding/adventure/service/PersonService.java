package coding.adventure.service;

import coding.adventure.config.PersonRepositoryFactory;
import coding.adventure.domain.Person;
import coding.adventure.dto.PersonCreateOutDTO;
import coding.adventure.dto.PersonOutDTO;
import coding.adventure.entity.PersonDocument;
import coding.adventure.entity.PersonEntity;
import coding.adventure.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepositoryFactory personRepository;

    @Autowired
    private PersonMapper personMapper;

    public PersonCreateOutDTO createPerson(Person person) {
        var personEntity = personMapper.mapPersonToPersonEntity(person);
        PersonEntity pEntity = personRepository.getPersonRepository().save(personEntity);

        var personDocument = personMapper.mapPersonToPersonDocument(person);
        PersonDocument pDocument = personRepository.getPersonDocumentRepository().save(personDocument);

        return new PersonCreateOutDTO(pEntity.getId(), pDocument.getId());
    }

    public PersonOutDTO getAllPersons() {
        var personEntities = personRepository.getPersonRepository().findAll();
        var personSqlDTOs = personEntities.stream().map(personMapper::mapPersonEntityToPersonDTO).toList();

        var personDocuments = personRepository.getPersonDocumentRepository().findAll();
        var personDocumentDTOs = personDocuments.stream().map(personMapper::mapPersonEntityToPersonDocumentDTO).toList();

        return new PersonOutDTO(personDocumentDTOs, personSqlDTOs);
    }
}
