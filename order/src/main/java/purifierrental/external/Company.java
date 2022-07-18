package purifierrental.external;

import java.util.Date;
import lombok.Data;

@Data
public class Company {

    private Integer purifierId;
    private String rentalId;
    private String name;
    private Integer purifierRentalPrice;
    private String purifierStatus;
    // keep

}
