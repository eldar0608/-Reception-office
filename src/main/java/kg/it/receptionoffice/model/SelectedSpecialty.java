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
@Table(name = "selectedspecialty")
public class SelectedSpecialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "enrollee_id")
    private int enrolleeId;

    @Column(name = "specialty_id")
    private int specialtyId;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column(name = "isrecommended")
    private Boolean isRecommended;

}
