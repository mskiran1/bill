package uwproject.uw.bill.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bill implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	Long billId;
	String billName;
	Date createdDate;
	
//mappedBy = "bill", 	, cascade = CascadeType.ALL
	@OneToMany(fetch = FetchType.EAGER)
	private List<Item> item;
	
	public Long getBillId() {
		return billId;
	}
	
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
		

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billName=" + billName + ", createdDate=" + createdDate + ", item=" + item
				+ "]";
	}
	
	
	
}
