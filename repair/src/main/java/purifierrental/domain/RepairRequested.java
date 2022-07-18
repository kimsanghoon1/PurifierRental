package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class RepairRequested extends AbstractEvent {

    private Integer purifierId;
    private String name;
    private String purifierStatus;
    private String rentalId;
    private Integer purifierRentalPrice;
    // keep

}
