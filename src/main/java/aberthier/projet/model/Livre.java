package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Livre extends Document {
    private TypeLivre type;
    private FormatLivre format;
    private GenreLivre genre;


}
