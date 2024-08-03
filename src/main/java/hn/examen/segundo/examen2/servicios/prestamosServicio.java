package hn.examen.segundo.examen2.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen.segundo.examen2.modelos.Prestamos;
import hn.examen.segundo.examen2.repositorios.clientesRepositorio;
import hn.examen.segundo.examen2.repositorios.prestamosRepositorio;

@Service
public class prestamosServicio {

    @Autowired
    private prestamosRepositorio prestamosRepositorio;

    @Autowired
    private clientesRepositorio clientesRepositorio;

    public Prestamos crearprestamos(String dni, Prestamos nvoPrestamo) {

        return this.prestamosRepositorio.save(nvoPrestamo);

    }

    public boolean infocliente(String dni) {
        if (this.clientesRepositorio.existsById(dni)) {
            List<Prestamos> prestamos = this.clientesRepositorio.findById(dni).get().getPrestamos();
            if (prestamos.size() > 2) {
                return false;
            }
            return true;
        }
        return false;
    }

}
