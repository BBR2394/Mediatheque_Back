package aberthier.projet.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Document {
    @Id
    private int id_Document;
    private String titre;
    private String auteur;
    private Date date;
}
