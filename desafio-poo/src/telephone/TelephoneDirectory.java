package telephone;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    protected Map<Integer, String> telephoneDirectory = new HashMap<>();
    protected Map<Integer, String> favoriteContacts = new HashMap<>();

    public TelephoneDirectory() {
        this.telephoneDirectory = new HashMap<>();
        this.favoriteContacts = new HashMap<>();
    }

    public void addContactToList(int number, String name){
        telephoneDirectory.put(number, name);
    }

    public void removeContactFromList(int number){
        telephoneDirectory.remove(number);
    }

    public void addToFavoriteContacts(int number){
        for(Map.Entry<Integer, String> contact : telephoneDirectory.entrySet()){
            if(contact.getKey().equals(number)){
                favoriteContacts.put(contact.getKey(), contact.getValue());
            }
        }
    }

    public void removeContactFromFavoriteList(int number){
        favoriteContacts.remove(number);
    }

    public Map<Integer, String> showContactList(){
        return telephoneDirectory;
    }

    public Map<Integer, String> showFavoriteContactList(){
        return favoriteContacts;
    }

    
}
