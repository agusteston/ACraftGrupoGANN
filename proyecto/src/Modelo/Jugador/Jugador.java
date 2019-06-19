package Modelo.Jugador;

import Modelo.Construccion.MesaDeCrafteo;
import Modelo.Excepciones.*;
import Modelo.Inventario.Inventario;
import Modelo.Inventario.Utilizable;
import Modelo.MateriaPrima.MateriaPrima;
import Modelo.Materiales.Material;
import Modelo.Posicion.Posicionable;


public class Jugador implements Posicionable {
    //Atributos

    private static Jugador instanciaUnica = null;
    private Inventario inventario;
    private MesaDeCrafteo mesaDeCrafteo;


    private Jugador() {
        inventario = new Inventario();
        mesaDeCrafteo = new MesaDeCrafteo();
    }

    public static Jugador crearUnico(){
        if(instanciaUnica == null){
            instanciaUnica = new Jugador();
        }
        return instanciaUnica;
    }

    public Utilizable getUtilizableEnMano(){
        return inventario.getUtilizableActual();
    }

    public void golpear(Material material){

        MateriaPrima materiaPrima;
        Utilizable utilizable;

        try {
            utilizable = this.getUtilizableEnMano();

            try {
                materiaPrima = utilizable.usarContra(material);

                try{
                    materiaPrima.equipar(inventario);

                } catch (MateriaPrimaNoEquipableException e3) {}

            } catch (ObjetoIncapazDeGolpearException e2) {}

        } catch (InventarioVacioException e1) {}
    }

    public void crearHerramienta(){
        try{
            inventario.equipar(mesaDeCrafteo.craftear());
        }catch(ConstruccionInvalidaException e){
            //Coming soon
        }
    }

    public void anadirMateriaPrimaAMesa(int posicion){
        try{
            Utilizable utilizable = inventario.getUtilizableActual();
            utilizable.ubicarse(mesaDeCrafteo, posicion);
            inventario.quitar();
        }catch(NoSePuedeAnadirUtilizableAMesa e){
            //Coming soon
        }
    }

    public void quitarMateriaPrimaDeMesa(int posicion){
        inventario.equipar(mesaDeCrafteo.quitarMateriaPrima(posicion));
    }

}