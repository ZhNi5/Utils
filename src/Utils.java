

public class Utils {

    public static void check(int x, int y, int z) {
        if ((x > 0) && (y > 0) && (z > 0)) {
            System.out.println("excellent");
        } else {
            if ((x > 0 && y > 0) || (x > 0 && z > 0) || (y > 0 && z > 0)) {
                System.out.println("fine");
            }
            else {

                if ((x <= 0) && (y <= 0) && (z <= 0)) {
                    System.out.println("bad");
                } else {
                    System.out.println("good");
                }
            }
        }
    }

}
