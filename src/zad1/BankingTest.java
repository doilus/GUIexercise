

package zad1;


public class BankingTest {

  public static void main(String[] args) {
    Person janP = new Person("Jan"),
           alaP = new Person("Ala");
    BankCustomer jan = new BankCustomer(janP);
    BankCustomer ala = new BankCustomer(alaP);

    jan.getAccount().deposit(1000);
    ala.getAccount().deposit(2000);
    jan.getAccount().transfer(ala.getAccount(), 500);
    ala.getAccount().withdraw(1000);

    System.out.println(jan);
    System.out.println(ala);

    Account.setInterestRate(4.5);
    jan.getAccount().addInterest();
    ala.getAccount().addInterest();

    System.out.println(jan);
    System.out.println(ala);
    
  }
}
class Person {
	String p;
	public Person(String p) { //konstruktor dla klasy 
		this.p=p;
	}
}

class Account{
	double balance;
	static double inrate;
	public Account (double balance) {
		this.balance = balance;
	}
	public void deposit(double add) {
		if(add > 0) {
		balance += add;
		}
	}
	public void withdraw(double sub) {
		if(balance-sub < 0) {
			System.out.println("Podana kwota jest za duza");
		} else balance -= sub;
	}
	
	public static void setInterestRate(double rate) {
		inrate = rate;
	}
	public void addInterest() {
		balance = balance*(100+inrate)/100;
	}
	
	public void transfer(Account p,double money) {
		if(money<balance) { // wykonuje sie tylko gdy jest dostepna gotowka
			withdraw(money);
			p.deposit(money);
		}
	}
	public Account() {}
}
class BankCustomer {
	String name;
	private Account acc;
	public BankCustomer (Person p) {
		name = p.p;
		acc = new Account();
	}
	
	public Account getAccount() {
		return acc;
	}
	
	public String toString() {
		return "Klient: " + name + " stan konta "+acc.balance;
	}
	public void show() {
		System.out.println(toString());
	}
	
	
	

	
		
}



