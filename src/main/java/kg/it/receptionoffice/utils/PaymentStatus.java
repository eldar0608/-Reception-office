package kg.it.receptionoffice.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PaymentStatus {

    String statementId;
    String status;
    String message;
    String paymentBody;
    String operator;

    public PaymentStatus(String statementId){
        this.statementId = statementId;
    }

    public PaymentStatus(String statementId, String status, String message){
        this.statementId = statementId;
        this.status = status;
        this.message = message;
    }
}
