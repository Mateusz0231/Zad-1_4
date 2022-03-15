import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int kalkulator;
    double I1;
    double I2;
    System.out.println("Wybierz program");
    Scanner to = new Scanner(System.in);
    kalkulator=to.nextInt();
    switch(kalkulator)
      {
        case 1:
          double wynik;
          System.out.println("Suma");
          System.out.println("Podaj dwie liczby");
          Scanner jed = new Scanner(System.in);
          I1= jed.nextDouble();
          Scanner dwa = new Scanner(System.in);
          I2 = dwa.nextDouble();
          wynik = I1 + I2;
          System.out.println("Wynik wynosi " + wynik);
          break;
        case 2:
          double minus;
          System.out.println("Suma");
          System.out.println("Podaj dwie liczby");
          Scanner pier = new Scanner(System.in);
          I1= pier.nextDouble();
          Scanner drug = new Scanner(System.in);
          I2 = drug.nextDouble();
          wynik = I1 - I2;
          System.out.println("Wynik wynosi " + wynik);
          break;
        case 3:
          double mnoz;
          System.out.println("Suma");
          System.out.println("Podaj dwie liczby");
          Scanner zmien = new Scanner(System.in);
          I1= zmien.nextDouble();
          Scanner zamien = new Scanner(System.in);
          I2 = zamien.nextDouble();
          wynik = I1 * I2;
          System.out.println("Wynik wynosi " + wynik);
          break;
        case 4:
          double dziel;
          System.out.println("Suma");
          System.out.println("Podaj dwie liczby");
          Scanner licz = new Scanner(System.in);
          I1= licz.nextDouble();
          Scanner mian = new Scanner(System.in);
          I2 = mian.nextDouble();
          if(I2!=0)
          {
          wynik = I1 / I2;
          System.out.println("Wynik wynosi " + wynik);
          }
          else
          {
            System.out.println("Nie dziel przez zero");
          }
          
          break;
          
          
      }
  }
}