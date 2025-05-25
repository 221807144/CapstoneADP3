package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.user.Admin;
import za.ac.cput.Repository.AdminRepository;

import java.util.List;

@Service
public class AdminService implements IAdminService {

    private final AdminRepository repository;

    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    @Override
    public Admin create(Admin admin) {
        return repository.save(admin);
    }

    @Override
    public Admin read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Admin update(Admin admin) {
        return repository.save(admin);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Admin findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Admin> findAll() {
        return repository.findAll();
    }
}
