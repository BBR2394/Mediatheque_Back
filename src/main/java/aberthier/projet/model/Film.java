package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Film extends  Document {
    @OneToMany
    @JoinColumn(name = "id_film")
    private List<Acteur> acteurs;
    private FilmFormat format;
    private FilmGenre genre;

}
