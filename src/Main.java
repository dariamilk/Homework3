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

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 35676484;
        byte b = 18;
        short c = 3546;
        long d = 7473744902L;
        float e = 5.7759f;
        double f = 73.98449;
        System.out.println("Значение переменной a с типом int = " + a);
        System.out.println("Значение переменной b с типом byte = " + b);
        System.out.println("Значение переменной c с типом short = " + c);
        System.out.println("Значение переменной d с типом long = " + d);
        System.out.println("Значение переменной e с типом float = " + e);
        System.out.println("Значение переменной f с типом double = " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsNumberInClass1 = 23;
        byte studentsNumberInClass2 = 27;
        byte studentsNumberInClass3 = 30;
        int paperCount = 480;
        int paperCountPerStudent = (paperCount / (studentsNumberInClass1 + studentsNumberInClass2
                        + studentsNumberInClass3));
        System.out.println("На каждого ученика рассчитано " + paperCountPerStudent + " листов бумаги.");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte bottlesCount = 16;
        byte productionPer2Minutes = 2;
        byte bottlesPerMinute = (byte) (bottlesCount / productionPer2Minutes);
        short bottlesPer20Minutes = (short) (bottlesPerMinute * 20);
        short bottlesPerDay = (short) (bottlesPerMinute * (24 * 60));
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок.");
        System.out.println("За 1 день машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок.");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte whitePaintTinsPerRoom = 2;
        byte brownPaintTinsPerRoom = 4;
        byte totalNumberOfPaintTins = 120;
        byte totalNumberOfWhitePaintTins = (byte) (totalNumberOfPaintTins / (whitePaintTinsPerRoom + brownPaintTinsPerRoom) * whitePaintTinsPerRoom);
        byte totalNumberOfBrownPaintTins = (byte) (totalNumberOfPaintTins / (whitePaintTinsPerRoom + brownPaintTinsPerRoom) * brownPaintTinsPerRoom);
        byte numberOfRooms = (byte) (totalNumberOfPaintTins / (whitePaintTinsPerRoom + brownPaintTinsPerRoom));
        System.out.println ("В школе, где " + numberOfRooms + " классов, нужно "
                + totalNumberOfWhitePaintTins + " банок белой краски и "
                + totalNumberOfBrownPaintTins + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananasNumber = 5;
        short milkVolume = 200;
        byte icecreamBricketNumber = 2;
        byte eggNumber = 4;
        byte bananaWeight = 80;
        byte milkWeightPer100Ml = 105;
        byte icecreamWeight = 100;
        byte eggWeight = 70;
        short totalBreakfastWeightInGrams = (short) ((bananaWeight * bananasNumber) + (milkWeightPer100Ml * milkVolume / 100)
                                + (icecreamWeight * icecreamBricketNumber) + (eggWeight * eggNumber));
        short gramsPerKg = 1000;
        float totalBreakfastWeightInKg = totalBreakfastWeightInGrams / (float) gramsPerKg;
        System.out.println ("Вес завтрака в граммах – " + totalBreakfastWeightInGrams +
                " грамм, вес завтрака в килграммах – " + totalBreakfastWeightInKg + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weightToLoseInKg = 7;
        short minWeightLossPerDay = 250;
        short maxWeightLossPerDay = 500;
        short gramsPerKg = 1000;
        short maxDaysToLoseWeight = (short) ((weightToLoseInKg * gramsPerKg) / minWeightLossPerDay);
        short minDaysToLoseWeight = (short) ((weightToLoseInKg * gramsPerKg) / maxWeightLossPerDay);
        double midDaysToLoseWeight = (double) (weightToLoseInKg * gramsPerKg) / ((maxWeightLossPerDay + minWeightLossPerDay) / 2d);
        System.out.println("Если спортсмен будет терять каждый день по " + minWeightLossPerDay + " грамм, то он похудеет за "
                + maxDaysToLoseWeight + " дней. Если спортсмен будет терять каждый день по " + maxWeightLossPerDay
                + " грамм, то он похудеет за " + minDaysToLoseWeight + " дней. В среднем, спортсмен может похудеть за "
                + midDaysToLoseWeight + " день.");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int firstEmployerSalary = 67760;
        int secondEmployerSalary = 83690;
        int thirdEmployerSalary = 76230;
        byte salaryIncreasePercent = 10;
        int firstEmployerSalaryIncreased = firstEmployerSalary + (firstEmployerSalary * salaryIncreasePercent / 100);
        int secondEmployerSalaryIncreased = secondEmployerSalary + (secondEmployerSalary * salaryIncreasePercent / 100);
        int thirdEmployerSalaryIncreased = thirdEmployerSalary + (thirdEmployerSalary * salaryIncreasePercent / 100);
        int increaseInFirstEmployerSalaryPerYear = (firstEmployerSalaryIncreased * 12) - (firstEmployerSalary * 12);
        int increaseInSecondEmployerSalaryPerYear = (secondEmployerSalaryIncreased * 12) - (secondEmployerSalary * 12);
        int increaseInThirdEmployerSalaryPerYear = (thirdEmployerSalaryIncreased * 12) - (thirdEmployerSalary * 12);
        System.out.println("Маша теперь получает " + firstEmployerSalaryIncreased + " рублей. Годовой доход Маши вырос на "
                + increaseInFirstEmployerSalaryPerYear + " рублей. Денис теперь получает " + secondEmployerSalaryIncreased
                + " рублей. Годовой доход Дениса вырос на " + increaseInSecondEmployerSalaryPerYear
                + " рублей. Кристина теперь получает " + thirdEmployerSalaryIncreased
                + " рублей. Годовой доход Кристины вырос на " + increaseInThirdEmployerSalaryPerYear + " рублей.");
    }
}