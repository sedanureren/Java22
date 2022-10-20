package interfaces;

public class CustomerManager {
	ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		ICustomerDal customerDal=new OracleCustomerDal();
		customerDal.add();
	}
}
