package testeparam.fabiohelp;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AppTest 
  

{
	int a,b,r;

	@Test
	@FileParameters("src/test/java/testeparam/fabiohelp/Lista.csv")
	public void testSomar(int r,int a,int b) {
		assertEquals(App.somar(a, b),r);
		System.out.println(a);
	}
		
		
	}

