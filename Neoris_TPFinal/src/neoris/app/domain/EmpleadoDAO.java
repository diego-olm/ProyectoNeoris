package neoris.app.domain;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class EmpleadoDAO
{

	public List<Empleado> obtenerEmpleadosQueAntendieron(int idCliente) {
		
		MiJdbc dao= MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT E.id_empleado, E.nombre, E.id_jefe ";
		sql+="FROM EMPLEADO E INNER JOIN ORDEN O ON E.id_empleado=O.id_empleado ";
		sql+="INNER JOIN CLIENTE C ON O.id_cliente=C.id_cliente WHERE C.id_cliente=?";
		List<Object[]> lista= dao.query(sql,idCliente);
		List<Empleado> ret= new ArrayList<>();
		for(Object[] p: lista) {
			Empleado agregar = new Empleado();
			agregar.setIdEmpleado((Integer)p[0]);
			agregar.setNombre((String)p[1]);
			if(p[2]!=null) {
				agregar.setIdJefe((Integer)p[2]);
			}
			
			ret.add(agregar);
			
		}
		return ret;
	}
}
