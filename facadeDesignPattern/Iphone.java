package facadeDesignPattern;

public class Iphone implements MobileShop {

	public void modelNo() {
		System.out.println(" Iphone 6 ");
	}

	@Override
	public void price() {
		System.out.println(" Rs 65000.00 ");
	}

}
