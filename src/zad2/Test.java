

package zad2;


public class Test {

  public static void main(String[] args) {
    Pacjent[] pacjenci = { new ChoryNaGlowe("Janek"),
                           new ChoryNaNoge("Edzio"),
                           new ChoryNaDyspepsje("Marian")
                         };

    for (Pacjent p : pacjenci) {
      System.out.println("Pacjent:     " + p.nazwisko() + '\n' +
                         "Chory na:    " + p.choroba() + '\n' +
                         "Zastosowano: " + p.leczenie() +"\n\n"
                         );
    }
  }
}
class Pacjent{
	String p, ill, cure;
	public Pacjent() {}
	public Pacjent(String p){
		this.p=p;
	}
	public String nazwisko() {
		return p;
	}
	
	public String choroba() {
		return ill;
	}
	public String leczenie() {
		return cure;
	}
	
}
class ChoryNaGlowe extends Pacjent{
	
public ChoryNaGlowe(String name) {
		p=name;
	}
	public String choroba() {
		return "glowa";
	}
	public String leczenie() {
		return "aspiryna";
	}
	
}
class ChoryNaNoge extends Pacjent{
	
	public ChoryNaNoge(String name) {
		p=name;
	}
	public String choroba() {
		return "noga";
	}
	public String leczenie() {
		return "gips";
	}
	
}
class ChoryNaDyspepsje extends Pacjent{
	public ChoryNaDyspepsje(String name) {
		p=name;
	}
	public String choroba() {
		return "dyspepsja";
	}
	public String leczenie() {
		return "węgiel";
	}
}
