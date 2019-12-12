package ob.hb.tunisiejobing.dao;

import ob.hb.tunisiejobing.entities.TjService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IServiceRepository extends JpaRepository<TjService, Long> {
}
