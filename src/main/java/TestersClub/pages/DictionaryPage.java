package TestersClub.pages;


import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.Keys;

import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://2048game.com/")
public class DictionaryPage extends PageObject {

	@FindBy(className="game-container")
    private WebElementFacade game_container;

//	@FindBy(className = "score-container")
	@FindBy(css= "html body div.container div.heading div.scores-container div.best-container")
	private WebElementFacade game_score;
	
  
	public void go_left(){
//		selenium.setSpeed(500);
		game_container.sendKeys(Keys.ARROW_LEFT);
	}
	public void go_right(){
		game_container.sendKeys(Keys.ARROW_RIGHT);
	}
	public void go_down(){
		game_container.sendKeys(Keys.ARROW_DOWN);
	}
	public void go_up(){
		game_container.sendKeys(Keys.ARROW_UP);
	}
	
public String get_score_value (){
	String score = game_score.getTextValue();
	
//	System.out.println("score container is " + score);
	
	return score;
}

}