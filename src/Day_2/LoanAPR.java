package Day_2;

public class LoanAPR {

    public static void main(String[] args) {
        double payment = 0;
        int loan = 10000;
        int emi = 1000;
        int noemis = 0;
        double api = .05;

        while( loan >0){
            payment = (emi*api) + emi;
            loan -= payment;

            noemis ++;
            System.out.println("Paying " + payment + " loan is now " + loan);
        }


    }
}
