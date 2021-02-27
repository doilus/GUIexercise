# GUIexercise
There is 3 tasks written in **Java**. 

## Table of contents
* [Task1](#task-1-bank-accounts)
* [Task2](#task-2-patients)
* [Task3](#task-3-reversible)

## Task 1 Bank Accounts

Program that simulates operations on bank accounts. Accounts are objects of Account class.  
Every account has their current balance and it can:
* deposit money ( deposit() method )
* withdraw money ( withdraw() method )
* transfer money to different account ( transfer() account )
* add interests ( addInterest() method )

The interest rate is same for all accounts and set via setInterestRate() method.

All bank's clients have bank accounts ( class BankCustomer ) and a client is a Person class.


## Task 2 Patients
Define the class: 
```
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
```
to achieve this result:
```
Pacjent:     Janek
Chory na:    głowa
Zastosowano: aspiryna
Pacjent:     Edzio
Chory na:    noga
Zastosowano: gips
Pacjent:     Marian
Chory na:    dyspepsja
Zastosowano: węgiel
```

method choroba() and leczenie() are **polymorphic methods**!

## Task 3 Reversible
Define **interface Reversible** with method **reverse()** and 
implement this method in ReversibleString and ReversibleDouble class.  
Method **reverse()** reverse the text for strings and for numbers - reverse the double.
e.g. "cat" --> "tac" | 3 --> 0.3333
