package ob.hb.tunisiejobing.rest;

import ob.hb.tunisiejobing.dao.UserRepository;
import ob.hb.tunisiejobing.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepositoty;

    public UserController(UserRepository userRepository) {
        this.userRepositoty = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepositoty.findAll();
    }
}
