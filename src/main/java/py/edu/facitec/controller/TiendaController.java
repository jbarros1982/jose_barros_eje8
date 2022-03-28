package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.entidad.Tienda;
import py.edu.facitec.repository.TiendaRepository;

@Controller
public class TiendaController {
	

	@Autowired  //ANOTACION QUE INICIALIZA/IMPLEMENTA  
	private TiendaRepository tiendaRepository; 
	
	@RequestMapping("/form_tienda")
	
	public String metodo() {
		
		System.out.println("Cargando pagina de la tienda...");
		
		return "view/tienda/form"; 
								
	}
	
	
	@RequestMapping(value ="/registrar_tienda", method = RequestMethod.POST) 
	

	
	public ModelAndView registrar_tienda(Tienda tienda) { 
		
	
		
		tiendaRepository.save(tienda);
		
	
		
		System.out.println("Registrado con éxito: "+tienda);
		
	
		
		return new ModelAndView("redirect:form_tienda");					   
		
	}

}
