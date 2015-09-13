public class ActivationRecord { // demo of the stack by a complicated way to add numbers

    public static int increment(int x){
        System.out.print("Calling increment(int x) with argument on the stack: ");
        System.out.println("  x: " + x);
        return x + 1;
    }

    public static int add(int x, int y) { // call by value: arg values are copied to params
        System.out.println("Calling add(int x, int y) with argumnets on the stack: ");
        System.out.println("  x: " + x);
        System.out.println("  y: " + y);

        for (int i = 1; i <= y; i++){  // this only works for positive y arguments
            x = increment(x);          // paramters are mutable *local* variables in Java
        }
        
        return x;
    }

    public static void main(String[] args){
        int x = increment(41);
        System.out.println("Local variable x in main: " + x);
        System.out.println("add(x, x)        returns: " + add(x, x));
        System.out.println("Local variable x in main: " + x); //local x not changed by add
    }
}