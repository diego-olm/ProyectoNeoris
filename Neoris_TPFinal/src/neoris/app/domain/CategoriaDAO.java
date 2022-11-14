package neoris.app.domain;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class CategoriaDAO
{

	public List<Categoria> obtenerCategorias(){
		
		MiJdbc dao= MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT c.id_categoria, c.descripcion FROM CATEGORIA c ";
		List<Object[]> lista= dao.query(sql);
		List<Categoria> ret= new ArrayList<>();
		for(Object[] p: lista) {
			Categoria agregar= new Categoria();
			agregar.setIdCategoria((Integer)p[0]);
			agregar.setDescripcion((String)p[1]);
			
			ret.add(agregar);
			
		}
		
		return ret;
	}
}
