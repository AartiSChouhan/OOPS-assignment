package assignment1;


public class TestCustomer {
	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.setCustomerName("John");
		cust.setAdd(new Address("1st Main HSR Layout","Banglore"));
		System.out.println(cust.getCustomerDetails());
		Customer c1=new Customer("Rahul",new Address("Technuz","Pune"));
		System.out.println(c1.getCustomerDetails());
	}

}
