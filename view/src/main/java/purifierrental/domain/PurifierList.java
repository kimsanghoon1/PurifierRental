package purifierrental.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PurifierList_table")
@Data
public class PurifierList {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer purifierId;

    private String name;
    private String purifierStatus;
    private Integer purifierRentalPrice;
    private Integer rentalId;
    private Integer repairId;
    private Integer repairmanId;
}
