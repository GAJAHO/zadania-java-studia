import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Twoje imie i wiek to: "+zad_1());
        zad_2(5,3);
        System.out.println(zad_3(2));
        System.out.println(zad_4(15));
        System.out.println(zad_5(3));
        System.out.println(zad_6(9));
        System.out.println("Podaj liczbę poczatkowa liczbe do zakresu: ");
        int a = in.nextInt();
        System.out.println("Podaj liczbę koncowa liczbe do zakresu: ");
        int b = in.nextInt();
        Random random = new Random();
        int bok_1 = random.nextInt(b-a+1) + a;
        int bok_2 = random.nextInt(b-a+1) + a;
        int bok_3 = random.nextInt(b-a+1) + a;
        System.out.println(zad_7(bok_1,bok_2,bok_3));
    }
    //Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
    public static String zad_1(){
        String imie = "Jan";
        int wiek = 21;
        return imie+" "+wiek;
    }
    //Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
    //Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
    public static void zad_2(int a, int b){
        int suma = a+b;
        System.out.println("Suma: "+a+" + "+b+" = "+suma);
        int roznica = a-b;
        System.out.println("Roznica: "+a+" - "+b+" = "+roznica);
        int iloczyn = a*b;
        System.out.println("Iloczyn: "+a+" * "+b+" = "+iloczyn);
    }
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta
    public static boolean zad_3(int liczba){
        return liczba % 2 == 0;
    }
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez
    //3 i przez 5.
    public static boolean zad_4(int liczba){
        return liczba % 3 == 0 && liczba % 5 == 0;
    }
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
    public static int zad_5(int liczba){
        return (int)Math.pow(liczba,3);
    }
    //Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
    public static int zad_6(int liczba){
        return (int)Math.sqrt(liczba);
    }
    //Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
    //z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    //Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są
    //przez użytkownika z klawiatury.
    public static boolean zad_7(int bok_1, int bok_2, int bok_3){
        System.out.println((int)Math.pow(bok_1,2));
        System.out.println((int)Math.pow(bok_2,2));
        System.out.println((int)Math.pow(bok_3,2));
        int najwieksza = Math.max(bok_1, Math.max(bok_2, bok_3));
        int sumaKwadratuBokow = 0;
        if (najwieksza == bok_1) {
            sumaKwadratuBokow = (int)Math.pow(bok_2,2)+(int)Math.pow(bok_3,2);
        } else if (najwieksza == bok_2) {
            sumaKwadratuBokow = (int)Math.pow(bok_1,2)+(int)Math.pow(bok_3,2);
        } else {
            sumaKwadratuBokow = (int)Math.pow(bok_1,2)+(int)Math.pow(bok_2,2);
        }
        return sumaKwadratuBokow == najwieksza;
    }
}