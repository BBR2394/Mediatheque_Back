package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Musique extends Document {
    private int duree;
    private MusiqueSupport support;
    private MusiqueGenre genre;
    private String album;

}
