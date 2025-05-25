package za.ac.cput.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import za.ac.cput.Domain.bookings.LearnersTest;
import za.ac.cput.Domain.bookings.TestAppointment;
import za.ac.cput.Repository.LearnersTestRepository;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class LearnersTestServiceTest {

    @Autowired

    private LearnersTestRepository learnersTestRepository;

    private LearnersTestService learnersTestService;
    private LearnersTest learnersTest1;

    @BeforeEach
    void setUp() {}

    }
