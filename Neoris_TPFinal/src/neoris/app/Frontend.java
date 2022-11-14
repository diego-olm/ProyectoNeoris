package neoris.app;

import java.util.List;
import java.util.Scanner;


import neoris.app.domain.Categoria;
import neoris.app.domain.Cliente;
import neoris.app.domain.Empleado;
import neoris.app.domain.Producto;
import neoris.app.domain.Promocion;
import neoris.app.domain.Proveedor;

public class Frontend
{
	static {
		Runtime.getRuntime().addShutdownHook(new MiShutdownHook());
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		FacadeImplementacion facade = new FacadeImplementacion();
		int opcion=99;
		int id;
		MiThread hilo = new MiThread();
		
		hilo.start();
		do {
			System.out.println("INGRESE 1 PARA VER CLIENTES QUE ADQUIRIERON UN PRODUCTO");
			System.out.println("INGRESE 2 PARA VER EMPLEADOS QUE ATENDIERON A UN CLIENTES");
			System.out.println("INGRESE 3 PARA VER LISTADO DE LOS PRODUCTOS QUE TIENEN PROMOCIONES EN VIGENCIA");
			System.out.println("INGRESE 4 PARA VER LISTADO DE LAS PROMOCIONES PARA UN PRODUCTO ");
			System.out.println("INGRESE 5 PARA VER PROVEEDORES POR CATEOGORIA");
			System.out.println("INGRESE 0 PARA SALIR");
			
			opcion=scanner.nextInt();

			switch(opcion) {
				case 1:
					System.out.println("----------------------------");
					System.out.println("Listado de Productos");
					for(Producto p : facade.obtenerProductos()) {
						System.out.println(p.toString());
					}
					System.out.println("----------------------------");
					System.out.println("Ingrese el id del producto para obtener Clientes Que Lo Adquirieron ");
					id=scanner.nextInt();
					List<Cliente> lst=facade.obtenerClientesQueAdquirieron(id);
					for(Cliente p : lst) {
						System.out.println(p.toString());
					}
					System.out.println("----------------------------");
					break;
				case 2:
					System.out.println("----------------------------");
					System.out.println("Listado De Clientes");
					for(Cliente p: facade.obtenerClientes()) {
						System.out.println(p.toString());
					}
					System.out.println("----------------------------");
					System.out.println("Ingrese Id Del Cliente Para Obtener Los Empleados Que Lo Atendieron ");
					id=scanner.nextInt();
					List<Empleado> lista3= facade.obtenerEmpleadosQueAntendieron(id);
					for(Empleado p: lista3) {
						System.out.println(p.toString());
					}
					System.out.println("----------------------------");
					break;
				case 3:
					System.out.println("Productos Con Promociones Vigentes ");
					for(Producto p : facade.obtenerProductosConPromocionesVigentes()) {
						System.out.println(p.toString());
					}
					System.out.println("----------------------------");
					break;
				case 4:
					System.out.println("Ingrese Id Producto Para Obtener Promociones Del Producto ");
					id=scanner.nextInt();
					List<Promocion> lista4=facade.obtenerPromociones(id);
					for(Promocion p: lista4) {
						System.out.println(p.toString());
					}
					System.out.println("----------------------------");
					break;
				case 5:
					System.out.println("Categorias");
					for(Categoria p : facade.obtenerCategorias()) {
						System.out.println(p.toString());
						
						}
					System.out.println("Ingrese Id Categoria Para obtener Proveedor ");
					id=scanner.nextInt();
					List<Proveedor> lista6= facade.obtenerProveedores(id);
					System.out.println("Proveedor");
					for(Proveedor p : lista6) {
						System.out.println(p.toString());
						}
					System.out.println("----------------------------");
					break;
			}
		}while(opcion!=0 ); 
		hilo.parar();
		scanner.close();

	}
}
