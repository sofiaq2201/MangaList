package com.sofiaq.mangalist.repository;


import com.sofiaq.mangalist.domain.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{
    
    @Query("from Autor a order by a.nombre ")
    List<Autor> buscarTodosAutores();
}

