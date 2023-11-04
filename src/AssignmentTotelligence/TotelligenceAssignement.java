package AssignmentTotelligence;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TotelligenceAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {{
		//*)Launching the Browser.
		WebDriver driver = new ChromeDriver();

		//*)PreCondition(Maximizing the window).
		driver.manage().window().maximize();

		//*)Navigating into the Website.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		driver.get("https://totelligence.in/");

		//*)Verifying the Title of the web page.
		String titleOfTheWebSite=driver.getTitle();
		String formalTitle="Totelligence Solutions";
		if (titleOfTheWebSite.equals(formalTitle)) {
			System.out.println("Title of the Website is correct");
		} else {
			System.out.println("Title of the Website is wrong");
		}

		//*)Verifying the URL of the Web page.
		String urlOfTheWebSite=driver.getCurrentUrl();
		String formalUrl="https://totelligence.in/";
		if (urlOfTheWebSite.equals(formalUrl)) {
			System.out.println("URL of the Website is correct");
		} else {
			System.out.println("URL of the Website is wrong");
		}

		//Capturing The screenshot of the web page and storing the image.
		TakesScreenshot driver1= (TakesScreenshot) driver;
		File sourseFile =driver1.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\dell\\Desktop\\newTestScreenShot\\img2.jpg");
		FileUtils.copyFile(sourseFile, destFile);
		System.out.println("ScreenShot is captured");


		//1)Courses
		//Identifying the web element(Courses) using XPath.
		WebElement Courses=driver.findElement(By.xpath("//div[@id='menu-btn']//following::a[text()='Courses']"));
		//Verifying that the Courses Web element is clickable or not.
		System.out.println(ExpectedConditions.elementToBeClickable(Courses));
		//Performing click operation on Courses Web element.
		Courses.click();

		//2)Premium Courses
		//Identifying the web element(Premium Courses) using XPath.
		WebElement premiumCourses=driver.findElement(By.xpath("//div[@class='content']//center//h3[text()='Premium Courses']"));
		//	Verifying that Premium Courses Web element is displayed or not
		if (premiumCourses.isDisplayed()) {
			System.out.println("Premium Courses Header is present");
		}
		else {
			System.out.println("Premium Courses Header is not present");
		}

		//3)image
		//Identifying the web element(image)using XPath.
		WebElement image=driver.findElement(By.xpath("//div[@class='box']//img[@src='images/java card.png']"));
		//Verifying whether the Image is Displayed or not
		if (image.isDisplayed()) {
			System.out.println("Advanced Python Crash Course image is present");
		} else {
			System.out.println("Advanced Python Crash Course image is not present");
		}

		//4)Identifying the web element
		WebElement element4=driver.findElement(By.xpath("//h3[text()='Advanced Python Crash Course']"));
		//Verifying that Web element is displayed or not
		if (element4.isDisplayed()) {
			System.out.println("Advanced Python Crash Course text is present");
		} else {
			System.out.println("Advanced Python Crash Course text is not present");
			System.out.println(ExpectedConditions.elementToBeClickable(element4));

			//5)More details
			//  Identifying the Web element(More Details)
			WebElement moreDetails=driver.findElement(By.xpath("//a[@class='btn' and text()='More Details']"));
			//Verifying that the More Details Web element is clickable or not.
			System.out.println(ExpectedConditions.elementToBeClickable(moreDetails));
			//Performing click operation on More details Web element.
			moreDetails.click();

			//6)
			WebElement element6=driver.findElement(By.xpath("div[@class='readmorebox']"));
			//	Verifying that details of the Advanced Python section are displayed or not
			if (element6.isDisplayed()) { } else {
				System.out.println("details of Advanced Python Crash Course is not present");
			}

			//7)Choose Plan
			//Identifying the webelement(Choose Plan)using XPath.
			WebElement chosePlan=driver.findElement(By.xpath("p[normalize-space(text())='Price: ₹499/-']//following::a[1]"));
			//Scrolling the web page until the element is located.
			Actions scrool=new Actions(driver);
			scrool.moveToElement(chosePlan);
			//Verifying that the Choose Plan Web element is clickable or not.
			System.out.println(ExpectedConditions.elementToBeClickable(chosePlan));
			//element7.click();

			//*) Operating to navigate back to the Home page.
			driver.navigate().back();
			driver.navigate().back();

			//8)Identifying the webelement(Home) using XPath.
			WebElement Home=driver.findElement(By.xpath("a[contains(text(),'Home')"));
			//Performing click operation on Home Web element.
			Home.click();

			//*)Post Condition(Minimizing the window).
			driver.manage().window().minimize();

			
			//*)Closing the browser.
			driver.quit();

		}

	}}}
