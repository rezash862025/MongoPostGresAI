package coding.adventure.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "person") //this is the physical name of the table in the database
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
}
