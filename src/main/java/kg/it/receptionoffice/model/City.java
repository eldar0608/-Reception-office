package kg.it.receptionoffice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "City")
@SequenceGenerator(name = "seq_city", initialValue = 1, sequenceName = "seq_city", allocationSize = 1)
public class City {

    @Id
    @GeneratedValue(generator = "seq_city", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


}
