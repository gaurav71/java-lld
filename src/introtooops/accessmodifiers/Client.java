package introtooops.accessmodifiers;

import introtooops.accessmodifiers.instructor.StudentIterator;
import introtooops.accessmodifiers.student.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        // public member accessible everywhere
        student.name = "Gaurav";

        // private member not accessible outside class methods.
        // student.age = 20;

        // default member only accessible within package (parent package also considered as diff package)
        // student.batch = "b2";

        // protected member only accessible within package (parent package also considered as diff package)
        // student.email = "gaurav@email.com";
    }
}
