package com.example.projetojpa01.repositorio;

import com.example.projetojpa01.dominio.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Integer> {

}
