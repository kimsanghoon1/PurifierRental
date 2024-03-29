package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class PurifierRented extends AbstractEvent {

    private Integer rentalId;
    private Integer customerId;
    private Integer purifierId;
    private String rentalStatus;
    private Integer purifierRentalPrice;

    public PurifierRented(Order aggregate) {
        super(aggregate);
    }

    public PurifierRented() {
        super();
    }
    // keep

}
