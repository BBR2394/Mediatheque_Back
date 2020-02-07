package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "id")
@Data
@NoArgsConstructor
public class Utilisateur extends Personne {
    @Id
    private int id;
    private Date dateAdhesion;
    private boolean actif;
    @OneToMany
    @JoinColumn(name = "id_utilisateur")
    private List<Emprunt> listEmprunts;

}
