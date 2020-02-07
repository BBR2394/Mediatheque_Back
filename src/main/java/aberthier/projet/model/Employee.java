package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
public class Employee extends Personne {
    @Id
    private int id;
    private String poste;
    private Date dateEmbauche;
}
