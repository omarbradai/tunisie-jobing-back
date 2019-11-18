package ob.hb.tunisiejobing.dao;

import ob.hb.tunisiejobing.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, Long> {
}
