package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import application.domain.CustomerBookingInquiry;

public interface CustomerBookingInquiryRepository extends JpaRepository<CustomerBookingInquiry, Integer> {

}
