package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class PayCancelled extends AbstractEvent {

    private Integer payId;
    private Integer rentalId;
    private String payStatus;
    private Integer purifierRentalPrice;
    private Integer purifierId;

    public PayCancelled(Payment aggregate) {
        super(aggregate);
    }

    public PayCancelled() {
        super();
    }
    // keep

}
