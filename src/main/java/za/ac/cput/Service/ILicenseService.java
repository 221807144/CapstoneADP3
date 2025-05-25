package za.ac.cput.Service;

import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.licence.License;

import java.util.List;

public interface ILicenseService extends IService<License,Integer>{

    List<License> getall();
    void delete(Integer id);
}
