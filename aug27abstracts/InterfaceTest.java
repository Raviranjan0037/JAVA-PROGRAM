package aug27abstracts;

public class InterfaceTest {
	public static void main(String[] args) {
		CustomerFunctionality  pp  = new CustomerFunctionalityImpl() ;
		
		pp.doingCalcution() ;
		
		
	
		CustomerFunctionality.wantMoreDiscount();
	}

}