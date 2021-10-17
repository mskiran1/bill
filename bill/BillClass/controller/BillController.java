package uwproject.uw.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uwproject.uw.bill.domain.Bill;
import uwproject.uw.bill.service.BillService;


@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@PostMapping
	public Bill addBill(@RequestBody Bill bill) {
		System.out.println("Bill request body" + bill);
		return billService.addBill(bill);
	}


	public Bill updateBill(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/all")
	public List<Bill> getAllBills() {
		System.out.println("Inside ");
		// TODO Auto-generated method stub
		return billService.getAllBills();
	}
}
