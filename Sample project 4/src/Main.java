/// ABSTRACT CLASS
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bSBI = new SBI();
		// No instance for abstract class only obj name
		// instance created by child class
		bSBI.BankTime();
		System.out.println("SBI "+ bSBI.rateOfInterest());
		Bank bHDFC = new HDFC();
		bHDFC.BankTime();
		System.out.println("HDFC "+ bHDFC.rateOfInterest());
		Bank bICICI = new ICIICI();
		bICICI.BankTime();
		System.out.println("ICICI "+ bICICI.rateOfInterest());
		
	}

}
