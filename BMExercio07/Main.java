package BMExercio07;

public class Main {
    public static void main (String[] args){
        int x = 13;
        int y = x;
        while (y > 1) {
            if(x % 2 == 0) {
                y = x/2;
            } else {
                y = 3 * x + 1;
            }
            System.out.println(y);
            x = y;
        }
    }
}
