package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Utilisateur extends  Personne {
    @Id
    private int id;
    private Date dateAdhesion;
    private boolean actif;
    @OneToMany
    @JoinColumn(name = "id_utilisateur")
    private List<Emprunt> listEmprunts;

}
