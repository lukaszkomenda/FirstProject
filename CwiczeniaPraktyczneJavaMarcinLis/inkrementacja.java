package CwiczeniaPraktyczneJavaMarcinLis;

public class inkrementacja {
    public static void main(String[] args) {
        int x = 1;
        int y;

        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        y = x++;
        System.out.println(y);
        System.out.println(++y);
    }
}
