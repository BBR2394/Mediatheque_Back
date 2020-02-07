package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
public class Film extends  Document {
    @Id
    private int id_film;
    private ArrayList<Acteur> acteurs;
    private FilmFormat filmFormat;
    private FilmGenre filmGenre;

}
