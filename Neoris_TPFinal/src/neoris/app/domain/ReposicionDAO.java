package neoris.app.domain;

import java.util.List;

import demo.MiJdbc;
import test.MiFactory;

public class ReposicionDAO
{
	public void generarReposicionProducto() {
		MiJdbc x = MiFactory.getInstance("miJdbc");
		String sql1="Select P.id_producto from Producto P ";
		sql1+="WHERE (P.unidades_stock < P.unidades_stock_minimo) ";
		List<Object[]> lista= x.query(sql1);
		//if(lista.toString()!="[]") {}
			String sql="";
			sql+="INSERT INTO Reposicion (id_producto, cantidad,fecha) ";
			sql+="SELECT P.id_producto, (P.unidades_stock_maximo - P.unidades_stock) AS cantidad, CURRENT_DATE ";
			sql+="FROM Producto AS P ";
			sql+="WHERE (P.unidades_stock < P.unidades_stock_minimo)  AND NOT EXISTS (SELECT id_producto FROM reposicion WHERE id_producto=?) ";
			for(Object[] p: lista) {
				x.update(sql,(Integer)p[0]);
			
		}
		

		
	}
}
