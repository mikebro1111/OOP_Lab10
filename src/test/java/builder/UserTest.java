package builder;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUser() {
        User user = User.builder().firstName("Mike").occupation("student").build();
        assertEquals(user.toString(), "User(firstName=Mike, secondName=null, age=0, occupations=[student])");
    }
}