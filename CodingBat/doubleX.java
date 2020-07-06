package CodingBat;

public class doubleX {
    public static void main(String[] args) {
        String text = "xxyz";
        System.out.println(isDoubleX(text));
    }

    private static boolean isDoubleX(String str) {
        int xIndex = str.indexOf("x");

        if (xIndex == -1){
            return false;
        }

        if (xIndex + 1 >= str.length()){
            return false;
        }

        return str.substring(xIndex + 1, xIndex + 2).equals("x");

    }
}


