import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Album implements Serializable {

    int id;
    String artist;
    String albumName;
    int releaseDate;
    Double sales;
    String genre;


}
