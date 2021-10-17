package uwproject.uw.bill.repo;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uwproject.uw.bill.domain.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill, Long>{
	

}
