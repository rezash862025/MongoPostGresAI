package coding.adventure.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonCreateDTO {
    private String name;
    private int age;
}
