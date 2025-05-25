package za.ac.cput.Service;


import za.ac.cput.Domain.bookings.LearnersTest;

import java.util.List;

public interface ILearnersTestService extends IService<LearnersTest, Integer> {
    List<LearnersTest> findById(Integer id);
    void save(LearnersTest e);
}
