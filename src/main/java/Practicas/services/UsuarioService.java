package Practicas.services;

import Practicas.models.Item;
import Practicas.models.Usuario;
import Practicas.repositories.ItemRepository;
import Practicas.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        List<Usuario> users = new ArrayList<Usuario>();
        usuarioRepository.findAll().forEach(users :: add);
        return users;
    }

    public void addUser(Usuario u){
        usuarioRepository.save(u);
    }

    public Usuario getUser(int id){
        return usuarioRepository.findOne(id);
    }

    public void deleteUsuario(int id){
        usuarioRepository.delete(id);
    }



}
