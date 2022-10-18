class Bankoffice{
	public static void main(String[] args){
		BankAccount.m1();
		BankAccount acc1=new BankAccount();
	    BankAccount acc2=new BankAccount();
	
		acc1.deposite(5000);
        acc2.deposite(7000);
		System.out.println("acc1.balance:"+acc1.balance);
		System.out.println("acc2.balance:"+acc2.balance);
	}
}

