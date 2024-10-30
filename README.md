Association Relationship in Object-Oriented Programming
This project demonstrates the concept of Association Relationship in Object-Oriented Programming (OOP). Association is one of the core concepts of OOP, where two classes are connected but maintain their independence. In an association relationship, the classes have a "has-a" relationship, meaning that one class uses or references objects of another class without necessarily "owning" them.

Repository Link: Association Relationship GitHub Repository

Project Overview
In this project, we use an example to illustrate an association relationship between classes. We chose two classes, Student and Course, where a Student can enroll in multiple Courses, and a Course can have multiple Students enrolled. This showcases an association without ownership—neither the Student owns the Course nor the Course owns the Student.

Key Concepts
Association Relationship: Demonstrates how one class can have a reference to another class, forming a relationship that connects objects without ownership.
Multiplicity: Illustrates how one instance of a class (e.g., Student) can relate to multiple instances of another class (e.g., Course) and vice versa.
Loose Coupling: Since neither class controls the lifecycle of the other, this association promotes flexibility and reuse in OOP.

Class Diagram
+---------+         +---------+
| Student |         | Course  |
+---------+         +---------+
| name    |         | title   |
| id      |         | code    |
+---------+         +---------+
     |                    |
     +--------------------+
           Association

Files Included
Student.java: Represents the Student class.
Course.java: Represents the Course class.
Main.java: Contains the main method to run the example and demonstrate the association between Student and Course.
Getting Started
Prerequisites
Java Development Kit (JDK) 8+ installed on your system.
Setup

1. Clone the repository:

git clone https://github.com/mtaqi04/Association-Relationship.git

2. Navigate to the project directory:

cd Association-Relationship

3. Compile the Java files:

javac *.java

4. Run the example:

java Main



Project Details
Association Example
In this example:

Each Student can enroll in multiple Courses.
Each Course can have multiple Students.
This many-to-many association is represented through the code, where instances of Student and Course reference each other without taking ownership of one another.

Code Snippets
Creating and Enrolling Students

Student student1 = new Student("Alice", 1001);
Student student2 = new Student("Bob", 1002);

Course course1 = new Course("Math", "MTH101");
Course course2 = new Course("Science", "SCI101");

// Enroll students in courses
student1.enroll(course1);
student1.enroll(course2);

student2.enroll(course1);


Displaying Enrollments

System.out.println(student1.getCourses());
System.out.println(course1.getStudents());


Learning Objectives
Understand the concept of association relationships in OOP.
Distinguish between association and other relationships like composition and aggregation.
Implement association relationships to enhance modularity and reusability.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
For any questions or suggestions, please reach out through the GitHub repository's issues section.
