package purifierrental.domain;

import java.util.Date;
import lombok.Data;
import purifierrental.infra.AbstractEvent;

@Data
public class PurifierReturned extends AbstractEvent {

    private Integer rentalId;
    private Integer customerId;
    private Integer purifierId;
    private String rentalStatus;
    private Integer purifierRentalPrice;
}
