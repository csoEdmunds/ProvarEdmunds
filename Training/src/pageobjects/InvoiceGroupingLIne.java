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
public class InvoiceGroupingLIne {

	@TextType()
	@FindByLabel(label = "Description")
	public WebElement description;
			
}
