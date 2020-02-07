package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Musique extends  Document {
    @Id
    private int id_musique;
    private int duree;
    private MusiqueSuport suport;
    private MusiqueGenre musiqueGenre;
    private String album;

}
