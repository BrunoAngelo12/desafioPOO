package internet_browser;

import java.util.ArrayList;
import java.util.List;

public class Browser {
    protected List<String> browser = new ArrayList<>();

    public Browser() {
        this.browser = new ArrayList<>();
    }

    public String displayPage(){
        int currentPage = browser.size() - 1;
        if (!browser.isEmpty()){
            return browser.get(currentPage);
        }else{
            return "Add a new page";
        }
        
    }

    public String addNewTab(String newTab){
        browser.add(newTab);
        return "Displaying " + newTab;
    }

    
}
