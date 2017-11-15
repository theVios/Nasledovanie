import java.util.Scanner;

public class Person {

    public Person(String name, int age, String gender) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите имя, пол и возраст человека");
        name=scanner.nextLine();
        gender=scanner.nextLine();
        age=scanner.nextInt();
       // System.out.println("name- "+name+"   "+"age"+age+"  "+"gender"+gender);
    }


    private static String name;

    private static int age;

    private static String gender;


    public static String getName() {
      // System.out.println(name);
        return name;
    }

    public static int getAge() {
      // System.out.println(age);
        return age;
    }

    public static String getGender() {
       //System.out.println(gender);
        return gender;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public static void setGender(String gender) {
        Person.gender = gender;
    }

    public static String vivod(){
        System.out.println(getName()+", "+"age: "+getAge()+", "+"gender: "+getGender());
        return" ";
    }

}
