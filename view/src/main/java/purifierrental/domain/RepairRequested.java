package purifierrental.domain;

import java.util.Date;
import lombok.Data;
import purifierrental.infra.AbstractEvent;

@Data
public class RepairRequested extends AbstractEvent {

    private Integer purifierId;
    private String name;
    private String purifierStatus;
    private String rentalId;
    private Integer purifierRentalPrice;
}
