package ob.hb.tunisiejobing.rest;

import ob.hb.tunisiejobing.dto.TjServiceDto;
import ob.hb.tunisiejobing.entities.TjService;
import ob.hb.tunisiejobing.mapper.DtoEntityMapper;
import ob.hb.tunisiejobing.service.IServiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("services")
public class ServiceController {

    @Autowired
    private IServiceService serviceService;



    @GetMapping
    public List<TjServiceDto> getServices() {
        List<TjService> services = this.serviceService.findAll();
        return DtoEntityMapper.convertToDtos(services, TjServiceDto.class);
    }
}
