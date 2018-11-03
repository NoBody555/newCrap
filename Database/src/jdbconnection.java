import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbconnection {
	public static void main(String[] args) throws SQLException {
		String ar []= {"dumbos", "idiot","michael","like"};
		/*for(int i=0; i<ar.length;i++){
		 System.out.println("index of the name: " +ar[i]+ " is at "+i);
		}*/
		
		/*for(String sup: ar){
			
			System.out.println(sup);
		}*/
	 /*  int i=0;
		while(i<ar.length){
			//i++;
			System.out.println("index " +i+ " value: "+ar[i]);
			i++;
		}*/
		String host="localhost";
		String port ="3306";
		
		//Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/craap?autoReconnect=true&useSSL=false", "root", "whocares007");
		//Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/mymine?autoReconnect=true&useSSL=false", "root", "whocares007");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/mydata?autoReconnect=true&useSSL=false", "root", "whocares007");
//statement is like  a road you travel on it.
		Statement s=  con.createStatement();
		
		//ResultSet rs= s.executeQuery("select * from credentialss where username='zerobic'");
		//ResultSet rs= s.executeQuery("select * from credentialss where scenario='rewardcard'");
		//ResultSet rs= s.executeQuery("select * from mycrap where id='3'");
		     ResultSet rs=  s.executeQuery("select * from crappydata where username ='abrar'");
		   while(rs.next()){
			   System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
			WebDriver   driver = new ChromeDriver();
			
		
			//System.out.println(rs.getString("username"));
			//System.out.println(rs.getString("password"));
			
			driver.get("https://login.salesforce.com");
			//driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
			//driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		
		   
			//driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("name"));
			//driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("address"));
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		
		   }
         
   }
	
}
