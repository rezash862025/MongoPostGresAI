package coding.adventure.mapper;

import coding.adventure.domain.Person;
import coding.adventure.dto.PersonCreateDTO;
import coding.adventure.dto.PersonDocumentDTO;
import coding.adventure.dto.PersonOutDTO;
import coding.adventure.dto.PersonSqlDTO;
import coding.adventure.entity.PersonDocument;
import coding.adventure.entity.PersonEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    @Autowired
    private ModelMapper modelMapper;

    public PersonEntity mapPersonToPersonEntity(Person person) {
        return modelMapper.map(person, PersonEntity.class);
    }

    public PersonDocument mapPersonToPersonDocument(Person person) {
        return modelMapper.map(person, PersonDocument.class);
    }

    public Person mapPersonDTOToPerson(PersonCreateDTO personCreateInDTO) {
        return modelMapper.map(personCreateInDTO, Person.class);
    }

    public PersonSqlDTO mapPersonEntityToPersonDTO(PersonEntity personEntity) {
        return modelMapper.map(personEntity, PersonSqlDTO.class);

    }

    public PersonDocumentDTO mapPersonEntityToPersonDocumentDTO(PersonDocument personDocument) {
        return modelMapper.map(personDocument, PersonDocumentDTO.class);

    }
}
