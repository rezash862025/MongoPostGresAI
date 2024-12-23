package coding.adventure.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonCreateOutDTO {
    private Long id;
    private String objectId;
}
