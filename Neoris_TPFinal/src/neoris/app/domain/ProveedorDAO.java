package neoris.app.domain;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class ProveedorDAO
{

	public List<Proveedor> obtenerProveedores(int idCategoria){
		MiJdbc dao= MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT p.id_proveedor, p.empresa, p.contacto, p.direccion FROM PROVEEDOR p ";
		sql+="INNER JOIN PROVEEDOR_CATEGORIA pc ON p.id_proveedor=pc.id_proveedor ";
		sql+="WHERE pc.id_categoria=?";
		List<Object[]> lista= dao.query(sql,idCategoria);
		List<Proveedor> ret= new ArrayList<>();
		for(Object[] p: lista) {
			Proveedor agregar= new Proveedor();
			agregar.setIdProveedor((Integer)p[0]);
			agregar.setEmpresa((String)p[1]);
			agregar.setContacto((String)p[2]);
			agregar.setDireccion((String)p[3]);
			ret.add(agregar);
		}
		
		return ret;
	}
}
