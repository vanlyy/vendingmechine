
public class VendingMachine {
	int price=80;
	int balance;
	int total;
	VendingMachine()///���캯��
	{
		System.out.println("reload");
	}
	
//	VendingMachine(int price)///��������
//	{
//		System.out.println("reloadint");
//		this.price = price;
//	}
	
	VendingMachine(double price)///��������
	{
		System.out.println("reloaddouble");
		
	}
	
	
	void setPrice(int price)
	{
		this.price = price;//this.price��vendingmachine�ĳ�Ա������priceΪsetprice�ı��ر���
	}
	void showPrompt()
	{
		System.out.println("Welcome");
	}
	void insertMoney(int amount)
	{
		balance = amount+balance;
		showBalance();//��һ����Ա�����е�����һ����Ա����ֱ�ӵ��ü��� ��this.showBalance()һ��
	}
	void getFood()
	{
		balance = balance-price;//�ں����п���ֱ��д��Ա���������������ʳ�Ա����
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
		VendingMachine vm1 = new VendingMachine(100);//���ù��캯��ʱ �Զ�ת��double��  int��double���� 
		VendingMachine vm2 = new VendingMachine(100.1);
		vm.showPrompt();
		vm.showBalance();
//		showBalance();  show ˭��balance
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		vm1.insertMoney(200);
		vm1.showBalance();

	}

}
