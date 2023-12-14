public class FactorialClass {
    public static void main(String[] args){
        FactorialClass f = new FactorialClass();

        System.out.println("\t Calculate Factorial");
        for(int n = 1; n <= 20; n++){
            System.out.println(n + "! = " + f.calcFactorial(n));
        }
        
        System.out.println("\n");
        System.out.println("\t Calculate E");
        System.out.printf("e is %2.3f\n", f.calcE());

        System.out.println("\n");
        System.out.println("\t Calculate EX");
        for(int x = 1; x <= 5; x++){
            System.out.printf("e is %2.3f\n", Math.pow(f.calcEX(), x));
        }
    }
    public long calcFactorial(int n){
        long product = 1;
        int x = 0;
        int y = 0;
        while(x < n){
            y = n - x;
            product = product * y;
            x++;
        }
        return product;
    }
    public double calcE(){
        double e = 1.0;
        double oldE = 0.0;
        int i = 1;
        while (Math.abs(e - oldE) > 0.001){
            oldE = e;
            e += 1.0 / calcFactorial(i);
            i++;
        }
        return e;
    }
    public double calcEX(){
        double e = 1.0;
        double oldE = 0.0;
        int i = 1;
        while (Math.abs(e - oldE) > 0.001){
            oldE = e;
            e += 1.0 / calcFactorial(i);
            i++;
        }
        return e;
    }
}