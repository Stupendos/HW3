import java.security.spec.RSAOtherPrimeInfo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
byte bad = -128;
short sad = 32000;
int ilon = 1000000;
long light = 1000000000;
float fall = 3.14f;
double down = 3.14;
        System.out.println("Значение переменной bad " + "с типом " + "byte" + " равно " + bad);
        System.out.println("Значение переменной sad " + "с типом short равно " + sad);
        System.out.println("Значение переменной ilon " + "с типом int равно " + ilon);
        System.out.println("Значение переменной light "+ "с типом long равно " + light);
        System.out.println("Значение переменной fall " + "с типом float равно " + fall);
        System.out.println("Значение переменной down "+ "с типом double равно " + down);
        //Задача 2
        float a = 27.12f;
        long c = 987_678_965_549L;
        double b = 2.786;
        short e = 569;
        short f = -159;
        int g = 27897;
        byte h = 67;
        //Задача 3
        byte studentLuda = 23;
        byte studentHannah = 27;
        byte studentKatya = 30;
        short purchasedPaper = 480;
        double PaperOnOneStudent = purchasedPaper / (studentHannah + studentKatya + studentLuda);
        System.out.println("На каждого ученика рассчитано " + PaperOnOneStudent + " листов бумаги");
        //Задача 4
        byte machineOutpatPerTwoMinute = 16;
        short machineOutpatPerTwentyMinute = (short) (machineOutpatPerTwoMinute * 10); //Здесь я умножил на 10, потому что 20 минут = 2 минуты * 10
        int machineOutpatPerday = (machineOutpatPerTwentyMinute * 3)*24; //Логика такая же: двадцать минут умножаем на 3 - получаем час, далее умножаем на количество часов в сутках
        int machineOutpatPerThreeDays = (machineOutpatPerday*3);
        int machineOutpatPerMonth = (machineOutpatPerThreeDays*10);
        System.out.println("За 20 минут машина произвела " + machineOutpatPerTwentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + machineOutpatPerday + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machineOutpatPerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machineOutpatPerMonth + " штук бутылок");
        //Задача 5
        byte wallPaint = 120;
        byte whiteWallPaintForOneClass = 2;
        byte blackWallPaintForOneClass = 4;
        byte wallPaintForOneClass = (byte) (whiteWallPaintForOneClass + blackWallPaintForOneClass);
        byte numberClassesInSchool = (byte) (wallPaint / wallPaintForOneClass);
        byte purchasedWhitePaint = (byte) ( numberClassesInSchool * whiteWallPaintForOneClass);
        byte purchasedBlackPaint = (byte) (numberClassesInSchool * blackWallPaintForOneClass);
        System.out.println("В школе, где " + numberClassesInSchool + " классов, нужно " + purchasedWhitePaint + " банок белой краски и " + purchasedBlackPaint + " банок коричневой краски"); //почему то коричневую краску обозначил черной, но да ладно
        //Задача 6
        short bananas = 5;
        short milk = 200;
        short iceCream = 2;
        short egg = 4;
        short bananasWeight = (short) (bananas * 80);
        short milkWeight = (short) (milk / 100 * 2);
        short iceCreamWeight = (short) (iceCream * 100);
        short eggWeight = (short) (egg * 70);
        short netWeight = (short) (bananasWeight+milkWeight+iceCreamWeight+eggWeight);
        float netWeightKg = netWeight/1000f;
        System.out.println("Вес спортзавтрака спортсменов равен " + netWeight + " грамм");
        System.out.println("Вес спортзавтрака спортсменов равен " + netWeightKg + " кг.");
        //Задача 7
        int weight = 7;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        float weightLossDays1 = 7 / (weightLoss1/1000f);
        float weightLossDays2 = 7 / (weightLoss2/1000f);
        int weightLossAverageDays = (int) ((weightLossDays1+weightLossDays2) / 2);
        System.out.println(weightLossDays1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(weightLossDays2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(weightLossAverageDays + " дней в среднем может потребоваться, чтобы добиться результата похудения.");
        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int newSalaryMasha = (int) (salaryMasha * 1.1);
        int newSalaryDenis = (int) (salaryDenis * 1.1);
        int newSalaryChristina = (int) (salaryChristina * 1.1);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryMasha - salaryMasha) * 12);
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis - salaryDenis) * 12);
        System.out.println("Кристина теперь получает " + newSalaryChristina + " рублей. Годовой доход вырос на " + (newSalaryChristina - salaryChristina) * 12);
    }
}