package ob.hb.tunisiejobing.service.impl;

import ob.hb.tunisiejobing.dao.IServiceRepository;
import ob.hb.tunisiejobing.entities.TjService;
import ob.hb.tunisiejobing.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService implements IServiceService {

    @Autowired
    private IServiceRepository serviceRepository;


    @Override
    public List<TjService> findAll() {
        return serviceRepository.findAll();
    }
}
