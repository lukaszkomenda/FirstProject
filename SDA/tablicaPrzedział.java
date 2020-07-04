package SDA;

public class tablicaPrzedział {
    public static void main(String[] args) {
        double[] tablica1 = {1.1,4.2,6.4,7.576,10.3467,13.9978,46.3789,62.29932,75.37829,101.273772,202.37827,303.27872,423.37827,507.777227,777.271};

        for (int i = 0; i<=(tablica1.length - 1);i++){
            if (tablica1[i]>=5 && tablica1[i]<=25)
            System.out.format("%.2f%n",tablica1[i]);
            }
        }


    }

