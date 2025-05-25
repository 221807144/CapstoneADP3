package za.ac.cput.Service;

import za.ac.cput.Domain.user.Admin;

import java.util.List;

public interface IAdminService extends IService <Admin,Integer> {
    List<Admin> findAll();
    Admin findById(Integer id);
    void delete(Integer id);
}
