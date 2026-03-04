package Assignments.Assignment1.module2;

public class Student {

        String name;
        int age;

        // Default Constructor
        Student() {
            name = "Unknown";
            age = 0;
        }

        // Parameterized Constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {

            // Using Default Constructor
            Student s1 = new Student();
            s1.display();

            System.out.println();

            // Using Parameterized Constructor
            Student s2 = new Student("Sushmita", 20);
            s2.display();
        }
    }

