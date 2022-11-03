import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ObliczPierwiastek {
    public static void main(String[] args) throws IOException {
        double aPN, bPN, cPN, deltaPN, x1PN, x2PN; char pierwiastkiPN = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wpisz A:");
        aPN = Double.parseDouble(br.readLine());

        if (aPN == 0){
            System.out.println("Niepoprawna wartosc A.");
        } else {
            System.out.println("Wpisz B:");
            bPN = Double.parseDouble(br.readLine());
            System.out.println("Wpisz C:");
            cPN = Double.parseDouble(br.readLine());

            deltaPN = pow(bPN,2) - 4*aPN*cPN;

            if(deltaPN < 0) pierwiastkiPN = 0;
            if(deltaPN == 0) pierwiastkiPN = 1;
            if(deltaPN > 0) pierwiastkiPN = 2;

            switch (pierwiastkiPN){
                case 0:
                    System.out.println("Nie ma pierwiastkow"); break;
                case 1:{
                    x1PN = -bPN/(2*aPN);
                    System.out.printf("Dla A = " + "%4.2f,",aPN);
                    System.out.printf(" B = " + "%4.2f,", bPN);
                    System.out.printf(" B = " + "%4.2f,", cPN);
                    System.out.print("Posiada 2 pierwiastka = ");
                    System.out.printf("%4.2f.\n", x1PN );
                } break;
                case 2: {
                    x1PN = (-bPN-sqrt(deltaPN))/(2*aPN);
                    x2PN = (-bPN+sqrt(deltaPN))/(2*aPN);
                    System.out.printf("Dla A = " + "%4.2f,",aPN);
                    System.out.printf(" B = " + "%4.2f,", bPN);
                    System.out.printf(" C = " + "%4.2f. \n", cPN);
                    System.out.print(" x1 = ");
                    System.out.printf("%4.2f.\n", x1PN );
                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f.\n", x2PN );
                } break;
            }
        }
    }
}