package coding.adventure.config;

import coding.adventure.repository.PersonDocumentRepository;
import coding.adventure.repository.PersonRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PostgresRepositoryFactory {

    @Autowired
    private PersonRepository personRepository;

    public PersonDocumentRepository getPersonDocumentRepository() {
        throw new UnsupportedOperationException("Postgres does not support PersonDocumentRepository");
    }
}
