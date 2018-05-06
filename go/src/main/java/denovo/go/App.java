package denovo.go;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a = 30;
    	int b = 20;
    	int r = somar (a, b);
    	
    	if (r == 50) {
    		System.out.println( "Sucesso!" );
    	} else {
    		System.out.println( "Erro!" );
    	}
    			
    	
    }

	public static int somar(int a, int b) {
		int r = a + b;
		return r;
	}
}
