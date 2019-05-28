package kg.it.receptionoffice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Citizenship")
@SequenceGenerator(name = "seq_citizenship", initialValue = 1, sequenceName = "seq_citizenship", allocationSize = 1)
public class Citizenship {

    @Id
    @GeneratedValue(generator = "seq_citizenship", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


}
