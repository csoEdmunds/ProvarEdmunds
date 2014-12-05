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
public class Dealership {

	@TextType()
	@FindByLabel(label = "*Dealership Name")
	public WebElement dealershipName;
			
}
