package ob.hb.tunisiejobing.dao;

import ob.hb.tunisiejobing.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
