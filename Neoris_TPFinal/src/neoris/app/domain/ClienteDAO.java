package neoris.app.domain;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class ClienteDAO
{

	public List<Cliente> obtenerClientesQueAdquirieron(int idProducto){
		MiJdbc dao = MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT c.id_cliente, c.nombre, c.direccion, ";
		sql+="id_tipo_cliente FROM CLIENTE c ";
		sql+="INNER JOIN ORDEN o ON c.id_cliente=o.id_cliente ";
		sql+="INNER JOIN DETALLE_ORDEN d ON o.id_orden=d.id_orden ";
		sql+="WHERE d.id_producto=? AND d.cantidad>=1 ";
		List<Cliente> ret = new ArrayList<>();
		List<Object[]> lts=dao.query(sql,idProducto);
		
		for(Object[] p: lts) {
		Cliente agregar= new Cliente();	
		agregar.setIdCliente((Integer)p[0]);
		agregar.setNombre((String)p[1]);
		agregar.setDireccion((String) p[2]);
		agregar.setIdTipoCliente((Integer)p[3]);
		ret.add(agregar);
			
		}
		
		
		
		return ret;
	}
	
	public List<Cliente> obtenerClientes(){
		MiJdbc dao = MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT c.id_cliente, c.nombre, c.direccion, ";
		sql+="id_tipo_cliente FROM CLIENTE c ";
		List<Object[]> lista=   dao.query(sql);
		List<Cliente> ret= new ArrayList<>();
		for(Object[] p: lista) {
			Cliente agregar= new Cliente();	
			agregar.setIdCliente((Integer)p[0]);
			agregar.setNombre((String)p[1]);
			agregar.setDireccion((String) p[2]);
			agregar.setIdTipoCliente((Integer)p[3]);
			ret.add(agregar);
				
			}
		
		return ret;
	}
}
