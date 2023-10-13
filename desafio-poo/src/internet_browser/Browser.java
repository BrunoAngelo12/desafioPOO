package internet_browser;

import java.util.ArrayList;
import java.util.List;

public class Browser {
    List<String> browser = new ArrayList<>();

    public Browser() {
        this.browser = new ArrayList<>();
    }

    public String displayPage(){
        int currentPage = browser.size();
        return browser.get(currentPage);
    }

    public String addNewTab(String newTab){
        browser.add(newTab);
        return "Displaying " + newTab;
    }

    
}
