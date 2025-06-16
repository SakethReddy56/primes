public class prime{
    public static void main(String[] args) {
        System.out.println("prime numBers between 2 and 100:");
        for(int num=2;num<=100;num++){
        boolean isPrime =true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%2==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
        System.out.print(num+" ");
        }
        }

    }
}