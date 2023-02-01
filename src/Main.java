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
        System.out.println("Task 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Task 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);

    }
    public static void task3 () {
        System.out.println("Task 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalweight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalweight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
    }
    public static void task7 () {
        System.out.println("Task 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference2);
    }
    public static void task8 () {
        System.out.println("Task 8");
        var workingHours = 640;
        var personalHours = 8;
        var employees = workingHours / personalHours;
        System.out.println("Всего работников в компании - " + employees + " человек");
        var totalEmployees = employees + 94;
        var totalHours = totalEmployees * personalHours;
        System.out.println("Если в компании работает " + totalEmployees + ", то всего " + totalHours + " может быть поделено между сотрудниками");
    }
}