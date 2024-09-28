import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BankMendes {

     public double resultValueUser;
     Scanner sc = new Scanner(System.in);

     private String nameUserBank = sc.next();
     private String numberCccountUser = sc.next();
     public double valueUser = sc.nextDouble();

     public void setNameUserBank(String nameUserBank) {
          this.nameUserBank = nameUserBank;
     }

     public String getNameUserBank() {

          return nameUserBank;
     }

     public void setNumberCccountUser(String numberCccountUser) {

          this.numberCccountUser = numberCccountUser;
     }
     
     public String getNumberCccountUser() {

          return numberCccountUser;
     }

     public double  resultUserBank() {

          System.out.println("O usuário fez alteração no nome?");
          String nameuserfinal = sc.next();
          setNameUserBank(nameuserfinal);
          String nameFinal = nameuserfinal;

          double atualizarSaldo = valueUser;

          if (atualizarSaldo == 0) {
               System.out.println( nameFinal+", quer continuar a transação? ");

               System.out.println(nameFinal+", digite um valor diferente de zero para que transações sejam feitas. ");
               atualizarSaldo = sc.nextDouble();
          }

          System.out.println("Qual a quantia você deseja sacar? ");
          double   valorAtaxado = sc.nextDouble();

          double resullValorTaxa = valorAtaxado - 5;
          double valorResult = atualizarSaldo - resullValorTaxa;

          String resultTaxa = "O valor retirado foi de "
                  + valorResult + " de uma quantia igual a: "
                  + atualizarSaldo;
          System.out.println(resultTaxa);

          System.out.println(nameFinal+", Adicone valores a conta.  ");
          valorAtaxado = sc.nextDouble();
          double resultvalue = valorAtaxado + (valorResult + atualizarSaldo);
          System.out.println("O valor depois da atualização de saldo foi de: " + resultvalue);

          return  resultvalue;
     }


}

