package kg.it.receptionoffice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "militaryservice")
public class MilitaryService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "enrollee_id")
    private int enrolleeId;

    @Column(name = "document")
    private int document;

    @Column(name = "seria")
    private String seria;

    @Column(name = "name")
    private String name;

    @Column(name = "military_reg_date")
    private LocalDate militaryRegDate;

    @Column(name = "is_fit")
    private Boolean isFit;

    @Column(name = "is_special_reg")
    private Boolean isSpecialReg;

    @Column(name = "number_special_reg")
    private String numberSpecialReg;

    @Column(name = "is_fired")
    private Boolean isFired;

    @Column(name = "rank")
    private String rank;

    @Column(name = "military_specialty")
    private String militarySpecialty;

    @Column(name = "number_military_specialty")
    private String numberMilitarySpecialty;
}
