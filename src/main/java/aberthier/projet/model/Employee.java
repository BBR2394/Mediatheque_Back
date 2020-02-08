package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Employee extends Personne {
    private String poste;
    private Date dateEmbauche;
}
