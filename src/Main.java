import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Данные вводимые пользователем
        //1
//        int a = in.nextInt();
//        int b = in.nextInt();
        //2
//        int year = in.nextInt();
        //3
//        int sale = in.nextInt();
        //4
//        int number = in.nextInt();
        //5
//        System.out.println("Введите число которое нужно проверить");
//        int number_1=in.nextInt();

        //6
//        System.out.println("Введите количесто целых минут разговора: ");
//        int minut = in.nextInt();
//        System.out.println("Введите порядковый номер дня недели от 1 до 7 ");
//        int day = in.nextInt();

        //7 , 8
//        System.out.println("Введите трехзначное число");
//        int value = in.nextInt();

        //9
//        System.out.println("Введите два вещественных числа: ");
//        float x = in.nextFloat();
//        float y = in.nextFloat();

        //10
        System.out.println("Введите 2 числа :");
        int a = in.nextInt();
        int b = in.nextInt();


        //Вывод методов
//        function_1(a,b);

//        function_2(year);

//        function_3(sale);

//        System.out.println("Введите число: ");
//        function_4(number);

//        function_5(number_1);

//        function_6(minut,day);

//        function_7(value);

//        function_8(value);

//        function_9(x ,  y);

        function_10(a,b);

    }
    public static void function_1(int a , int b){
        //Задание первое
        System.out.println("Введите значение a разделить на b");

        if(b==0){
            System.out.println("На ноль делить нельзя");
        }
        else
            System.out.println(a/b);

    }
    public static void function_2(int year){
        //Задание второе

        System.out.println("В каком году была основана Одесса?");
        if(year != 1974){
            System.out.println(year);
            System.out.println("Вы ошиблись, Одесса была основана в 1974 году");
        }else {
            System.out.println("Все верно, Одесса была основана в "+year+" году");
        }

    }

    public static void function_3(int sale){
        //Задание третье
        float discount;
        if(sale >= 500 && sale < 1000){
            discount = (float)(sale - ( sale*0.03)) ;
            System.out.println(sale+" - Ваши деньги. "+"Вы получили скидку в 3% и стоимость составляет : "+discount);
        }else if(sale >= 1000){
            discount = (float)(sale - ( sale*0.05)) ;
            System.out.println(sale+" - Ваши деньги. "+"Вы получили скидку в 5% и стоимость составляет : "+discount);
        }else
            System.out.println(sale+" - Ваши деньги. "+"Вы купили товара общая стоимость которого не привышает 500, НИКАКОЙ СКИДОЧКИ !)");
    }

    public static void function_4(int number){
        int answer = number % 2;
        if (answer == 1){
                        System.out.println("Число "+number+" - нечетно");
        }else
            System.out.println("Число "+number+" - четно");
    }

    public static void function_5(int number_2){
        int answer = number_2 % 3;
        if (answer == 1){
            System.out.println("Число "+number_2+" - нацело на три не делится");
        }else
            System.out.println("Число "+number_2+" - делится нацело на три");
    }

    public static void function_6(int minut, int day){
        float priceForMinute = (float) 2.3;
        float priceForAllTime = priceForMinute * (float) minut;
        if(day == 6 || day == 7){
            System.out.println("Длительность разговора - "+minut);
            System.out.println("День недели - " + day);
            System.out.println("В этот день действует скидка 20%.");
            float priceWithDiscount = priceForAllTime - (priceForAllTime*(float) 0.2);
            System.out.println("Стоимость разговора: "+priceWithDiscount);
        }else if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5){
            System.out.println("Длительность разговора - "+minut);
            System.out.println("День недели - " + day);
            System.out.println("Стоимость разговора: "+priceForAllTime);
        }else
            System.out.println("Первый раз слышу о таком дне))");

    }

    public static void function_7(int value){
        int num1 = (value / 100);
        int num2 = (value/10)%10 ;
        int num3 = value % 10;
        if(num1 > num3 )
            System.out.println("Первое значение : "+num1+" > "+num3+" : Третьего значения");
        else if(num1 < num3 )
            System.out.println("Третье значение : "+num3+" > "+num1+" : Первого значения");
        else
            System.out.println("Первое значение : "+num1+" = "+num3+" : Третьему значаению");

        if(num1 > num2 )
            System.out.println("Первое значение : "+num1+" > "+num2+" : Второго значения");
        else if(num1 < num2 )
            System.out.println("Второе значение : "+num2+" > "+num1+" : Первого значения");
        else
            System.out.println("Первое значение : "+num1+" = "+num2+" : Второму значению");

        if(num2 > num3 )
            System.out.println("Второе значение : "+num2+" > "+num3+" : Третьего значения");
        else if(num2 < num3 )
            System.out.println("Третье значение : "+num3+" > "+num2+" : Второго значения");
        else
            System.out.println("Второе значение : "+num2+" = "+num3+" : Третьему значаению");
        System.out.println(value +" "+ num1 +" "+num2 +" "+ num3);
    }

    public static void function_8( int value){
        int pow2Value = (int)Math.pow(value,2);
        int num1 = (value / 100);
        int num2 = (value/10)%10 ;
        int num3 = value % 10;
        int sumCube = (int)Math.pow(num1,3) + (int)Math.pow(num2,3) + (int)Math.pow(num3,3);
        if(pow2Value > sumCube){
            System.out.println(pow2Value+ " Число возведенное во вторуе степень > чем сумма кубов цифр данного числа " +sumCube);
        }else if(sumCube > pow2Value){
            System.out.println(sumCube+ " Сумма кубов цифр данного числа > чам число возведенное во вторую степень "+pow2Value);
        }
        else
            System.out.println("Они равны");
    }

    public static void function_9(float x, float y){
        float a = x,b = y;
        if(a != b){
            if(a > b){
                System.out.println("Число X больше числа Y");
                b = (a+b)/2;
                x = 2*a*y;
                System.out.println("X: "+x+" Y: "+b);
            }else{
                System.out.println("Число Y больше числа X");
                a = (a+b)/2;
                y = 2*b*x;
                System.out.println("X: "+a+" Y: "+y);
            }
        }  else
            System.out.println("Числа X и Y равны");
    }

    public static void function_10(int a , int b){
        int x0 = 0;
        float x1 = (float) Math.sqrt(b/a);
        float x2 = (float) - Math.sqrt(b/a);
        System.out.println("X0: "+x0+" X1: "+x1+" X2: "+x2);
    }
}
