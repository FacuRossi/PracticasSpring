package Practicas.controllers;

import Practicas.models.Item;
import Practicas.models.Usuario;
import Practicas.services.UsuarioService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/usuarios")
    public List<Usuario> getUsers(){
        return usuarioService.getUsuarios();
    }

    @RequestMapping(method= RequestMethod.POST , value="/usuarios")
    public void addUser(@RequestBody Usuario usuario){
        usuarioService.addUser(usuario);
    }

    @RequestMapping(method = RequestMethod.GET , value="/usuarios/{id}")
    public Usuario getUser(@PathVariable int id){
        return usuarioService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT , value="/usuarios")
    public void updateUser(@RequestBody Usuario usuario){
        usuarioService.addUser(usuario);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/usuarios/{id}")
    public void deleteUser(@PathVariable int id){
        usuarioService.deleteUsuario(id);
    }

}
