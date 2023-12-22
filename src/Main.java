public class Main {
    public static void main(String[] args) {
        //1
        for (int i = 1; i <= 10; i = i + 1){
            System.out.println(i);
        }
        //2
        for (int i = 10; i >=1; i = i - 1){
            System.out.println(i);
        }
        //3
        for (int i = 2; i < 17; i = i + 2){
            System.out.println(i);
        }
        //4
        for (int i = 10; i >= -10; i = i - 1){
            System.out.println(i);
        }
        //5
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
        //6
        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }
        //7
        for (int i = 2; i <= 512; i = i * 2){
            System.out.println(i);
        }
        //8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i = i + 1){
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //9
        int salary2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i = i + 1){
            total2 = total2 + total2/100;
            total2 = total2 + salary2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        //10
        for (int i = 1; i <=10; i = i + 1){
            int n = 2 * i;
            System.out.println("2*" + i + "=" + n);
        }

    }
}