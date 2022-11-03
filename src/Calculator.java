import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

    float numberNasennik, secondNumberNasennik,sumaNasennik, roznicaNasennik, mnozenieNasennik, podzialNasennik;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Podaj 1 liczbe: ");
    numberNasennik = Float.parseFloat(br.readLine());
    System.out.println("Podaj 2 liczbe: ");
    secondNumberNasennik = Float.parseFloat(br.readLine());
    sumaNasennik = numberNasennik + secondNumberNasennik;
    roznicaNasennik = numberNasennik - secondNumberNasennik;
    mnozenieNasennik = numberNasennik * secondNumberNasennik;
    podzialNasennik = numberNasennik / secondNumberNasennik;

    System.out.printf("Suma: " + "%2.2f", + sumaNasennik);
    System.out.printf("Roznica: " + "%2.2f", + roznicaNasennik);
    System.out.printf("Mnozenie: " + "%2.2f", + mnozenieNasennik);
    System.out.printf("Podzial: " + "%2.2f", + podzialNasennik);

    }
}