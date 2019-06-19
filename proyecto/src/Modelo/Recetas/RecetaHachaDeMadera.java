package Modelo.Recetas;

import Modelo.Herramientas.HachaDeMadera;
import java.util.ArrayList;
import java.util.Arrays;

public class RecetaHachaDeMadera extends Receta {

    public RecetaHachaDeMadera(){
        herramientaAsociada = new HachaDeMadera();
        receta = new ArrayList<>(Arrays.asList(MADERA, MADERA, VACIO,
                                                      MADERA, MADERA, VACIO,
                                                      VACIO, MADERA, VACIO));
    }
}