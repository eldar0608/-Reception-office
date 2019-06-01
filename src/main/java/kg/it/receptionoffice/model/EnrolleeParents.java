package kg.it.receptionoffice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "enrolleeparents")
public class EnrolleeParents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fio_mother")
    private String fioMother;

    @Column(name = "place_work_mother")
    private String placeWorkMother;

    @Column(name = "position_mother")
    private String positionMother;

    @Column(name = "mail_mother")
    private String mailMother;

    @Column(name = "mobile_number_mother")
    private String mobileNumberMother;

    @Column(name = "lived_address_mother")
    private String livedAddressMother;

    @Column(name = "fio_father")
    private String fioFather;

    @Column(name = "place_work_father")
    private String placeWorkFather;

    @Column(name = "position_father")
    private String positionFather;

    @Column(name = "mail_father")
    private String mailFather;

    @Column(name = "mobile_number_father")
    private String mobileNumberFather;

    @Column(name = "country_id")
    private int countryId;

    @Column(name = "region_id")
    private int regionId;

    @Column(name = "rayon_id")
    private int rayonId;

    @Column(name = "city_id")
    private  int cityId;

    @Column(name = "village")
    private String village;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

}
