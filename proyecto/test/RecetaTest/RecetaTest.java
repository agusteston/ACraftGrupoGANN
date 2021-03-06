package RecetaTest;

import Modelo.Excepciones.RecetaIncompatibleException;
import Modelo.Herramientas.*;
import Modelo.MateriaPrima.*;
import Modelo.Recetas.*;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

public class RecetaTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test01RecetaHachaDeMaderaDevuelveHachaDeMaderaSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaHachaDeMadera receta = new RecetaHachaDeMadera();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof HachaDeMadera);
    }

    @Test
    public void test02RecetaHachaDeMetalDevuelveHachaDeMetalSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaHachaDeMetal receta = new RecetaHachaDeMetal();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof HachaDeMetal);
    }

    @Test
    public void test03RecetaHachaDePiedraDevuelveHachaDePiedraSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaHachaDePiedra receta = new RecetaHachaDePiedra();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof HachaDePiedra);
    }

    @Test
    public void test04RecetaPicoDeMaderaDevuelvePicoDeMaderaSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaPicoDeMadera receta = new RecetaPicoDeMadera();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof PicoDeMadera);
    }

    @Test
    public void test05RecetaPicoDeMetalDevuelvePicoDeMetalSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaPicoDeMetal receta = new RecetaPicoDeMetal();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof PicoDeMetal);
    }

    @Test
    public void test06RecetaPicoDePiedraDevuelvePicoDePiedraSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaPicoDePiedra receta = new RecetaPicoDePiedra();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof PicoDePiedra);
    }

    @Test
    public void test07RecetaPicoFinoDevuelvePicoFinoSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaPicoFino receta = new RecetaPicoFino();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        Assert.assertTrue(receta.comparar(elementosDeLaMesa) instanceof PicoFino);
    }

    @Test
    public void test08RecetaHachaDeMaderaDevuelveExcepcionSiLosElementosDeLaMesaNoSonIgualesASuReceta(){
        RecetaHachaDeMadera receta = new RecetaHachaDeMadera();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }

    @Test
    public void test09RecetaHachaDeMetalDevuelveExcepcionSiLosElementosDeLaMesaNOSonIgualesASuReceta(){
        RecetaHachaDeMetal receta = new RecetaHachaDeMetal();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }

    @Test
    public void test10RecetaHachaDePiedraDevuelveExcepcionSiLosElementosDeLaMesaNoSonIgualesASuReceta(){
        RecetaHachaDePiedra receta = new RecetaHachaDePiedra();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }

    @Test
    public void test11RecetaPicoDeMaderaDevuelveExcepcionSiLosElementosDeLaMesaSonIgualesASuReceta(){
        RecetaPicoDeMadera receta = new RecetaPicoDeMadera();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }

    @Test
    public void test12RecetaPicoDeMetalDevuelveExcepcionSiLosElementosDeLaMesaNoSonIgualesASuReceta(){
        RecetaPicoDeMetal receta = new RecetaPicoDeMetal();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }

    @Test
    public void test13RecetaPicoDePiedraDevuelveExcepcionSiLosElementosDeLaMesaNoSonIgualesASuReceta(){
        RecetaPicoDePiedra receta = new RecetaPicoDePiedra();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }

    @Test
    public void test14RecetaPicoFinoDevuelveExcepcionSiLosElementosDeLaMesaNoSonIgualesASuReceta(){
        RecetaPicoFino receta = new RecetaPicoFino();
        ArrayList<MateriaPrima> elementosDeLaMesa = new ArrayList<>();

        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaMetal());
        elementosDeLaMesa.add(new MateriaPrimaPiedra());
        elementosDeLaMesa.add(new MateriaPrimaMadera());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new Antimateria());
        elementosDeLaMesa.add(new MateriaPrimaDiamante());
        elementosDeLaMesa.add(new Antimateria());

        thrown.expect(RecetaIncompatibleException.class);
        receta.comparar(elementosDeLaMesa);
    }
}
