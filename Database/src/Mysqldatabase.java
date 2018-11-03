import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mysqldatabase {
	
	public static void main(String[] args) throws SQLException {

		//String host= "localhost";
		//String port= "3306";
//Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/mydata?autoReconnect=true&useSSL=false", "root", "whocares007");		
   //Connection con=DriverManager.getConnection("jdbc:mysql//"+host+":"+port+"/mydata?autoReconnect=true&useSSL=false","root","whocares007");
  //Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+ port + "/mydata?autoReconnect=true&useSSL=false", "root", "whocares007");
		//Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/mydata?autoReconnect=true&useSSL=false", "root", "whocares007");

	String host="localhost";
       String port="3306";
       Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/mydata?autoReconnect=true&useSSL=false", "root", "whocares007");
                 


		Statement s= con.createStatement();
  ResultSet rs=    s.executeQuery("select * from  crappydata where username = 'abrar'");
      
	
        while(rs.next()){
        	//   System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
   			//WebDriver   driver = new ChromeDriver();
   			
   			//driver.get("https://www.facebook.com");
   			System.out.println(rs.getString("username"));
   			System.out.println(rs.getString("password"));
   			/*driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
		    driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
		    */
        }
	}
                    
      
                   
	

}
