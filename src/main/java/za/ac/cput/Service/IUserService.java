package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.user.User;

import java.util.List;

public interface IUserService extends IService <User,Integer> {
    List<User> findAll();
void deleteById(Integer id);
}
