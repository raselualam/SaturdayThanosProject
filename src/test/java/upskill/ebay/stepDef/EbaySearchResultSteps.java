package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyShoesItems();
		Thread.sleep(2000);
	}
	
	@Then("^Item list should have only Pants related products$")
	public void item_list_should_have_only_Pants_related_products() throws Throwable {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyPantsItems();
		Thread.sleep(2000); 
	}
	
	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
		Thread.sleep(2000);
		EbaySearchResultActionsObj.verifyShirtsItems();
		Thread.sleep(2000);
	}
}
