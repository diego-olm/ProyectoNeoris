package neoris.app.domain;

import java.util.ArrayList;
import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class PromocionDAO
{
	public List<Promocion> obtenerPromociones(int idProducto){
		MiJdbc dao = MiFactory.getInstance("miJdbc");
		String sql="";
		sql+="SELECT DISTINCT(p.descripcion), p.id_promocion FROM PROMOCION p ";
		sql+="INNER JOIN PROMOCION_VIGENCIA pv ON p.id_promocion=pv.id_promocion ";
		sql+="INNER JOIN PROMOCION_PRODUCTO pp ON pv.id_promocion_vigencia=pp.id_promocion_vigencia ";
		sql+="WHERE pp.id_producto=? ";
		List<Object[]> lista = dao.query(sql,idProducto);
		List<Promocion> ret= new ArrayList<>();
		for(Object[] p: lista) {
			Promocion agregar = new Promocion();
			agregar.setIdPromocion((Integer)p[1]);
			agregar.setDescripcion((String)p[0]);
			ret.add(agregar);
		}
		return ret;
	}
}
