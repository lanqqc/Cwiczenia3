import java.util.Random;

public class minMax {
    public static void main(String[] args) {

        int sizeNasennik = 10, iPN = 1;
        int liczbaPN, minPN = 101, maxPN = 0;

        Random rPN = new Random();
        System.out.print("Drawn: ");

        while (iPN <= sizeNasennik){
            liczbaPN = Math.round((rPN.nextInt(100)+1));
            System.out.print(liczbaPN + ", ");

            if(liczbaPN < minPN) minPN = liczbaPN;
            if(liczbaPN > maxPN) maxPN = liczbaPN;

            iPN++;
        }
        System.out.println("Najmniejsza liczba w tym zbiorze: " + minPN);
        System.out.println("Najwieksza liczba w tym zbiorze: " + maxPN);
    }
}
