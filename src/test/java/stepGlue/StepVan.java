package stepGlue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepVan {
	
	WebDriver driver;
	@Given("user provides {string} and {string}")
	public void user_provides_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=Drivers.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys("admin");
		driver.findElement(By .name("password")).sendKeys("Password456");
		driver.findElement(By .name("Login")).click();
		
		
	}

	@Then("user should enter the homepage")
	public void user_should_enter_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("user in homepage");
	}



@Given("user should enter homepage")
public void user_should_enter_homepage() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("user came to homepage");
}

@Given("user should add category as sport")
public void user_should_add_category_as_sport() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By .xpath("/html/body/main/div/div/div/div[2]/button/h4")).click();
	driver.findElement(By .name("catgName")).sendKeys("Sports");
	driver.findElement(By .name("catgDesc")).sendKeys("playing sport will make you so better");
	
	driver.findElement(By .xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
	
	
	
}

@Given("user should add subcategory")
public void user_should_add_subcategory(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By .xpath("/html/body/main/div/div/div/div[3]/button")).click();
	driver.findElement(By .xpath("//*[@id=\"subCatgId\"]")).click();
	driver.findElement(By .name("subCatgName")).sendKeys("Volleyball");
	driver.findElement(By .name("subCatgDesc")).sendKeys("volleyball is best sport");
	
	driver.findElement(By .xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
	
	driver.findElement(By .xpath("//*[@id=\"subCatgId\"]")).click();
	driver.findElement(By .name("subCatgName")).sendKeys("Basketball");
	driver.findElement(By .name("subCatgDesc")).sendKeys("Basketball is best sport than volleyball");
	
	driver.findElement(By .xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
	
}

@Then("user should see subcategories under sports category")
public void user_should_see_subcategories_under_sports_category() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	
	
}




}
