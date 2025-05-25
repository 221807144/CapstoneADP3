package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.registration.Registration;
import za.ac.cput.Repository.RegistrationRepository;

import java.util.List;
@Service
public class RegistrationService implements IRegistationService{
    @Autowired
   private RegistrationRepository repository;
   @Autowired
   public RegistrationService(RegistrationRepository repository) {
       this.repository = repository;
   }
    @Override
    public Registration create(Registration registration) {
        return this.repository.save(registration);
    }

    @Override
    public Registration read(Integer integer) {
        return this.repository.findById(integer).orElse(null);
    }

    @Override
    public Registration update(Registration registration) {
        return this.repository.save(registration);
    }

    @Override
    public void Delete(Integer id) {
       this.repository.deleteById(id);

    }
    @Override
    public List<Registration> getAll() {
        return this.repository.findAll();
    }

}
