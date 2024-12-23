package coding.adventure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PersonOutDTO {
    private List<PersonDocumentDTO> personDocuments;
    private List<PersonSqlDTO> personSqls;
}
