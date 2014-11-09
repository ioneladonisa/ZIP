package TestersClub.steps;

import TestersClub.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Date;
import java.util.Timer;



public class EndUserSteps extends ScenarioSteps {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DictionaryPage dictionaryPage;

   
    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }
    Timer timer = new Timer();
    
    @Step
    public void go_left(){
    	dictionaryPage.go_left();
    }
    @Step
    public void go_right(){
    	dictionaryPage.go_right();
    }
    @Step
    public void go_down(){
    	dictionaryPage.go_down();
    }
    
    @Step
    public  void walk (){
    	
    	long startTime = System.currentTimeMillis();
    	long elapsedTime=0;
    	int old_score = 0;
    	int new_score = 0;
    	
    	
    	while (elapsedTime < 60000){  			
    			dictionaryPage.go_right();
    			dictionaryPage.go_down();
    			    			
    			dictionaryPage.go_left();
    			dictionaryPage.go_down();
			
    		new_score = Integer.parseInt(dictionaryPage.get_score_value());    
    		
    		if (old_score == new_score && old_score > 0 ){
    			dictionaryPage.go_up();
    		}else{
    			old_score = new_score;
    		}
    	elapsedTime= System.currentTimeMillis() - startTime;	
    	}
    	System.out.println("walk: final score is " + new_score);
    }
   

}