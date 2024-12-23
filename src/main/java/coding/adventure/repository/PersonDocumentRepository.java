package coding.adventure.repository;

import coding.adventure.entity.PersonDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonDocumentRepository extends MongoRepository<PersonDocument, String> {
}
