package kg.it.receptionoffice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "testing")
public class Testing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "enrollee_id")
    private int enrolleeId;

    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "result")
    private int result;

    @Column(name = "corps")
    private String corps;

    @Column(name = "auditory")
    private String auditory;

}
