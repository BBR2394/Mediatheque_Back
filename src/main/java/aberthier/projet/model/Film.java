package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
public class Film extends  Document {
    @Id
    private int id;
    @OneToMany
    @JoinColumn(name = "id_film")
    private List<Acteur> acteurs;
    private FilmFormat filmFormat;
    private FilmGenre filmGenre;

}
