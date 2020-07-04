package SDA;

public class podzielnosci {
    public static void main(String[] args) {


        for (int i = 1; i<=100;i++){
            if(i%2==0){
                System.out.println(i + ", podzielne przez 2");
            } else if (i%3==0){
                System.out.println(i + ", podzielne przez 3");
            } else if (i%5==0){
                System.out.println(i + ", podzielne przez 5");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
