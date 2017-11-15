import java.util.Scanner;

public class Teacher extends Person {


    private static double sallary;
    private static String subject;

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите предмет и зарплату преподователя");
        name=scanner.nextLine();
        age=scanner.nextInt();
        gender=scanner.nextLine();
        subject=scanner.nextLine();
        sallary=scanner.nextInt();
        System.out.println("name- "+name+"  "+"age- "+age+"  "+"gender- "+gender+"  "+"sallary- "+sallary+ "  "+"subj- "+subject);
    }

    public static double getSallary() {
        return sallary;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setSallary(double sallary) {
        Teacher.sallary = sallary;
    }

    public static void setSubject(String subject) {
        Teacher.subject = subject;
    }

    public static String vivod() {
        System.out.println(getName() + ", " + "age: " + getAge() + ", " + "gender: " + getGender()+ ", "+"sallary: "+getSallary()+ ", "+"subject: "+getSubject());
        return " ";
    }
}
