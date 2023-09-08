  
import org.testng.annotations.Test;  
public class test30   
{  
 @Test  
 public void login()  
 {  
     System.out.println("Login page");  
 }  
 @Test(dependsOnMethods="login")  
 public void home()  
 {  
     System.out.println("Home page");  
       
 }  
}  