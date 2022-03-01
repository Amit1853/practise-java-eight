package streamapis;

import model.Address;
import model.MobileNumber;
import model.Student;
import model.TempStudent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CreateStudentFromTemp {
    public static void main(String[] args) {
        /*****************************************************
         Create a List<Student> from the List<TempStudent>
         *****************************************************/
        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));

        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
        List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);

        List<Student> studentList = tmpStudents.stream().map(tmpStudent -> {
            Student s = new Student();
            s.setName(tmpStudent.name);
            s.setAddress(tmpStudent.address);
            s.setMobileNumbers(tmpStudent.mobileNumbers);
            s.setAge(tmpStudent.age);
            return s;
        }).collect(Collectors.toList());
        studentList.stream().forEach(System.out::println);
        System.out.println("--------------------");
        /*****************************************************
         Convert List<Student> to List<String> of student name
         *****************************************************/
        List<String> studentNames = studentList.stream().map(std -> std.getName()).collect(Collectors.toList());
        System.out.println(studentNames.stream().collect(Collectors.joining(",")));
        System.out.println(studentNames.stream().collect(Collectors.joining(",", "[", "]")));
        System.out.println("--------------------");

        /*****************************************************
         Convert List<students> to String
         *****************************************************/
        System.out.println(studentList.stream().map(Student::getName).collect(Collectors.joining(",")));
        System.out.println("--------------------");

        /*****************************************************
         Change the case of List<String>
         *****************************************************/
        List<String> nameList = Arrays.asList("Joyash", "Jayesh", "Dany", "Khyati", "Hello", "Mango", "dany");
        List<String> upperCaseNameList = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseNameList);
        System.out.println("--------------------");
        /*****************************************************
         Sort List<String>
         *****************************************************/
        List<String> sortedNames = nameList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        System.out.println("--------------------");

        /*****************************************************
         get names start with letter J
         *****************************************************/
        List<String> sortNames = nameList.stream().filter(std -> std.startsWith("j") || std.startsWith("J")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortNames);
    }
}
