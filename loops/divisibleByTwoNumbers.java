package loops;

class  divisibleByTwoNumbers{
    public static void main(String[] args) {
        int num = 1;
        while(true){
            if((num % 3 ==0) && (num % 8 == 0)){
                System.out.println("ans found "+ num);
                break;
            }
            num++;
        }
    }
}