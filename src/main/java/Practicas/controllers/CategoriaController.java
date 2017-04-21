package Practicas.controllers;

import Practicas.models.Categoria;
import Practicas.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Facundo on 10/04/2017.
 */
@RestController
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET, value="/categorias")
    public List<Categoria> getCategorias(){
        return categoriaService.getCategorias();
    }

    @RequestMapping(method = RequestMethod.POST, value="/categorias")
    public void addCategoria(@RequestBody Categoria categoria){
        categoriaService.addCategoria(categoria);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/categorias")
    public void updateCategoria(@RequestBody Categoria categoria){
        // busca por id si encuentra coincidencia actualiza sino agrega
        categoriaService.addCategoria(categoria);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/categorias/{id}")
    public void deleteCategoria(@PathVariable int id){
        categoriaService.deleteCategoria(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/categorias/{id}")
    public  Categoria getCategoria(@PathVariable int id){
       return  categoriaService.getCategoria(id);
    }

    //IMPLEMENTACION DE LAS VISTAS CON Thymeleaf
//    @RequestMapping("/categorias")
//    public String getCategorias(Model model){
//        model.addAttribute("categorias", categoriaService.getCategoria());
//        return "categorias";
//    }

//    @RequestMapping(method= RequestMethod.POST , value="/categorias")
//    public String addCategoria(Model model, @RequestBody Categoria categoria){
//        categoriaService.addCategoria(categoria);
//        model.addAttribute("categorias", categoriaService.getCategoria());
//        return "categorias";
//    }

//    @RequestMapping(method = RequestMethod.PUT , value = "/categorias")
//    public String updateCategoria(Model model,@RequestBody Categoria categoria){
//        categoriaService.addCategoria(categoria);
//        model.addAttribute("categorias", categoriaService.getCategoria());
//        return "categorias";
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE , value = "/categorias/{id}")
//    public String deleteUser(Model model, @PathVariable int id){
//        categoriaService.deleteCategoria(id);
//        model.addAttribute("categorias", categoriaService.getCategoria());
//        return "categorias";
//    }
}
