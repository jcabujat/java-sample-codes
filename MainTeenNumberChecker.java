public class Main {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 25;
        int num3 = 13;
        boolean hasTeen = TeenNumberChecker.hasTeen(num1,num2,num3);
        System.out.println(hasTeen);

        int age = 12;
        boolean isTeen = TeenNumberChecker.isTeen(age);
        System.out.println(isTeen);
    }
}
