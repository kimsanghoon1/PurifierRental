package purifierrental.domain;

import java.util.*;
import lombok.*;
import purifierrental.domain.*;
import purifierrental.infra.AbstractEvent;

@Data
@ToString
public class PurifierRepaired extends AbstractEvent {

    private String purifierStatus;
    private Integer purifierId;
    private Integer repairId;
    private String repairmanId;

    public PurifierRepaired(Repair aggregate) {
        super(aggregate);
    }

    public PurifierRepaired() {
        super();
    }
    // keep

}
