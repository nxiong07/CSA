public class Conditionals {
    public static void main (String[] args){
        Conditionals c = new Conditionals();
        System.out.println("\t Chimp Trouble");
        System.out.println(c.chimpTrouble(true, true));
        System.out.println(c.chimpTrouble(false, false));
        System.out.println(c.chimpTrouble(true, false));
        System.out.println(c.chimpTrouble(false, true));
        System.out.println("\n");

        System.out.println("\t Negative Positive");
        System.out.println(c.negPos(1, -1, false));
        System.out.println(c.negPos(-1, 1, false));
        System.out.println(c.negPos(1, 1, false));
        System.out.println(c.negPos(-1, -1, false));
        System.out.println(c.negPos(-4, -5, true));
        System.out.println(c.negPos(-4, 5, true));
        System.out.println(c.negPos(4, -5, true));
        System.out.println(c.negPos(4, 5, true));
        System.out.println("\n");

        System.out.println("\t Pick Up Phone");
        System.out.println(c.pickUpPhone(false, false, true));
        System.out.println(c.pickUpPhone(true, true, true));
        System.out.println(c.pickUpPhone(true, true, false));
        System.out.println(c.pickUpPhone(false, true, false));
        System.out.println(c.pickUpPhone(true, false, false));
        System.out.println(c.pickUpPhone(false, false, false));
        System.out.println("\n");

        System.out.println("\t Set Alarm");
        System.out.println(c.setAlarm(1, false));
        System.out.println(c.setAlarm(5, false));
        System.out.println(c.setAlarm(0, false));
        System.out.println(c.setAlarm(2, true));
        System.out.println(c.setAlarm(4, true));
        System.out.println(c.setAlarm(6, true));
        System.out.println("\n");
        
        System.out.println("\t One Digit Same");
        System.out.println(c.onesDigitSame(23, 19, 13));
        System.out.println(c.onesDigitSame(23, 19, 12));
        System.out.println(c.onesDigitSame(23, 19, 3));
        System.out.println(c.onesDigitSame(423, 13, 13));
        System.out.println(c.onesDigitSame(23, 29, 25));
        System.out.println("\n");
        
        System.out.println("\t Blackjack");
        System.out.println(c.blackjack(19, 21));
        System.out.println(c.blackjack(21, 19));
        System.out.println(c.blackjack(19, 22));
        System.out.println(c.blackjack(8, 8));
        System.out.println(c.blackjack(25, 24));
        System.out.println(c.blackjack(17, 9));
        System.out.println(c.blackjack(12, 18));
    }
    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return (aSmile == bSmile);
    }
    public boolean negPos(int numOne, int numTwo, boolean isNeg){
        if(isNeg && numOne* numTwo > 0){
            return numOne < 0 && numTwo < 0;
        }
        return (!isNeg && numOne < 0 ^ numTwo < 0);
    }
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep || (isMorning && isMom == false)) {
            return false;
        } else {
            return true;
        }
    }
   public String setAlarm(int day, boolean onVacation){
        if(onVacation && (day == 0 || day == 6)){
            return "off";
        } else if(day == 0 || day == 6 || onVacation) {
            return "10:00";
        }
        return "7:00";
    }
    public boolean onesDigitSame(int x, int y, int z){
        if (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10){
            return true;
        } else {
            return false;
        }
    }
    public int blackjack(int a, int b){
        if(a <= 21 && b <= 21){
            if (a < b){
                return b;
            }
            return a;
        } else if(a > 21 && b > 21){
            return 0;
        }
        else if(a - b > 0){
            return b;
        } 
        else if(b - a > 0){
            return a;
        }

        return 0;
    }
}