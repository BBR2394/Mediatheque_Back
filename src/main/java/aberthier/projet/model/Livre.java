package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@NoArgsConstructor
public class Livre extends Document {
    @Enumerated(EnumType.STRING)
    private TypeLivre type;
    @Enumerated(EnumType.STRING)
    private FormatLivre format;
    @Enumerated(EnumType.STRING)
    private GenreLivre genre;
}
