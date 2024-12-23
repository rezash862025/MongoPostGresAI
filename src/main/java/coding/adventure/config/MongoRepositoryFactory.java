package coding.adventure.config;

import coding.adventure.repository.PersonDocumentRepository;
import coding.adventure.repository.PersonRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MongoRepositoryFactory {

    @Autowired
    private PersonDocumentRepository personDocumentRepository;

    public PersonRepository getPersonRepository() {
        throw new UnsupportedOperationException("Mongo does not support PersonRepository");
    }
}
