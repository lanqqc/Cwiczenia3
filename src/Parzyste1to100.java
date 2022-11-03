public class Parzyste1to100 {
    public static void main(String[] args) {

        int aPN, sumaPN = 0;
        for(aPN  = 1; aPN <=100; aPN++){
            if(aPN%2 == 0) {
                sumaPN += aPN;
            }
        }
        System.out.println("Suma parzystych lizcb od 1 do 100 rownna sie: " + sumaPN);
    }
}
