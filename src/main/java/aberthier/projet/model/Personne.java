package aberthier.projet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Personne {
    @Id
    private int id_personne;
    private String nom;
    private String prenom;
    private int age;
    private Date dateNaissance;
    private String adresse;
}
