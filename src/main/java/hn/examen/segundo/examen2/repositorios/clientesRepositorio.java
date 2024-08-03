package hn.examen.segundo.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.examen.segundo.examen2.modelos.Clientes;

@Repository
public interface clientesRepositorio extends JpaRepository<Clientes, String> {

}
