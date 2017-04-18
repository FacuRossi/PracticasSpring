package Practicas.repositories;

import Practicas.models.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Facundo on 10/04/2017.
 */

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
}
