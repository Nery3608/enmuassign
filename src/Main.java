import org.school.model.*;

public class Main {

    public static void main(String[] args) {

        // TODO 0: Make an enum named Subject with values of Math, English, Japanese, Chemistry, and Software Development
        // TODO 0.5: make an enum named GradeLevel with values of Freshmen, Sophomore, Junior, and Senior
        // TODO: 0.75:  replace the int gradeLevel in Student with the enum GradeLevel
        // TODO: 0.99: replace the String subject in Teacher with the enum Subject

        // TODO 1: Create two Students and one Teacher with realistic data.
        Student student1 = new Student("Mark", "Brown", GradeLevel.JUNIOR);
        Student student2 = new Student("Leo", "Williams", GradeLevel.SOPHOMORE);
        Teacher teacher1 = new Teacher("Martin", "James", Subject.SOFTWARE);

        // Student s1 = ...
        // Student s2 = ...
        // Teacher t1 = ...

        // TODO 2: Give each a ContactInfo record, then print it.
        ContactInfo student1Info = new ContactInfo("fake email@ here", "123-456-789");
        System.out.println(student1Info);
        ContactInfo student2Info = new ContactInfo("Bahhboop@gmail.com", "122-334-5567");
        System.out.println(student2Info);
        ContactInfo teacher1Info = new ContactInfo("fake @email here", "317-223-4454");
        System.out.println(teacher1Info);


        // TODO 3: Create Enrollments for all persons using Status.ACTIVE and today's date.
        Enrollment student1Enroll = new Enrollment(student1, Status.ACTIVE, "11/3/2025");
        Enrollment student2Enroll = new Enrollment(student2, Status.ACTIVE, "11/3/2025");
        Enrollment teacher1Enroll = new Enrollment(teacher1, Status.ACTIVE, "11/3/2025");
        // Print each enrollment summary.
        System.out.println(student1Enroll);
        System.out.println(student2Enroll);
        System.out.println(teacher1Enroll);

    }
}

