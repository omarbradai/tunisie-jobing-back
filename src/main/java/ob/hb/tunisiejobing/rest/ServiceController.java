package ob.hb.tunisiejobing.rest;

import ob.hb.tunisiejobing.dto.TjServiceDto;
import ob.hb.tunisiejobing.entities.TjService;
import ob.hb.tunisiejobing.utils.DtoEntityMapper;
import ob.hb.tunisiejobing.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("services")
public class ServiceController implements Resource<TjService, TjServiceDto> {

    @Autowired
    private IServiceService serviceService;



    @GetMapping
    public ResponseEntity<List<TjServiceDto>> getServices() {
        List<TjService> services = this.serviceService.findAll();

        return response(services, TjServiceDto.class);
    }
}
