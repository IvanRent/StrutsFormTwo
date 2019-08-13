package org.action.catalogo;

import java.util.ArrayList;
import java.util.List;
import org.dao.generic.DaoGeneric;
import org.modelo.ciudad.Ciudad;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@SuppressWarnings("serial")
public class ActionCatalogo extends ActionSupport implements ModelDriven<Ciudad>
{
	 private Ciudad ciudad = new Ciudad();
	 private DaoGeneric dao = new DaoGeneric();
	 private List<Ciudad> ciudades = new ArrayList<Ciudad>();
	 private List<String> nombres = new ArrayList<String>();
	 
	 public String execute()
	 {
		 return SUCCESS;
	 }
	 public String catalog()
	 {
		 setCiudades(dao.listCiudades());
		 for (Ciudad x : ciudades) 
		 {
			nombres.add(x.getNombre());
		}
		 return SUCCESS;
	 }
	 
	 
	 @Override
	public Ciudad getModel()
	 {
		 return ciudad;
	 }
	 
	 public List<Ciudad> getCiudades() {
		return ciudades;
	}
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	public List<String> getNombres() {
		return nombres;
	}
	public void setNombres(List<String> nombres) {
		this.nombres = nombres;
	}
	
	
	 
	 
}
