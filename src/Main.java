public class Main {
    public static void main(String[] args) {

        System.out.println("1,2,3");
        Utils.check(1,2,3);
        System.out.println("0,2,3");
        Utils.check(0,2,3);
        System.out.println("0,0,3");
        Utils.check(0,0,3);
        System.out.println("0,0,0");
        Utils.check(0,0,0);
        System.out.println("28,2");
        Utils.checkDayAndMonth(28,2);

        System.out.println("29,2");
        Utils.checkDayAndMonth(29,2);
        System.out.println("30,2");
        Utils.checkDayAndMonth(30,2);
        System.out.println("1,1");
        Utils.checkDayAndMonth(1,1);
        System.out.println("15,32");
        Utils.checkDayAndMonth(15,32);

    }
}