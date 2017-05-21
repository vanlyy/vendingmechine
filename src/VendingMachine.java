
public class VendingMachine {
	int price=80;
	int balance;
	int total;
	VendingMachine()///构造函数
	{
		System.out.println("reload");
	}
	
//	VendingMachine(int price)///函数重载
//	{
//		System.out.println("reloadint");
//		this.price = price;
//	}
	
	VendingMachine(double price)///函数重载
	{
		System.out.println("reloaddouble");
		
	}
	
	
	void setPrice(int price)
	{
		this.price = price;//this.price是vendingmachine的成员变量，price为setprice的本地变量
	}
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	void insertMoney(int amount)
	{
		balance = amount+balance;
		showBalance();//在一个成员函数中调用另一个成员函数直接调用即可 与this.showBalance()一样
	}
	void getFood()
	{
		balance = balance-price;//在函数中可以直接写成员变量的名字来访问成员变量
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
		VendingMachine vm1 = new VendingMachine(100);//调用构造函数时 自动转换double了  int到double可以 
		VendingMachine vm2 = new VendingMachine(100.1);
		vm.showPrompt();
		vm.showBalance();
//		showBalance();  show 谁的balance
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		vm1.insertMoney(200);
		vm1.showBalance();

	}

}
