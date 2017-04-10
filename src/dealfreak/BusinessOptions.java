package dealfreak;

/**
 *
 * @author Ouranos
 */
public class BusinessOptions {

    private String[] st = {"Enable business options"};

    BusinessOptions() {}

    public boolean enable(boolean account) {
        boolean success;
        if (!account){
            String[] c = BusinessInstance.setBusinessInstance();
            setSt(c);
            success =true;
            return success;
        }
        else{
            //Do nothing, Business option already enabled
            success = false;
            return success;
        }     
    }

    public String[] getOptions() {
        return st;
    }

    public void setSt(String[] st) {
        this.st = st;
    }
    
}
