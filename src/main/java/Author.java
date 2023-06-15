import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Author implements Serializable {
    int id;
    String firstName;
    String lastName;
}
