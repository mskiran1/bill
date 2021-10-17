package uwproject.uw.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import uwproject.uw.bill.domain.Bill;
import uwproject.uw.bill.repo.BillRepo;

@Service
public class BillServiceImpl implements BillService {

	private BillRepo billRepo;
	
	@Autowired
	public BillServiceImpl(BillRepo billRepo) {
//		super();
		this.billRepo = billRepo;
	}

	@Override
	public Bill addBill(Bill bill) {
		System.out.println("Service add bill " + bill);
		return billRepo.save(bill);
	}

	@Override
	public Bill updateBill(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> getAllBills() {
		// TODO Auto-generated method stub
		return billRepo.findAll();
	}

}
