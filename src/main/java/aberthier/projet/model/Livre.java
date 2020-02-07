package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
public class Livre extends Document {
    @Id
    private int id;
    private TypeLivre type;
    private FormatLivre format;
    private GenreLivre genre;


}
