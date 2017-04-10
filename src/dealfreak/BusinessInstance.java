
package dealfreak;

/**
 *
 * @author Ouranos
 */
public class BusinessInstance {
    
    private static BusinessInstance singleton = new BusinessInstance();
        
    private BusinessInstance(){}
    
    public static BusinessInstance getInstance(){
      return singleton;
    }
    
    protected static String[] setBusinessInstance(){
        String[] c ={"Create a business profile", "Manage existing profiles", };
        return c;
    }
    
}
