package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@NoArgsConstructor
public class Musique extends Document {
    private int duree;
    @Enumerated(EnumType.STRING)
    private MusiqueSupport support;
    @Enumerated(EnumType.STRING)
    private MusiqueGenre genre;
    private String album;

}
