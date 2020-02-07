package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Emprunt {
    @Id
    private int id;
    private Date dateEmprunt;
    private Date dateRetour;
    @OneToOne
    private Document document;

}
