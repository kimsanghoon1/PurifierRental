package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Integer purifierId;
    private String rentalId;
    private String name;
    private Integer purifierRentalPrice;
    private String purifierStatus;

    public Accepted(Company aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
    // keep

}
