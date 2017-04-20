package Practicas.controllers;

import Practicas.models.Categoria;
import Practicas.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Facundo on 10/04/2017.
 */
@Controller
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping("/categorias")
    public String getCategorias(Model model){
        model.addAttribute("categorias", categoriaService.getCategoria());
        return "categorias";
    }

    @RequestMapping(method= RequestMethod.POST , value="/categorias")
    public String addUser(Model model, @RequestBody Categoria categoria){
        categoriaService.addCategoria(categoria);
        model.addAttribute("categorias", categoriaService.getCategoria());
        return "categorias";
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/categorias")
    public String updateUser(Model model,@RequestBody Categoria categoria){
        categoriaService.addCategoria(categoria);
        model.addAttribute("categorias", categoriaService.getCategoria());
        return "categorias";
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/categorias/{id}")
    public String deleteUser(Model model, @PathVariable int id){
        categoriaService.deleteCategoria(id);
        model.addAttribute("categorias", categoriaService.getCategoria());
        return "categorias";
    }
}
