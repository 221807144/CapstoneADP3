package za.ac.cput.Service;

import za.ac.cput.Domain.bookings.Bookings;

import java.util.List;

public interface IBookingService extends IService<Bookings, Integer> {
    List<Bookings> getall();
    void delete(Integer id);
    // Additional methods specific to booking service can be defined here
}
