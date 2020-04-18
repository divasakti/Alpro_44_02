public class Responsi5{

    static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i<=Math.sqrt(n);i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 3;

        if (x>y){
            System.out.println(x + ">" + y);
        }
        if (y>x) {
            System.out.println(y+">"+x);
        }
        if (x>z){
            System.out.println(x+">"+z);
        }
        if (y>z){
            System.out.println(y+">"+z);
        }
        if (z>y){
            System.out.println(z+">"+y);
        }
        if (z>x){
            System.out.println(z+">"+x);
        }

        if(isPrime(19)) {
            System.out.println(19 + " bilangan prima");
        }
        else {
            System.out.println(19 + " bukan bilangan prima");
        }
    }
}
