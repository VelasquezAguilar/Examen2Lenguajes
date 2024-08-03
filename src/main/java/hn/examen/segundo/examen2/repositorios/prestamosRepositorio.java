package hn.examen.segundo.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.examen.segundo.examen2.modelos.Prestamos;

@Repository
public interface prestamosRepositorio extends JpaRepository<Prestamos, Long> {

}
