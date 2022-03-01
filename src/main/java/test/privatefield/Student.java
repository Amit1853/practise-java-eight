package test.privatefield;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    private String getStudentName() {
        return this.name;
    }
}
