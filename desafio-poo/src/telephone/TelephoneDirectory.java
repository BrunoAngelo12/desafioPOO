package telephone;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    Map<Integer, String> telephoneDirectory = new HashMap<>();
    Map<Integer, String> favoriteContacts = new HashMap<>();

    public TelephoneDirectory() {
        this.telephoneDirectory = new HashMap<>();
        this.favoriteContacts = new HashMap<>();
    }

    public void addContactToList(int number, String name){
        telephoneDirectory.put(number, name);
    }

    public void removeContactFromlist(int number){
        telephoneDirectory.remove(number);
    }

    public void addToFavoriteContacts(int number, String name){
        favoriteContacts.put(number, name);
    }

    public Map<Integer, String> showContactList(){
        return telephoneDirectory;
    }

    public Map<Integer, String> showFavoriteContactList(){
        return favoriteContacts;
    }

    
}
