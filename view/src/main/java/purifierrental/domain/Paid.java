package purifierrental.domain;

import java.util.Date;
import lombok.Data;
import purifierrental.infra.AbstractEvent;

@Data
public class Paid extends AbstractEvent {

    private Integer payId;
    private Integer rentalId;
    private String payStatus;
    private Integer purifierRentalPrice;
    private Integer purifierId;
}
