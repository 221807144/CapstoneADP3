package za.ac.cput.Service;

import za.ac.cput.Domain.registration.Registration;

import java.util.List;

public interface IRegistationService extends IService<Registration,Integer> {
    List<Registration> getAll();
    void Delete(Integer id);
}
