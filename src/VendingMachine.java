
public class VendingMachine {
	int price=80;
	int balance;
	int total;
	VendingMachine()
	{
		System.out.println("reload");
	}
	
//	VendingMachine(int price)
//	{
//		System.out.println("reloadint");
//		this.price = price;
//	}
	
	VendingMachine(double price)
	{
		System.out.println("reloaddouble");
		
	}
	
	
	void setPrice(int price)
	{
		this.price = price;
	}
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	void insertMoney(int amount)
	{
		balance = amount+balance;
		showBalance();
	}
	void getFood()
	{
		balance = balance-price;
		total = total+price;
		System.out.println("Here you are");
	}
	void showBalance()
	{
		System.out.println(balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine vm = new VendingMachine();
		VendingMachine vm1 = new VendingMachine(100);
		VendingMachine vm2 = new VendingMachine(100.1);
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		vm1.insertMoney(50);
		vm1.showBalance();

	}

}
