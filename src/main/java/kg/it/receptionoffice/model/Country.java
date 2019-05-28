package kg.it.receptionoffice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Country")
@SequenceGenerator(name = "seq_country", initialValue = 1, sequenceName = "seq_country", allocationSize = 1)
public class Country {


    @Id
    @GeneratedValue(generator = "seq_country", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;

}
