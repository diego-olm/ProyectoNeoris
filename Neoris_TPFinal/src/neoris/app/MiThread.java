package neoris.app;



public class MiThread extends Thread
{

	private boolean correr=true;
	@Override
	public void run() {
		
	    FacadeImplementacion facade= new FacadeImplementacion();
	    
	    while(correr) {
	    	facade.generarReposicionProducto();
	
	    }
	    

	}
	public void parar() {
		this.correr=false;
	}
}
