package purifierrental.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "company", url = "${api.url.company}")
public interface CompanyService {
    @RequestMapping(
        method = RequestMethod.GET,
        path = "/companies/{purifierId}"
    )
    public Company getCompany(@PathVariable("purifierId") Integer purifierId);
    // keep

}
