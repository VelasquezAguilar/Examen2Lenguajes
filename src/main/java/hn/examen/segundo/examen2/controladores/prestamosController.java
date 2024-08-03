package hn.examen.segundo.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.examen.segundo.examen2.modelos.Clientes;
import hn.examen.segundo.examen2.modelos.Prestamos;
import hn.examen.segundo.examen2.servicios.prestamosServicio;

@RestController
@RequestMapping("/api/prestamos")
public class prestamosController {

    @Autowired
    private prestamosServicio prestamosServicio;

    @PostMapping("/crear/{dni}")
    public Prestamos crearPrestamos(@PathVariable(name = "dni") String dni, @RequestBody Prestamos nvoPrestamo) {
        if (this.prestamosServicio.infocliente(dni)) {

            return this.prestamosServicio.crearprestamos(dni, nvoPrestamo);

        }

        return nvoPrestamo;

    }

}
