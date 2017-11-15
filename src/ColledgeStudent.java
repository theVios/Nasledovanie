import java.util.Scanner;

public class ColledgeStudent extends Student {

    private static int year;
    private static String major;

    public ColledgeStudent(String name, int age, String gender) {
        super(name, age, gender);
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите год учебы и специальность студента колледжа");
        year=scanner.nextInt();
        major=scanner.nextLine();
      //  System.out.println("name- "+name+"  "+"age- "+age+"  "+"gender- "+gender+"  "+"id- "+idNumber+ "  "+"gpa- "+gpa);
    }


    public static void setYear(int year) {
        ColledgeStudent.year = year;
    }

    public static void setMajor(String major) {
        ColledgeStudent.major = major;
    }


    public static int getYear() {
        return year;
    }

    public static String getMajor() {
        return major;
    }
    public static String vivod() {
        System.out.println(getName() + ", " + "age: " + getAge() + ", " + "gender: " + getGender()+ ", "+"id: "+getIdNumber()+ ", "+"gpa: "+getGpa()+ ", "+"year: "+getYear()+ ", "+"major: "+getMajor());
        return " ";
    }


}
