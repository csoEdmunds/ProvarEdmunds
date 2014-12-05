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
public class Opportunity {

	@TextType()
	@FindByLabel(label = "*Opportunity Name")
	public WebElement opportunityName;
	@ButtonType()
	@FindByLabel(label = " Edit ")
	public WebElement edit;
	@TextType()
	@FindByLabel(label = "*Opportunity Name")
	public WebElement opportunityName1;
	@TextType()
	@FindByLabel(label = "*Stage")
	public WebElement stage;
			
}
