package uwproject.uw.bill.service;

import java.util.List;

import uwproject.uw.bill.domain.Bill;

public interface BillService {

	Bill addBill (Bill bill);
	Bill updateBill (Long Id);
	
	List<Bill> getAllBills();
}
