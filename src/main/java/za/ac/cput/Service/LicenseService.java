package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Domain.bookings.Bookings;
import za.ac.cput.Domain.licence.License;
import za.ac.cput.Repository.BookingsRepository;
import za.ac.cput.Repository.LicenseRepository;

import java.util.List;
@Service
public class LicenseService implements ILicenseService{
@Autowired
    private LicenseRepository repository;

    @Autowired
    public LicenseService(LicenseRepository licenseRepository) {
        this.repository = licenseRepository;
    }

    @Override
    public License create(License license) {
        return this.repository.save(license);
    }

    @Override
    public License read(Integer integer) {
        return this.repository.findById(integer)
                .orElse(null);
    }

    @Override
    public License update(License license) {
        return this.repository.save(license);
    }
    
    @Override
    public void delete(Integer id) {

    }
    @Override
    public List<License> getall() {
        return this.repository.findAll();
    }
}