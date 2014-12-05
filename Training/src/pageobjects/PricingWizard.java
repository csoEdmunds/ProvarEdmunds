package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="EdmundsTest"
     )             
public class PricingWizard {

	@ButtonType()
	@FindByLabel(label = "Pricing Wizard")
	public WebElement pricingWizard;
	@ButtonType()
	@FindByLabel(label = "Continue to Pricing Wizard")
	public WebElement continueToPricingWizard;
	@ButtonType()
	@FindByLabel(label = "Confirm and Continue")
	public WebElement confirmAndContinue;
	@ButtonType()
	@FindByLabel(label = "Confirm and Continue to the FW")
	public WebElement confirmAndContinueToTheFW;
	@LinkType()
	@FindBy(linkText = "Dealership Setup")
	public WebElement dealershipSetup;
	@TextType()
	@FindBy(name = "j_id0:j_id2:form:dealerSetup:j_id142:j_id176:j_id177:valueInput")
	public WebElement DealerBillingAddress;
	@TextType()
	@FindBy(name = "j_id0:j_id2:form:dealerSetup:j_id142:j_id176:j_id177:j_id190")
	public WebElement DealerBillingAddressStreet;
	@ButtonType()
	@FindByLabel(label = "OK")
	public WebElement BillingAddressOk;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindByLabel(label = "*Dealership Name")
	public WebElement dealershipName;
	@TextType()
	@FindByLabel(label = "*Dealership Name")
	public WebElement dealershipName1;
	@TextType()
	@FindByLabel(label = "*Opportunity Name")
	public WebElement opportunityName;
			
}
