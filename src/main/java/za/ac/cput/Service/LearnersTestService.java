package za.ac.cput.Service;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.bookings.DrivingTest;
import za.ac.cput.Domain.bookings.LearnersTest;
import za.ac.cput.Repository.LearnersTestRepository;

import java.util.List;

@Service
public class LearnersTestService implements ILearnersTestService {
    
    private final LearnersTestRepository LearnersTestRepository;

    public LearnersTestService(LearnersTestRepository LearnersTestRepository) {
        this.LearnersTestRepository = LearnersTestRepository;
    }

    @Override
    public LearnersTest create(LearnersTest learnersTest) {
        return LearnersTestRepository.save(learnersTest);
    }

    @Override
    public LearnersTest read(Integer id) {
        return LearnersTestRepository.findById(id).orElse(null);
    }

    @Override
    public LearnersTest update(LearnersTest learnersTest) {
        return LearnersTestRepository.save(learnersTest);
    }


    public void delete(Integer id) {
        LearnersTestRepository.deleteById(id);
    }


    public List<LearnersTest> findByLearnerId(Integer id) {
        return (List<LearnersTest>) LearnersTestRepository.findByLearnerId(id);
    }

    @Override
    public List<LearnersTest> findById(Integer id) {
        return List.of();
    }

    @Override
    public void save(LearnersTest e) {

    }
}
 
