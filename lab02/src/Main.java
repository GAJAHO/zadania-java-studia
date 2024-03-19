import java.util.Scanner;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wartosc rowania a: ");
        int a1 = in.nextInt();
        System.out.println("Podaj wartosc rowania b: ");
        int b1 = in.nextInt();
        System.out.println("Podaj wartosc rowania c: ");
        int c1 = in.nextInt();
        zad_1(a1,b1,c1);
        System.out.println("Podaj dowolna liczbe rzeczywista do obliczenia funkcji: ");
        float x1 = in.nextFloat();
        System.out.println("Wartosci funkcji a(x)= "+funkcjaA(x1)+" b(x)= "+funkcjaB(x1)+" c(x)= "+funkcjaC(x1));
        int[] tab = {3,7,2};
        zad_3(tab,3);
        System.out.println();
        System.out.println("Czy pada deszcz (tak/nie): ");
        String deszczyk = in.next();
        System.out.println("Czy jest autobus (tak/nie):");
        String autobusik = in.next();
        zad_4(deszczyk,autobusik);
        System.out.println("Czy masz znizke na samochod (tak/nie): ");
        String znizka = in.next();
        System.out.println("Czy dostales premie: (tak/nie):");
        String premia = in.next();
        zad_5(znizka, premia);
        System.out.println("Podaj liczbe: ");
        int liczba1 = in.nextInt();
        System.out.println("Podaj liczbe: ");
        int liczba2 = in.nextInt();
        System.out.println("Wybierz dzialanie [+,-,*,/,%]");
        String dzialanie = in.next();
        System.out.println(kalkulator(dzialanie, liczba1, liczba2));
    }
    //Napisz metodę określania oraz rozwiązywania równania kwadratowego ax2+bx+c=0 , gdzie a, b i
    //c są dowolnymi stałymi podawanymi przez użytkownika
    public static void zad_1(int a, int b, int c){
        int delta = (int)Math.pow(b,2)-4*a*c;
        if (delta < 0) {
            System.out.println("Brak rozwiazan.");
        } else if (delta == 0) {
            int x0 = -b/2*a;
            System.out.println("Rownanie ma tylko jedno rozwiazanie: "+x0);
        } else {
            int x1 = -b-(int)Math.sqrt(delta)/2*a;
            int x2 = -b+(int)Math.sqrt(delta)/2*a;
            System.out.println("Rowanie ma dwa rozwazania: "+x1+" i "+x2);
        }
    }
    //Napisz metody wyznaczania wartości funkcji określonych wzorami dla argumentów rzeczywistych
    //podawanych przez użytkownika: a(x)=... b(x)=... c(x)=...
    public static float funkcjaA(float x) {
        if (x>0) {
            return 2*x;
        } else if (x==0) {
            return 0;
        } else {
            return -3*x;
        }
    }
    public static float funkcjaB(float x) {
        if (x>=1) {
            return (float)Math.pow(x,2);
        } else {
            return x;
        }
    }
    public static  float funkcjaC(float x) {
        if (x>2) {
            return 2+x;
        } else if (x==2) {
            return 8;
        } else {
            return x-4;
        }
    }
    //Napisz metodę porządkowania trzech liczb x, y i z. Od najmniejszej do największej.
    public static void zad_3(int[] tab, int n) {
        for (int i=0; i<n; i++){
            for (int j=1; j<n-i; j++){
                if(tab[j-1]>tab[j]){
                    int zamiana = tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=zamiana;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(tab[i]+", ");
        }
    }
    //Z wykorzystaniem operatorów logicznych ! (negacja), && (and) napisz metodę, który w zależności
    //od spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
    //• Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”;
    //• Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”;
    //• Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”, „Miłego dnia
    //i pięknej pogody” . Użytkownik podaje informacje o tym czy pada i czy jest autobus.
    public static void zad_4(String deszcz, String autobus){
        if (deszcz.equals("tak") && autobus.equals("tak")){
            System.out.println("Weź parasol. Dostaniesz się na uczelnie.");
        } else if (deszcz.equals("tak")) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else {
            System.out.println("Dostaniesz się na uczelnie. Miłego dnia i pięknej pogody");
        }
    }
    //Z wykorzystaniem operatorów logicznych ! (negacja), || (or) napisz metodę, który w zależności od
    //spełnienia pewnych warunków wyświetla odpowiednie komunikaty:
    //• Jeśli nie ma zniżki na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”, „Zniżki
    //na samochód nie ma”;
    //• Jeśli nie ma zniżki na samochód lub nie otrzymałeś premii, to „Zakup samochód trzeba odłożyć
    //na później...”, „Zniżki na samochód nie ma”;
    //• Jeśli jest zniżka na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”.
    //Użytkownik podaje informacje o tym czy jest zniżka na samochód i czy otrzymałeś podwyżkę.
    public static void zad_5(String znizka, String premia){
        if (znizka.equals("nie")||premia.equals("tak")){
            System.out.println("Mozesz kupic samochod! Znizki na samochod nie ma");
        } else if (premia.equals("nie")) {
            System.out.println("Zakup samochod trzeba odlozyc na pozniej..., Znizki na samochod nie ma");
        } else {
            System.out.println("Mozesz kupic samochod !");
        }
    }
    //Napisz program który w zależności od wyboru użytkownika pozwoli na wykonywanie działań
    //dodawania, odejmowania, iloczynu, ilorazu i reszty z dzielenia
    public static int kalkulator(String dzialanie,int liczba1, int liczba2){
        switch (dzialanie){
            case "+":
                return liczba1+liczba2;
            case "-":
                return liczba1-liczba2;
            case "*":
                return liczba1*liczba2;
            case "/":
                return liczba1/liczba2;
            case "%":
                return liczba1%liczba2;
            default:
                return 0;
        }
    }
}