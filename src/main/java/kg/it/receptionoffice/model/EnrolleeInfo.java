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
@Table(name = "enrolleeinfo")
public class EnrolleeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patroname")
    private String patroname;

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @Column(name = "male_id")
    private int maleId;

    @Column(name = "socStatus_id")
    private int socStatusId;

    @Column(name = "inn")
    private int inn;

    @Column(name = "passport_seria")
    private String passportSeria;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;

    @Column(name = "ethnic")
    private Boolean ethnic;

    @Column(name = "nationality_id")
    private int nationalityId;

    @Column(name = "citizenship_id")
    private int citizenshipId;

    @Column(name = "familystatus_id")
    private int familyStatusId;

    @Column(name = "email")
    private String email;

    @Column(name = "isstudiedback")
    private Boolean isStudiedBack;

}
