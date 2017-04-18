package Practicas.controllers;

import Practicas.models.Usuario;
import Practicas.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioController;

    @RequestMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioController.getUsuarios();
    }

    @RequestMapping(method= RequestMethod.POST , value="/usuarios")
    public void addUser(@RequestBody Usuario usuario){
        usuarioController.addUser(usuario);
    }


}
