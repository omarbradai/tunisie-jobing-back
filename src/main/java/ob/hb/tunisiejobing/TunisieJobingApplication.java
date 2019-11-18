package ob.hb.tunisiejobing;

import net.bytebuddy.utility.RandomString;
import ob.hb.tunisiejobing.dao.CategoryRepository;
import ob.hb.tunisiejobing.dao.ServiceRepository;
import ob.hb.tunisiejobing.entities.Category;
import ob.hb.tunisiejobing.entities.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class TunisieJobingApplication implements CommandLineRunner {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(TunisieJobingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Service.class, Category.class);
        categoryRepository.save(new Category(null, "cat1", null, null));
        categoryRepository.save(new Category(null, "cat2", null, null));
        categoryRepository.findAll().forEach(cat -> {
            Service service = new Service();
            service.setName(RandomString.make(18));
            service.setCategory(cat);
            serviceRepository.save(service);
        });

    }

}
