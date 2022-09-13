package demo.service;

import demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    void removeUserById(long id);

    List<User> findAll();

    User findById(long id);

    void update(User user);

    //@Query("select p from Role p where p.user.id=:id and p.name like :name")
    User findByUsername(String name);
}
