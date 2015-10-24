package pe.com.implast.ws.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.implast.model.beans.ExtrusionBean;

@RestController
public class ParteExtrusionController {

	@RequestMapping(value="/extrusion/{codMateriaPrima}",method={RequestMethod.POST,RequestMethod.GET})
	public  ExtrusionBean registrarMateriaPrima(
			@PathVariable(value="codMateriaPrima") String codigoMateriaPrima
			){
			System.out.println("codigo"+codigoMateriaPrima);
			ExtrusionBean ext=new ExtrusionBean();
			return ext;
	}
}
