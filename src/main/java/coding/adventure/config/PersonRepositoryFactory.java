package coding.adventure.config;

import coding.adventure.repository.PersonDocumentRepository;
import coding.adventure.repository.PersonRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonRepositoryFactory {

    @Autowired
    private PostgresRepositoryFactory postgresRepositoryFactory;

    @Autowired
    private MongoRepositoryFactory mongoRepositoryFactory;

    @Bean
    public PersonRepository getPersonRepository(){
        return postgresRepositoryFactory.getPersonRepository();
    }

    @Bean
    public PersonDocumentRepository getPersonDocumentRepository(){
        return mongoRepositoryFactory.getPersonDocumentRepository();
    }

}
