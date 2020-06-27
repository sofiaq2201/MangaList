package com.sofiaq.mangalist.controller;


import com.sofiaq.mangalist.domain.Manga;
import com.sofiaq.mangalist.service.AutorService;
import com.sofiaq.mangalist.service.MangalistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MangaABMController {
    
    private final AutorService autorService;
    private final MangalistService mangaService;

    public MangaABMController(AutorService autorService, MangalistService mangaService) {
        this.autorService = autorService;
        this.mangaService = mangaService;
    }
    
    //form de alta de mangas
    @RequestMapping("/manga/alta")
    public String mangaAlta(Model model){
        model.addAttribute("autores", autorService.buscarTodos());
        model.addAttribute("manga", new Manga());
        return "manga_alta";
    }
    
    //edicion de manga
     @RequestMapping("/manga/editar")
     public String mangaEditar(int mangaId, Model model){
         Manga m = mangaService.mangaInfo(mangaId);
         model.addAttribute("autores", autorService.buscarTodos());
         model.addAttribute("manga", m);
         
         return "manga_alta";
     }
     
     @PostMapping("/manga/guardar")
    public String guardar(Manga manga){
        mangaService.guardar(manga);
        return "redirect:/";
    }
    
    //eliminar Manga
    @RequestMapping("/manga/eliminar")
    public String mangaEliminar(int mangaId){
        Manga m = mangaService.mangaInfo(mangaId);
        mangaService.mangaDelete(m);
        return "redirect:/";
    }
}
