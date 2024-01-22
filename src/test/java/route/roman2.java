package route;


import java.time.Duration;

import org.openqa.selenium.WebElement;

public class roman2 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options driver = new ChromeDriver(options);

	//1. Launch browser
			driver.get("https://automationexercise.com/");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	//2. Navigate to url 'http://automationexercise.com'


	//3. Verify that home page is visible successfully

	//4. Click on 'Signup / Login' button

			WebElement sl = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
			sl.click();

	//5. Verify 'New User Signup!' is visible

	//6. Enter name and email address

			// name
			WebElement sname = driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
			sname.click();

			WebElement sname1 = driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
			sname1.sendKeys("sowmya");

			// email
			WebElement email = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
			email.click();

			WebElement email1 = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
			email1.sendKeys("sowmya24@gmail.com");

	//7. Click 'Signup' button

			// signupbtn
			WebElement sbtn = driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
			sbtn.click();

	//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

	//9. Fill details: Title, Name, Email, Password, Date of birth

			// gender radiobtn
			WebElement grb = driver.findElement(By.xpath("//input[@id=\"id_gender1\"]"));
			grb.click();

			// password
			WebElement passw = driver.findElement(By.xpath("//input[@id=\"password\"]"));
			passw.sendKeys("1234");

			// day
			WebElement daydd = driver.findElement(By.xpath("//select[@id=\"days\"]"));
			daydd.click();

			WebElement daydds = driver.findElement(By.xpath("//div[@id=\"uniform-days\"]/select/option[13]"));
			daydds.click();

			// month
			WebElement mm = driver.findElement(By.xpath("//select[@id=\"months\"]"));
			mm.click();

			WebElement mm1 = driver.findElement(By.xpath("//select[@id=\"months\"]/option[9]"));
			mm1.click();

			// year
			WebElement yr = driver.findElement(By.xpath("//select[@id=\"years\"]"));
			yr.click();

			WebElement yr1 = driver.findElement(By.xpath("//select[@id=\"years\"]/option[23]"));
			yr1.click();

	//10. Select checkbox 'Sign up for our newsletter!'

			WebElement ncl = driver.findElement(By.xpath("//form[@action=\"/signup\"]/div[6]"));
			ncl.click();

	//11. Select checkbox 'Receive special offers from our partners!'

			WebElement so = driver.findElement(By.xpath("//form[@action=\"/signup\"]/div[7]"));
			so.click();

	//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

			// First name
			WebElement fname = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
			fname.sendKeys("sowmya");

			// Last name
			WebElement lname = driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
			lname.sendKeys("chillakuri");

			// Company
			WebElement com = driver.findElement(By.xpath("//input[@id=\"company\"]"));
			com.sendKeys("helloworld");

			// Address
			WebElement add = driver.findElement(By.xpath("//input[@id=\"address1\"]"));
			add.sendKeys("NTR Nagar");

			// Address 2
			WebElement add2 = driver.findElement(By.xpath("//input[@id=\"address2\"]"));
			add2.sendKeys("sarasvathi nagar");

			// state
			WebElement state = driver.findElement(By.xpath("//input[@id=\"state\"]"));
			state.sendKeys("ap");

			// City
			WebElement city = driver.findElement(By.xpath("//input[@id=\"city\"]"));
			city.sendKeys("nellore");

			// Zipcode
			WebElement zc = driver.findElement(By.xpath("//input[@id=\"zipcode\"]"));
			zc.sendKeys("523101");

			// Mobile Number
			WebElement mn = driver.findElement(By.xpath("//input[@id=\"mobile_number\"]"));
			mn.sendKeys("2165165151");

	//13. Click 'Create Account button'

			// create account
			WebElement ca = driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button"));
			ca.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//14. Verify that 'ACCOUNT CREATED!' is visible

	//15. Click 'Continue' button

			WebElement cont = driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
			cont.click();

	//16. Verify that 'Logged in as username' is visible

	//17. Click 'Delete Account' button

			WebElement da = driver.findElement(By.xpath("//a[@href=\"/delete_account\"]"));
			da.click();

	//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.quit();
		}

	}

}
