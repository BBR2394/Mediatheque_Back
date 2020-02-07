package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Document {
    @Id
    private int id;
    private String titre;
    private String auteur;
    private Date date;
}
