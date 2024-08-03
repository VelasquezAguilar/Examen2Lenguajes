package hn.examen.segundo.examen2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examen.segundo.examen2.modelos.Prestamos;
import hn.examen.segundo.examen2.repositorios.cuotaRepositorio;

@Service
public class cuotaServicio {

    @Autowired
    private cuotaRepositorio cuotaRepositorio;

    public double crearCuota(Integer mes, double interes, Integer plazo, double capital){

        Cuotas nvaCuota = new Cuotas();
        Prestamos prestamos = new Prestamos();

        prestamos.setCuotas(cuota)

      nvaCuota.set

    }

}
