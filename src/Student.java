import java.util.Scanner;

public class Student extends Person {

    private static  double gpa;
    private static String idNumber;

    public Student(String name, int age, String gender) {
        super(name, age, gender);
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите id номер студента и его среднюю оченку");
        Student.idNumber =scanner.nextLine();
        Student.gpa =scanner.nextInt();
        System.out.println("name- "+name+"  "+"age- "+age+"  "+"gender- "+gender+"  "+"id- "+idNumber+ "  "+"gpa- "+gpa);
    }

    public static String getIdNumber() {
        return idNumber;
    }

    public static double getGpa() {
        return gpa;
    }



    public static void setIdNumber(String idNumber) {
        Student.idNumber = idNumber;
    }

    public static void setGpa(double gpa) {
        Student.gpa = gpa;
    }
    public static String vivod() {
        System.out.println(getName() + ", " + "age: " + getAge() + ", " + "gender: " + getGender()+ ", "+"id: "+getIdNumber()+ ", "+"gpa: "+getGpa());
        return " ";
    }
}
