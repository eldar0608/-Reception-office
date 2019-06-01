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
@Table(name = "applicantprogress")
public class ApplicantProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "enrollee_id")
    private int enrolleeId;

    @Column(name = "isrecommend")
    private Boolean isRecommend;

    @Column(name = "protocol")
    private String protocol;

    @Column(name = "recommend_date")
    private LocalDate recommendDate;

    @Column(name = "ispaid")
    private Boolean isPaid;

    @Column(name = "isconfirm")
    private Boolean isConfirm;

    @Column(name = "confirm_date")
    private LocalDate confirmDate;

    @Column(name = "iscredited")
    private Boolean isCredited;

    @Column(name = "order_v")
    private String orderV;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "number_protocol")
    private String numberProtocol;

    @Column(name = "protocol_date")
    private LocalDate protocolDate;

}
