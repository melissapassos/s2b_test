package denovo.go;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AppTest 
 
{
  
  
  
  @Test
 public void TestSoma()
 {
	  assertEquals(50,App.somar(30, 20));
	  System.out.println("Sucesso!");
 }
  
}
