package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.user.User;
import za.ac.cput.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    private final UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }



    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
        public User update(User user) {
            if (user == null) return null;
            return repository.save(user);
        }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        if (id != null && repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            System.out.println("User with ID " + id + " does not exist.");
        }

    }
}
