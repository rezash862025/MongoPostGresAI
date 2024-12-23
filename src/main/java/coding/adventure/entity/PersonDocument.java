package coding.adventure.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(collection = "persons")
@Getter
@Setter
public class PersonDocument {
    @Id
    private String id;
    private String name;
    private int age;
}
