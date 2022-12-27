public class Main {
   public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();


    }

    public static void task1() {
       System.out.println("Задача 1 ");
       byte a = 27;
       System.out.println("Значение переменной a с типом byte " + a + " равно");
       int b = 300;
       System.out.println("Значение переменной b с типом int " + b + " равно");
       short c = 30300;
       System.out.println("Значение переменной c с типом short " + c + " равно");
       long d = 8000000;
       System.out.println("Значение переменной d c типом long " + d + " равно");
       float e = 3.43f;
       System.out.println("Значение переменной e с типом float " + e + " равно");
       double f = 6.514;
       System.out.println("Значение переменной f с типом double " + f + " равно");


    } public static void task2() {
        System.out.println("Задача 2 ");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

    }   public static void task3() {
       System.out.println("Задача 3 ");
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        int totalPupils = classOne + classTwo + classThree;
        System.out.println("Всего в классах " + totalPupils + " учеников");
        short totalSheets = 480;
        byte sheetsPupil = (byte) (totalSheets / totalPupils);
        System.out.println("На каждого ученика рассчитано " + sheetsPupil + " листов бумаги");

    } public static void task4() {
       System.out.println("Задача 4 ");
       byte twoMinutes = 16;
       byte oneMinutes = (byte) (twoMinutes / 2);
       System.out.println("За 1 минуту машина произвела " + oneMinutes + " штук бутылок");
       short twentyMinutes = (short) (oneMinutes * 20);
       System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
       short oneHour = (short) (oneMinutes * 60);
       System.out.println("За 1 час машина произвела " + oneHour + " штук бутылок");
       short oneDay = (short) (oneHour * 24);
       System.out.println("За сутки машина произела " + oneDay + " штук бутылок");
       int threeDays = oneDay * 3;
       System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
       int oneMonth = oneDay * 30;
       System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");

    } public static void task5() {
       System.out.println("Задача 5 ");
       byte whitePaint = 2;
       byte brownPaint = 4;
       byte paintClass = (byte) (whitePaint + brownPaint);
       System.out.println("Всего на класс ушло " + paintClass + " банок краски");
       byte totalPaint = 120;
       byte totalClass = (byte) (totalPaint / paintClass);
       System.out.println("В школе " + totalClass + " классов");
       byte needWhitepaint = (byte) (totalClass * whitePaint);
       System.out.println("В школе, где 20 классов нужно " + needWhitepaint + " банок белой краски");
       byte needBrownpaint = (byte) (totalClass * brownPaint);
       System.out.println("В школе, где 20 классов нужно " + needBrownpaint + " банок белой краски");
    } public static void task6() {
       System.out.println("Задача 6");
       short bananasGramm = 400;
       short milkGramm = 210;
       short iceCreamgramm = 200;
       short eggsGramm = 280;
       short weightBreakfast = (short) (bananasGramm + milkGramm + iceCreamgramm + eggsGramm);
       System.out.println("Вес спортзавтрака " + weightBreakfast + " грамм");
       short oneKg = 1000;
       double breakfastKg = (double) weightBreakfast / oneKg;
       System.out.println("Вес спортзавтрака  " + breakfastKg + " кг");

   } public static void task7() {
       System.out.println("Задача 7");
       byte weightKg = 7;
       short weightGramm = (short) (weightKg * 1000);
       System.out.println(" 7 кг равно " + weightGramm + " грамм");
       short weightLoss1 = 250;
       short weightLoss2 = 500;
       byte weightLossdays1 = (byte) (weightGramm / weightLoss1);
       System.out.println("Уйдет на похудение " + weightLossdays1 + " дней при потере веса 250 грамм в день");
       byte weightLossdays2 = (byte) (weightGramm / weightLoss2);
       System.out.println("Уйдет на похудение " + weightLossdays2 + " дней при потере веса 500 грамм в день");
       byte totalDays = (byte) (weightLossdays1 + weightLossdays2);
       System.out.println("Всего уйдет на похудение " + totalDays + " дня");
       byte daysAverage = (byte) (totalDays / 2);
       System.out.println("Для результата похудения может потребоваться в среднем " + daysAverage + " день");

    } public static void task8() {
       System.out.println("Задача 8");
       int salaryMasha = 67760;
       int salaryDenis = 83690;
       int salaryKristina = 76230;
       byte salaryPercent = 10;
       int salaryIncrease1 = salaryMasha * salaryPercent / 100 + salaryMasha;
       System.out.println("Маша теперь получает " + salaryIncrease1 + " рублей");
       int salaryIncrease2 = salaryDenis * salaryPercent / 100 + salaryDenis;
       System.out.println("Денис теперь получает " + salaryIncrease2 + " рублей");
       int salaryIncrease3 = salaryKristina * salaryPercent / 100 + salaryKristina;
       System.out.println("Кристина теперь получает " + salaryIncrease3 + " рублей");
       byte oneYear = 12;
       int annualIncome1 = salaryMasha * oneYear;
       System.out.println("Годовой доход Маши без повышения " + annualIncome1 + " рублей");
       int annualIncome2 = salaryDenis * oneYear;
       System.out.println(" Годовой доход Дениса без повышения " + annualIncome2 + " рублей");
       int annualIncome3 = salaryKristina * oneYear;
       System.out.println("Годовой доход Кристины без повышения " + annualIncome3 + " рублей");
       int annualIncomeM = salaryIncrease1 * oneYear;
       System.out.println("Годовой доход Маши с учетом повышения " + annualIncomeM + " рублей");
       int annualIncomeD = salaryIncrease2 * oneYear;
       System.out.println("Годовой доход Дениса с учетом повышения " + annualIncomeD + " рублей");
       int annualIncomeK = salaryIncrease3 * oneYear;
       System.out.println("Годовой доход Кристины с учетом повышения " + annualIncomeK + " рублей");
       int differSalaryM = annualIncomeM - annualIncome1;
       System.out.println("Маша теперь получает 74536 рублей на " + differSalaryM + " рублей годовой доход вырос");
       int differSalaryD = annualIncomeD - annualIncome2;
       System.out.println("Денис теперь получает 92059 рублей на " + differSalaryD + " рублей годовой доход вырос");
       int differSalaryK = annualIncomeK - annualIncome3;
       System.out.println("Кристина теперь получает 83853 рублей на " + differSalaryK + " рублей годовой доход вырос");




    }

    }



