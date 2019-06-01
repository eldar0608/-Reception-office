package kg.it.receptionoffice.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ort")
public class Ort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "enrollee_id")
    private int enrolleeId;

    @Column(name = "isort")
    private Boolean iSort;

    @Column(name = "number_certificate")
    private String numberCertificate;

    @Column(name = "color_certificate")
    private int colorCertificate;

    @Column(name = "primaryscore")
    private int primaryScore;

    @Column(name = "biologyscore")
    private int biologyScore;

    @Column(name = "chemistrysscore")
    private int chemistrysScore;

    @Column(name = "englishscore")
    private int englishScore;

    @Column(name = "historyscore")
    private int historyScore;

    @Column(name = "physicsscore")
    private int physicsScore;

    @Column(name = "mathsscore")
    private int mathsScore;

}
