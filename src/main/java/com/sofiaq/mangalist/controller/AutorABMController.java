package com.sofiaq.mangalist.controller;

import com.sofiaq.mangalist.domain.Autor;
import com.sofiaq.mangalist.service.AutorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutorABMController {
    
    private final AutorService autorService;

    public AutorABMController(AutorService autorService) {
        this.autorService = autorService;
    }
    
    @RequestMapping("/autor/alta")
    public String autorAlta(Model model){
        model.addAttribute("autor", new Autor());
        return "autor_alta";
    }
    
    @PostMapping("/autor/guardar")
    public String guardarAutor(Autor autor){
        autorService.guardar(autor);
        return "redirect:/autor/listado";
    }
    
    @RequestMapping("/autor/editar")
    public String autorEditar(int autorId, Model model){
        Autor autor = autorService.autorInfo(autorId);
        model.addAttribute("autor", autor);
        return "autor_alta";
    }
    
    @RequestMapping("/autor/eliminar")
    public String autorEliminar(int autorId){
        Autor autor = autorService.autorInfo(autorId);
        autorService.eliminarAutor(autor);
        return "redirect:/autor/listado";
    }
            
}
