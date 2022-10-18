class BankAccount{
	double balance;
	void deposite(double amt){
		balance=balance+amt;
	}
	
	static void m1(){

	Bank b1=new Bank();
	Bank b2=new Bank();
	Address adr=new Address();
	Address adr1=new Address();
   	
	Bank.branchname="ameerpeta";
	Bank.bankname="kotak mahindra";
	Bank.ifsc="KMKO12343204";

	b1.holdername="SADDAM";
	b1.banknumber=98798767;
    b1.balance=909000;

	adr.streetname="panjagunta";
    adr.roadno=12;
   	adr.landmark=20;
    adr.flatnumber=101;
	adr.pincode=509860L;

	b2.holdername="ABDUL";
	b2.banknumber=43545567;
    b2.balance=909232;

	adr1.streetname="maithrivannam";
    adr1.roadno=15;
   	adr1.landmark=60;
    adr1.flatnumber=178;
	adr1.pincode=568060L;

		System.out.println();

		System.out.println("BankAccount acc1 details");
		System.out.println(Bank.branchname);
		System.out.println(Bank.bankname);
		System.out.println(Bank.ifsc);

	    System.out.println(b1.holdername);
		System.out.println(b1.banknumber);
		System.out.println(b1.balance);
		System.out.println(adr.streetname);
		System.out.println(adr.roadno);
		System.out.println(adr.landmark);
		System.out.println(adr.flatnumber);
		System.out.println(adr.pincode);
           
		System.out.println();		

		System.out.println("BankAccount acc2 details");
		System.out.println(Bank.branchname);
		System.out.println(Bank.bankname);
		System.out.println(Bank.ifsc);

		System.out.println(b2.holdername);
		System.out.println(b2.banknumber);
		System.out.println(b2.balance);
		System.out.println(adr1.streetname);
		System.out.println(adr1.roadno);
		System.out.println(adr1.landmark);
		System.out.println(adr1.flatnumber);
		System.out.println(adr1.pincode);

		
    
	}
}