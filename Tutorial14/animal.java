package Tutorial14;

public class animal {
    public static String iAmDog(){
        return "I am a dog";
    }

    public static void doStuff(){
        int a = 5;

        if (a==0){
            System.out.println("Nie zero");
        } else if (a==1){
            System.out.println("Nie jeden");
        } else {
            System.out.println("Trafione");
        }

        for (int i = 0; i<10;i++){
            System.out.println("hi");
        }

        while (a<10){
            System.out.println("HI");
            a++;
        }
        /*
        try {

        } catch (Exception e){

        }

         */
    }
}
