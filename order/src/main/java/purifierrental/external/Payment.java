package purifierrental.external;

import java.util.Date;
import lombok.Data;

@Data
public class Payment {

    private Integer payId;
    private Integer rentalId;
    private String payStatus;
    private Integer purifierRentalPrice;
    private Integer purifierId;
    // keep

}
