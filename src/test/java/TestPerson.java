import learning.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
    //given

        String expectedNane = "Aisha";
        Long expectedId = 2343L;


        Person person = new Person(expectedId, expectedNane);

        String actualName = person.getName();
        Long actualId = person.getId();


        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedNane, actualName);

    }

    @Test
    public void testSetName(){
    Person person = new Person(123L, "Bob");
    String expected = "Tim";

    person.setName(expected);

    String actual = person.getName();
    Assert.assertEquals(expected, actual);
    }



}
