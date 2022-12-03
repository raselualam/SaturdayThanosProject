package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Search Button
	@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;

}
