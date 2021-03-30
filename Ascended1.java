public class Ascended1 {
    public static void main(String[] args){
        for(int x = 1; x<= 500; x++){
            if(CheckNumber(x)){
                System.out.println(x);
            }
        }
    }
    public static boolean CheckNumber(int num){
        boolean prime = true;
        for (int y = 2; y<= num/2; y++){
            if (num % y == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
