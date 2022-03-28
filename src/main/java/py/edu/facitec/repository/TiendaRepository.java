package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.entidad.Tienda;

//PARA CAMBIAR DE SuscritoRepository PARA AlumnoRepository DAMOS
//UN REFACTOR SOBRE EL MISMO Y DESPUES RENAME

public interface TiendaRepository extends JpaRepository<Tienda, Long> { //CLASE --> "Tienda" y 
																			//TIPO DE DATO DE Codigo --> "Long"

}
 