package ob.hb.tunisiejobing.dao;

import ob.hb.tunisiejobing.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface IUserRepository extends JpaRepository<User, Long> {
}
