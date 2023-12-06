public class whileLoops {
    public static void main(String[] args) {
        whileLoops w = new whileLoops();
        
        System.out.println("\t Add Odds");
        System.out.println(w.addOdds(5));
        System.out.println(w.addOdds(10));
        System.out.println(w.addOdds(15));

        System.out.println("\t Sum Of Digits");
        System.out.println(w.sumDigits(69));
        System.out.println(w.sumDigits(420));
        System.out.println(w.sumDigits(9000));
        
        System.out.println("\t How Many Years");
        System.out.println(w.howManyYears(111.2, 120));
        System.out.println(w.howManyYears(111.2, 150));
        
        System.out.println("\t Print Sum");
        w.printSum(6);
        w.printSum(12);
        w.printSum(18);
        
        System.out.println("\t Perfect Square");
        System.out.println(w.perfectSquare(36));
        System.out.println(w.perfectSquare(100));
        System.out.println(w.perfectSquare(42));
        System.out.println(w.perfectSquare(123456789));
    }
    public int addOdds(int n){
        int i = 1;
        int sum = 0;
        while(i < n){
            sum += i;
            i += 2;
        }
        return sum;
    }
    public int sumDigits(int n){
        int sum = 0;
        while(n > 0){
            sum = n%10 + sum;
            n=n/10;
        }
        return sum;
    }
    public double howManyYears(double startpop, double endpop){
        int years = 0;
        while(startpop < endpop){
            startpop = startpop + startpop * 0.0113;
            years ++;
        }
        return years;
    }
    public void printSum(int n){
        int sum = 0;
        int x = 0;
        int y = 0;
        while(x < n){
            y = n - x;
            sum = sum + y;
            x++;
            if (x == 1){
                System.out.print(x);
            } else {
                System.out.print(" + " + x);
            }
        }
        System.out.println(" = " + sum);
    }
    public boolean perfectSquare(int n){
        int sum = 0;
        int i = 1;
        while(sum < n){
            sum += i;
            i += 2;
    }
    return sum == n;
    }
}