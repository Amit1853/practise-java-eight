package test.privatefield;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class ImplementStudent {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student s = new Student();
        s.setName("Amit");
        s.setDob(LocalDate.now());

        Field privateFieldDob = Student.class.getDeclaredField("dob");
        privateFieldDob.setAccessible(true);

        LocalDate dob = (LocalDate) privateFieldDob.get(s);
        System.out.println(dob);

        Method method = Student.class.getDeclaredMethod("getStudentName", String.class);
        method.setAccessible(true);
        String name = "Ram";
        String returnValue = (String) method.invoke(s);
        System.out.println(returnValue);

    }
}
