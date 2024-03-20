import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe osob w grupie: ");
        int n = in.nextInt();
        zad_1(n);
        int[] tab = new int[10];
        for (int i=0; i<10; i++){
            System.out.println("Podaj dowolna liczbe rozna od zera: ");
            tab[i]=in.nextInt();
        }
        zad_2(tab);
        System.out.println("Podaj ilosc liczb w ciagu: ");
        int ciag = in.nextInt();
        zad_3(ciag);
        zad_4(ciag);
        System.out.println("Podaj słowo: ");
        String slowo = in.next();
        palindrom(slowo);

    }
    //Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik). Wprowadzamy
    //liczbę punktów dla każdego studenta. Napisz program, który obliczy średnią liczbę punktów w
    //grupie z wykorzystaniem pętli while.
    public static void zad_1(int n) {
        int i=0, ilosPunktow=0;
        Random random = new Random();
        while (i<n){
            int punkt = random.nextInt(100);
            ilosPunktow += punkt;
            i++;
        }
        int srednia = ilosPunktow/n;
        System.out.println("Srednia ilosc punktow dla grupy "+n+" to "+srednia);
    }
    //Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości oraz sumy liczb
    //ujemnych i dodatnich podanych przez użytkownika.
    public static void zad_2(int[] tab){
        int dodatenie=0, ujemne=0, suma1=0, suma2=0;
        for (int i=0; i<10; i++){
            if (tab[i]>0){
                dodatenie++;
                suma1 += tab[i];
            } else {
                ujemne++;
                suma2 += tab[i];
            }
        }
        System.out.println("Uzytkownik podal "+dodatenie+" dodatnich liczb z suma rowna "+suma1+" i "+ujemne+" ujemnych z suma "+suma2);
    }
    //Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy wszystkich liczb
    //parzystych w danym ciągu.
    public static void zad_3(int n){
        int[] tab = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){

            tab[i]=random.nextInt(201)-100;
        }
        int suma=0;
        for (int i=0;n>i; i++){
            if(tab[i]%2==0 && tab[i]>0){
                suma += tab[i];
            }
        }
        System.out.println("Suma wszystkich liczb tego ciagu to: "+suma);
    }
    //Wykorzystując algorytm z zadania 5, napisz program który pozwoli użytkownikowi na
    //wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym
    //ciągu
    public static void zad_4(int n){
        int[] tab = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            tab[i]=random.nextInt(56)-10;
        }
        int suma=0;
        for (int i=0;n>i; i++){
            if(tab[i]%2==0 && tab[i]>0){
                suma += tab[i];
            }
        }
        System.out.println("Suma wszystkich liczb tego ciagu to: "+suma);
    }
    //Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest
    //palindromem. Palindrom to słowo, które jest takie samo czytane od początku i od końca, np.
    //kajak
    public static void palindrom(String slowo){
        int i=0, j=slowo.length()-1;
        boolean info=true;
        for ( ;i<j;i++,j--) {
            if (slowo.charAt(i) != slowo.charAt(j)) {
                info=false;
            }
        }
        if (info) {
            System.out.println("Jest palindoromem");
        } else {
            System.out.println("Nie jest palindormem");
        }
    }
}