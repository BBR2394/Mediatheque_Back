package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur extends Personne {
    private Date dateAdhesion;
    private boolean actif;
    @OneToMany
    @JoinColumn(name = "id_utilisateur")
    private List<Emprunt> emprunts;

}
