import learning.ITeacher;
import learning.Instructor;
import learning.Person;
import learning.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(67L, "sally");
        Assert.assertTrue(instructor instanceof ITeacher);
    }


    @Test
    public void testInheritance(){
       Instructor instructor = new Instructor(80L, "pam");
       Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(90L, "mum");
        Student student = new Student(98L, "susie");
        double expected = 6.0;

        instructor.teach(student, expected);

        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(78L, "tim");
        Student student1 = new Student(56L, "greg");
        Student student2 = new Student(45L, "dan");
        Student student3 = new Student(20L, "jim");
        Student [] kids = {student1, student2, student3};
        double expected = 10.0;

        instructor.lecture(kids, 30.0);


//        double actualStud1 = student1.getTotalStudyTime();
//        double actualStud2 = student2.getTotalStudyTime();
        double actualStud3 = student3.getTotalStudyTime();


//        Assert.assertEquals(expected,actualStud1, 0.1);
//        Assert.assertEquals(expected,actualStud2, 0.1);
        Assert.assertEquals(expected,actualStud3, 0.1);
    }
}


