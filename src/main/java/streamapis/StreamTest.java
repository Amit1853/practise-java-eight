package streamapis;

import model.Address;
import model.MobileNumber;
import model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

        List<Student> students = Arrays.asList(student1, student2, student3);

        /*****************************************************
         Get student with exact match name "jayesh"
         *****************************************************/

        Optional<Student> student = students.stream().filter(s -> s.getName().equals("Jayesh")).findFirst();
        students.stream().filter(s -> s.getName().equals("Jayesh")).forEach(System.out::println);
        System.out.println("--------------------");
        /*****************************************************
         Get student with matching address "1235"
         *****************************************************/

        List<Student> studentList = students.stream().filter(s -> s.getAddress().getZipcode().equals("1235")).collect(Collectors.toList());
        studentList.forEach(System.out::println);
        System.out.println("--------------------");
        /*****************************************************
         Get all student having mobile numbers 3333.
         *****************************************************/
        List<Student> studentMobile = students.stream().filter(s -> s.getMobileNumbers().stream().anyMatch(a -> a.getNumber().equals("3333"))).collect(Collectors.toList());
        String resultMob = studentMobile.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
        System.out.println(resultMob);
        System.out.println("--------------------");
        /*****************************************************
         Get all student having mobile number 1233 and 1234
         *****************************************************/

        List<Student> studentMobiles = students.stream().filter(s -> s.getMobileNumbers().stream().allMatch(x -> {
                    return x.getNumber().equals("1233") || x.getNumber().equals("1234");
                }))
                .collect(Collectors.toList());

        String mobiles = studentMobiles.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
        System.out.println(mobiles);
    }
}
