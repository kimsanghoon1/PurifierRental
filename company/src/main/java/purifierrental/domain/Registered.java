package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class Registered extends AbstractEvent {

    private Integer purifierId;
    private String name;
    private Integer purifierRentalPrice;
    private String purifierStatus;
    private String rentalId;

    public Registered(Company aggregate) {
        super(aggregate);
    }

    public Registered() {
        super();
    }
    // keep

}
