package Modelo.Herramientas;

import Modelo.Desgastes.DesgastePorPorcentajeDeFuerza;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Materiales.Material;

public class HachaDeMetal extends Hacha {

    public HachaDeMetal(){

        durabilidad = 400;
        fuerza = 10;
        desgaste = new DesgastePorPorcentajeDeFuerza(2, fuerza);

    }

    @Override
    public MateriaPrima usarContra(Material material) {

        desgastar();
        return material.gastarCon(this);

    }
}