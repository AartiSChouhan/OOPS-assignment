package assignment1;


public class Customer {
	private String customerName;
	private Address add;
	public Customer() {
		super();
		customerName="John";
		}
	public Customer(String customerName, Address add) {
		super();
		this.customerName = customerName;
		this.add = add;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public String getCustomerDetails()
	{
		return ("Customer : "+customerName+ " Residential Address :"+add);
		
	}
	
	
	
	

}
