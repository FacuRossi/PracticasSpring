package Practicas.controllers;

import Practicas.models.Categoria;
import Practicas.services.CategoriaService;
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
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaController;

    @RequestMapping("/categorias")
    public List<Categoria> getCategorias(){
        return categoriaController.getCategoria();
    }

    @RequestMapping(method= RequestMethod.POST , value="/categorias")
    public void addUser(@RequestBody Categoria categoria){
        categoriaController.addCategoria(categoria);
    }
}
