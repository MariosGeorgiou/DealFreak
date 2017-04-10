
package dealfreak;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ouranos
 */
public class LoginTest {
    
    public LoginTest() {
    }


    @Test
    public void testCheckLogin() {
        Login login = new Login();
        
        //Successful logins
        assertEquals(true, login.checkLogin("marios@gmail.com", "123"));
        System.out.println("");
        assertEquals(true, login.checkLogin("andreas@gmail.com", "123"));
        System.out.println("");
        assertEquals(true, login.checkLogin("simon@gmail.com", "123"));
        System.out.println("");
        
        //Not valid login details
        assertEquals(false, login.checkLogin("mar@gmail.com", "1235"));
        assertEquals(false, login.checkLogin("and@gmail.com", "123"));
        assertEquals(false, login.checkLogin("simon23@gmail.com", "123"));
    }
    
}
