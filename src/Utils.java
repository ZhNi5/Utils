

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

    public static void checkDayAndMonth(int day,int month){
       if ((day >= 1) && (day <= 31) && (1 <= month) && (month <= 12)) {

           switch (month) {
               case 1:
                   if((day==1)||(day==7)) {
                       System.out.println("It is Holiday");
                   }
                   break;
               case 2:
                   if(day>29) {
                       System.out.println("The date is unavaliable");
                   }
                   else
                   {
                       System.out.println("It is not a Holiday");
                   }
                   break;
               case 3:
                   if(day==8) {
                       System.out.println("It is Holiday");
                   }
                   break;
               case 5:
                   if((day==1)||(day==9)) {
                       System.out.println("It is Holiday");
                   }
                   break;
               case 6:
                   if(day==3) {
                       System.out.println("It is Holiday");
                   }
                   break;
               case 11:
                   if(day==7) {
                       System.out.println("It is Holiday");
                   }
                   break;
               case 12:
                   if(day==25) {
                       System.out.println("It is Holiday");
                   }
                   break;
               default:
                   System.out.println("It is not a Holiday");
                   break;
           }
       }
       else
       {
           System.out.println("The date is unavaliable");
       }

    }

}
