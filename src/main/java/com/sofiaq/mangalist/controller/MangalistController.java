package com.sofiaq.mangalist.controller;

import com.sofiaq.mangalist.domain.Manga;
import com.sofiaq.mangalist.service.MangalistService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MangalistController {

    public final MangalistService mangaService;

    public MangalistController(MangalistService mangaService) {
        this.mangaService = mangaService;
    }

    @RequestMapping("/")
    public String listarMangas(Model model) {
        
        List<Manga> destacados = mangaService.buscarDestacados();
        
        System.out.print(destacados);
        
        model.addAttribute("mangas", destacados);
        return "index";
    }

}
