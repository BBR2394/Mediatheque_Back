package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Film extends Document {
    @OneToMany
    @JoinColumn(name = "id_film")
    private List<Acteur> acteurs;
    @Enumerated(EnumType.STRING)
    private FilmFormat format;
    @Enumerated(EnumType.STRING)
    private FilmGenre genre;

}
