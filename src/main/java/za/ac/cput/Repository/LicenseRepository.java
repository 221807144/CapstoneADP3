package za.ac.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.licence.License;

@Repository
public interface LicenseRepository extends JpaRepository<License, Integer> {
}
