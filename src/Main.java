public class Main
{
    public static void main(String[] args)
    {
        //Задание 6
        var ABoxer = 78.2; //кг
        var BBoxer = 82.7; //кг
        var CommonWeight = ABoxer+BBoxer;
            System.out.println("Общий вес двух боксёров: " + CommonWeight + " кг");
        var differenceAB_One = BBoxer-ABoxer;
            System.out.println("Разница в весе " + differenceAB_One + " кг");

        //Задание 7
        var differenceAB_Second = BBoxer%ABoxer;
            System.out.println("Ещё разок ;)))...");
            System.out.println("Разница в весе: " + differenceAB_Second +" кг");

        System.out.println("-------------");

        //Задание 8
        var SummHoursDay = 640; //часов
        var OneWorker = 8;      //Часов
        var Workers = SummHoursDay/OneWorker;
            System.out.println("Всего работников в компании - " + Workers + "человек.");
        var NewWokers = 94;
        var SummWokers= Workers+NewWokers;
        var NewHoursDay = SummWokers*OneWorker;
            System.out.println("Если в компании работает " + SummWokers + ", то всего " + NewHoursDay + " часов работы может быть поделено между сотрудниками.");

    }
}