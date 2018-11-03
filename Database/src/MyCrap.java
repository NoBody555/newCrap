
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class MyCrap {
	
	private static Statement s;
	 static Connection con=null;
	 WebDriver driver;
	 @BeforeTest
	public void setupDB() throws SQLException {
		
		String host="localhost";
		 String port ="3306";
		
	   //  Connection con = DriverManager.getConnection("jdbc:mysql://"+host+port+"/mydata?autoReconnect-true$useSSL=false","root","whocares007");
		  con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/user?autoReconnect=true&useSSL=false", "root", "whocares007");
	                s = con.createStatement();
	}
	@Test (invocationCount=5)
 public void databaseTest() throws SQLException {
	
		/*String host="localhost";
		 String port ="3306";
	   //  Connection con = DriverManager.getConnection("jdbc:mysql://"+host+port+"/mydata?autoReconnect-true$useSSL=false","root","whocares007");
		 Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/user?autoReconnect=true&useSSL=false", "root", "whocares007");
	               Statement s = con.createStatement();*/
	               //  s.executeQuery("use user;");
	               ResultSet rs = s.executeQuery("select * from userinfo where userName= 'Mike'");
	               System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
               while(rs.next()) {
            	   
            	  driver = new ChromeDriver();
            	   System.out.println(rs.getString("userName"));
            	   System.out.println(rs.getString("userAddress"));
            	   driver.get("https://login.salesforce.com");
       			driver.findElement(By.id("username")).sendKeys(rs.getString("userName"));
       		    driver.findElement(By.id("password")).sendKeys(rs.getString("userAddress"));
               }
 
 }
	@AfterTest
	public void tearDown() throws SQLException {
		driver.quit();
		if(con!=null)
		con.close();
	}
}
