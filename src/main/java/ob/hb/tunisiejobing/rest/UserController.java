package ob.hb.tunisiejobing.rest;

import ob.hb.tunisiejobing.dao.IUserRepository;
import ob.hb.tunisiejobing.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private IUserRepository userRepositoty;

    public UserController(IUserRepository IUserRepository) {
        this.userRepositoty = IUserRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepositoty.findAll();
    }
}
