

package zad3;


public class ReverseTest {

  public static void main(String[] args) {
  
        Reversible[] revers = new Reversible[] {
            new ReversibleString("Kot"),
            new ReversibleDouble(2),
            new ReversibleDouble(3),
            new ReversibleString("Pies"),
            new ReversibleString("Ala ma kota i psa"),
            new ReversibleDouble(10),
        };

        System.out.println("Normalne:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        for (Reversible r : revers) {
          r.reverse();
        }

        System.out.println("Odwrócone:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        System.out.println("Przywrócone i zmienione:");
        for (Reversible r : revers) {
        	
           r.reverse();
           
           
           if(r instanceof ReversibleString)
        	   System.out.println("Tekst" +r);
         else
         {
          Double d = Double.parseDouble(r.toString());
          System.out.println(d+10);
         }
           
        }
      } 
    }
interface Reversible { //tworzę interfejs
	
	  Reversible reverse();
	  boolean b = false;
	  
	}
class ReversibleString implements Reversible{
	String r;
	public ReversibleString(String r) {
		this.r=r;
		 
	}
	public Reversible reverse() { //zamiana stringow
		StringBuffer rev = new StringBuffer(r); 
		rev.reverse();
		r=rev.toString();
		return this;
	}
	
	public String toString() { //wyswietla wartosc
		return r;
	}
	
}


class ReversibleDouble implements Reversible{
	Double r;
	public ReversibleDouble(int r) {
		this.r=(double)r;
	}
	
	public Reversible reverse() {
		r=1.0/r; // odwrócenie double
		return this;
	}
	public String toString() {
		String newdouble = String.valueOf(r);
		return newdouble;
	}
}
