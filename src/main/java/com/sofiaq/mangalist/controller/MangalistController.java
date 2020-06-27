package com.sofiaq.mangalist.controller;

import com.sofiaq.mangalist.domain.Manga;
import com.sofiaq.mangalist.service.MangalistService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MangalistController {

    public final MangalistService mangaService;

    public MangalistController(MangalistService mangaService) {
        this.mangaService = mangaService;
    }

    @RequestMapping("/")
    public String listarMangas(Model model) {
        
        List<Manga> destacados = mangaService.buscarDestacados();
        model.addAttribute("mangas", destacados);
        return "index";
    }
    
    @RequestMapping("/autor")
    public String listarMangasPorAutor(int autorId, Model model){
        List<Manga> listado = mangaService.buscarPorAutor(autorId);
        model.addAttribute("mangas", listado);
        return "index";
    }
     @RequestMapping("/buscar")
    public String busqueda(@RequestParam("q") String consulta, Model model){
        List<Manga> busqueda = mangaService.buscador(consulta);
        model.addAttribute("mangas", busqueda);
        return "index";
    }

}
