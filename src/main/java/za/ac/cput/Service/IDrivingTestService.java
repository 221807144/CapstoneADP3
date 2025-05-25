package za.ac.cput.Service;

import za.ac.cput.Domain.bookings.DrivingTest;

import java.util.List;

public interface IDrivingTestService extends IService<DrivingTest, Integer> {
    List<DrivingTest> findByTestId(Integer id);
    void delete(Integer e);
    // Additional methods specific to DrivingTest can be defined here if needed

}
