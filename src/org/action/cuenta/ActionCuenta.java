package org.action.cuenta;

import java.util.ArrayList;
import java.util.List;

import org.dao.generic.DaoGeneric;
import org.modelo.cuenta.Cuenta;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ActionCuenta extends ActionSupport implements ModelDriven<Cuenta> {
	 private Cuenta cuenta = new Cuenta();
	 private DaoGeneric dao = new DaoGeneric();
	 private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	 
	 
	 
	 public String execute(){
		 return ERROR;
		 
	 }
	 public String cuenta()
	 {
		setCuentas(dao.listCuenta());
		for(Cuenta x : cuentas)
		{		
				if (cuenta.getLogin().equals(x.getLogin())
				 &&cuenta.getPassword().equals(x.getPassword())) 
					{
						return SUCCESS;
					}else{
						return ERROR;
					}
				}
	return ERROR;
	 }
	 @Override
	 public Cuenta getModel()
	 {
		return cuenta; 
	 }
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
}
