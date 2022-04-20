import learning.ILearner;
import learning.Person;
import learning.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(243L, "aisha");

        Assert.assertTrue(student instanceof ILearner);
    }


    @Test
    public void testInheritance(){
        Student student = new Student(456L, "bob");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student(678L, "cord");
        double expectedTime = 16.0;


        student.learn(expectedTime);

        double actualHours = student.getTotalStudyTime();
        Assert.assertEquals(expectedTime, actualHours, 0.1);

    }
}
