package neoris.app;

import java.util.List;

import neoris.app.domain.Categoria;
import neoris.app.domain.CategoriaDAO;
import neoris.app.domain.Cliente;
import neoris.app.domain.ClienteDAO;
import neoris.app.domain.Empleado;
import neoris.app.domain.EmpleadoDAO;
import neoris.app.domain.Producto;
import neoris.app.domain.ProductoDAO;
import neoris.app.domain.Promocion;
import neoris.app.domain.PromocionDAO;
import neoris.app.domain.Proveedor;
import neoris.app.domain.ProveedorDAO;
import neoris.app.domain.ReposicionDAO;

public class FacadeImplementacion implements Facade
{

	@Override
	public List<Producto> obtenerProductos()
	{
		ProductoDAO dao = new ProductoDAO();
		return dao.traerProductos();
	}

	@Override
	public List<Cliente> obtenerClientesQueAdquirieron(int idProducto)
	{
		ClienteDAO dao=new ClienteDAO();
		return dao.obtenerClientesQueAdquirieron(idProducto);
	}

	@Override
	public List<Cliente> obtenerClientes()
	{
		ClienteDAO dao= new ClienteDAO();
		
		return dao.obtenerClientes();
	}

	@Override
	public List<Empleado> obtenerEmpleadosQueAntendieron(int idCliente)
	{
		EmpleadoDAO dao= new EmpleadoDAO();
		return dao.obtenerEmpleadosQueAntendieron(idCliente);
	}

	@Override
	public List<Producto> obtenerProductosConPromocionesVigentes()
	{
		ProductoDAO dao = new ProductoDAO(); 
		return dao.obtenerProductosConPromocionesVigentes();
	}

	@Override
	public List<Promocion> obtenerPromociones(int idProducto)
	{
		PromocionDAO dao = new PromocionDAO();
		return dao.obtenerPromociones(idProducto);
	}

	@Override
	public List<Categoria> obtenerCategorias()
	{
		CategoriaDAO dao= new CategoriaDAO();
		return dao.obtenerCategorias();
	}

	@Override
	public List<Proveedor> obtenerProveedores(int idCategoria)
	{
		ProveedorDAO dao= new ProveedorDAO();
		return dao.obtenerProveedores(idCategoria);
	}

	@Override
	public void generarReposicionProducto()
	{
		ReposicionDAO r=new ReposicionDAO();
		
		r.generarReposicionProducto();
	}

}
