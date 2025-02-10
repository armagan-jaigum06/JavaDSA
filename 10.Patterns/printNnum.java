public class printNnum {
    public static void main(String[] args) {
        int n = 6;
        for(int line = 1; line<=6; line++){
            for(int number = 1; number<= line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
