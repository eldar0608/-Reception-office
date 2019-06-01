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
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "enrollee_id")
    private int enrollee_id;

    @Column(name = "is_original")
    private Boolean isOriginal;

    @Column(name = "is_finished_fine")
    private Boolean isFinishedFine;

    @Column(name = "is_gold_medal")
    private Boolean isGoldMedal;

    @Column(name = "is_olympic_medalist")
    private Boolean isOlympicMedalist;

    @Column(name = "certificate_or_diploma")
    private Boolean certificateOrDiploma;

    @Column(name = "seria_certificate")
    private String seriaCertificate;

    @Column(name = "number_certificate")
    private String numberCertificate;

    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;

    @Column(name = "learn_language_school")
    private String LearnLanguageSchool;

    @Column(name = "foreign_language_school")
    private String foreignLanguageSchool;

    @Column(name = "kind_sport")
    private String kindSport;

    @Column(name = "is_out_competition")
    private Boolean isOutCompetition;

    @Column(name = "number_document")
    private String numberDocument;

    @Column(name = "country_id")
    private int countryId;

    @Column(name = "region_id")
    private int regionId;

    @Column(name = "rayon_id")
    private int rayonId;

    @Column(name = "village")
    private String village;

    @Column(name = "city_id")
    private  int cityId;

    @Column(name = "type_school")
    private String typeSchool;

    @Column(name = "name_school")
    private String nameSchool;
}
