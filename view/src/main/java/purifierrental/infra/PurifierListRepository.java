package purifierrental.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import purifierrental.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "purifierLists",
    path = "purifierLists"
)
public interface PurifierListRepository
    extends PagingAndSortingRepository<PurifierList, Long> {
    List<PurifierList> findByRepairId(Integer repairId);

    void deleteByPurifierStatus(String purifierStatus);
    // keep

}
