package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
public class Musique extends Document {
    @Id
    private int id;
    private int duree;
    private MusiqueSupport suport;
    private MusiqueGenre musiqueGenre;
    private String album;

}
