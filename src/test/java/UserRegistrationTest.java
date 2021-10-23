
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for validating first name
 */
public class UserRegistrationTest {
    UserRegistration userRegistration;
    @Before
    public void before() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Ajay");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("ajay");
        Assert.assertEquals(false, result);
    }

    /**
     * Unit test for validating last name
     */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Jadhav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("jadhav");
        Assert.assertEquals(false, result);

    }
}