import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Quote implements Serializable {
    int id;
    String content;
    Author author;

}
