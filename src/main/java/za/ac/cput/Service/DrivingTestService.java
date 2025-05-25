package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.bookings.DrivingTest;
import za.ac.cput.Repository.DrivingTestRepository;

import java.util.List;

@Service
public class DrivingTestService implements IDrivingTestService {


    // Injecting the DrivingTestRepository dependency
    private final DrivingTestRepository drivingTestRepository;

    public DrivingTestService(DrivingTestRepository drivingTestRepository) {
        this.drivingTestRepository = drivingTestRepository;
    }

    @Override
    public DrivingTest create(DrivingTest drivingTest) {
        return drivingTestRepository.save(drivingTest);
    }

    @Override
    public DrivingTest read(Integer id) {
        return drivingTestRepository.findById(id).orElse(null);
    }

    @Override
    public DrivingTest update(DrivingTest drivingTest) {
        return drivingTestRepository.save(drivingTest);
    }

    @Override
    public void delete(Integer id) {
        drivingTestRepository.deleteById(id);
    }
    @Override
    public List<DrivingTest> findByTestId(Integer testId) {
        return (List<DrivingTest>) drivingTestRepository.findByTestId(testId);
    }

}
