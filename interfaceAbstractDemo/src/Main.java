import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer1=new Customer();
		customer1.setId(1);
		customer1.setFirstName("Elif Zeynep");
		customer1.setLastName("Toprak");
		customer1.setDateOfBirth(2001);
		customer1.setNationalityId("33904412242");

		customerManager.Save(customer1);
	}

}
