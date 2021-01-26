package student;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student[] stu = new Student[5];
        stu[0] = new Student(1, "Мазурова", "Наталья", "Андреевна", new Date(1997, 12, 29), "Славинского-27", 293850426, "Приборостроительный", 4, "11309115");
        stu[1] = new Student(2, "Силивестров", "Андрей", "Сергеевич", new Date(1994, 3, 5), "Казинца-22", 335092754, "Физический", 1, "10155119");
        stu[2] = new Student(3, "Щур", "Карина", "Сергеевна", new Date(1992, 9, 16), "Олешкевича-45", 251120475, "Физический", 1, "10155119");
        stu[3] = new Student(4, "Тельпук", "Алексей", "Андреевич", new Date(1998, 7, 9), "Сурганова-47", 296990056, "Бизнес и право", 3, "11902116");
        stu[4] = new Student(5, "Силичев", "Влад", "Владиславович", new Date(1995, 1, 14), "Калиновского-123", 290073428, "Бизнес и право", 3, "11902116");



        System.out.println("Студенты Физического факультета");
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            stu[i].fakultet();
        }
        System.out.println("Студенты факультета Бизнес и право 3 курса");
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            stu[i].fakkurs();
        }
        Date p=new Date(1995, 1, 1);
        System.out.println("Студенты родившиеся после "+ p);
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].date_roj(p);
        }
        System.out.println("Студенты группы 10155119");
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].groupp();
        }




    }
}