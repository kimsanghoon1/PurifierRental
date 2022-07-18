package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class RentalCancelled extends AbstractEvent {

    private Integer rentalId;
    private Integer customerId;
    private Integer purifierId;
    private String rentalStatus;
    private Integer purifierRentalPrice;
    // keep

}
