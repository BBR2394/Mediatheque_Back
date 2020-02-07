package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Livre extends Document {
    @Id
    private int id_Livre;
    private TypeLivre type;
    private FormatLivre formatLivre;
    private GenreLivre genreLivre;


}
