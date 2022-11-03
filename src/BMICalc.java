import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalc {
    public static void main(String[] args) throws IOException {
        float visotaNasennik, vesNasennik, BMINasennik;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wpisz swoj wzrost: ");
        visotaNasennik = Float.parseFloat(br.readLine())/100;
        System.out.println("Napisz swoja wage: ");
        vesNasennik = Float.parseFloat(br.readLine());

        BMINasennik = (float) (vesNasennik / (Math.pow(visotaNasennik, 2)));
        System.out.printf("Twoj BMI rowna sie: " + "%2.2f, \n", BMINasennik);

        if(BMINasennik<16){
            System.out.println("Wyglodzenie");
        } else if((BMINasennik >= 16)&&(BMINasennik < 16.99)){
            System.out.println("Wychudzenie");
        } else if((BMINasennik >= 17)&&(BMINasennik < 18.49)){
            System.out.println("Niedowaga");
        } else if((BMINasennik >= 18.50)&&(BMINasennik < 22.99)){
            System.out.println("Norma niski przedzial");
        } else if((BMINasennik >= 23)&&(BMINasennik < 24.99)){
            System.out.println("Norma wysoki przedzial");
        } else if((BMINasennik >= 25)&&(BMINasennik < 27.49)){
            System.out.println("Nadwaga niski przedzial");
        } else if((BMINasennik >= 27.50)&&(BMINasennik < 29.99)){
            System.out.println("Nadwaga wysoki przedzial");
        } else if((BMINasennik >= 30)&&(BMINasennik < 34.99)){
            System.out.println("Otylosc 1 stopnia");
        } else if((BMINasennik >= 35)&&(BMINasennik < 39.99)){
            System.out.println("Otylosc 2 stopnia");
        } else if((BMINasennik > 40)){
            System.out.println("Otylosc 3 stopnia");
        }

    }
}

