package telephone;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    Map<Integer, String> telephoneDirectory = new HashMap<>();

    public TelephoneDirectory() {
        this.telephoneDirectory = new HashMap<>();
    }

    public void addContactToList(int number, String name){
        telephoneDirectory.put(number, name);
    }

    
}
