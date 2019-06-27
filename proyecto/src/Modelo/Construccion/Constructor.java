package Modelo.Construccion;

import Modelo.Excepciones.ConstruccionInvalidaException;
import Modelo.Excepciones.RecetaIncompatibleException;
import Modelo.Herramientas.*;
import Modelo.MateriaPrima.Antimateria;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Recetas.*;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

public class Constructor {

    //Atributos
    private ArrayList<Receta> recetas;

    //Metodos
    public Constructor(){
        recetas = new ArrayList<>();
        recetas.add(new RecetaPicoDeMadera());
        recetas.add(new RecetaPicoDePiedra());
        recetas.add(new RecetaPicoDeMetal());
        recetas.add(new RecetaPicoFino());
        recetas.add(new RecetaHachaDeMadera());
        recetas.add(new RecetaHachaDePiedra());
        recetas.add(new RecetaHachaDeMetal());
    }

    public Herramienta construirCon(ArrayList<MateriaPrima> elementosEnMesa){  //Cada receta es unica

        for( Receta receta : recetas){
            try{
                receta.comparar(elementosEnMesa);
                return receta.getHerramienta();
            } catch (RecetaIncompatibleException e){}

        }
        for(int i=0; i<9; i++)
            elementosEnMesa.set(i, new Antimateria());
        throw new ConstruccionInvalidaException();
    }


    public ArrayList<Receta> getRecetas() {
        return recetas;
    }
}
