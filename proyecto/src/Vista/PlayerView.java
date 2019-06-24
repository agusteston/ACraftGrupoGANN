package Vista;

import Modelo.Juego.Juego;
import Modelo.Posicion.Posicion;
import Modelo.Tablero.Mapa;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.PrintStream;

public class PlayerView {

    private int coordenadaX;
    private int coordenadaY;
    private ImageView imagenDeJugador;
    private Posicion jugador;
    private Group root;
    private GridPane pane;
    private double ancho;
    private double alto;
    private int anchoMapa;
    private int altoMapa;

    public PlayerView(Group root, double unAncho, double unAlto, GridPane gridPane){


        this.jugador = Juego.instanciar().getJugador();
        this.anchoMapa = Mapa.instanciar(0,0).getAncho();
        this.altoMapa = Mapa.instanciar(0,0).getAlto();
        this.root = root;
        this.pane = gridPane;
        this.ancho = (unAncho * 0.78) / (anchoMapa);
        this.alto = (unAlto * 0.95) / (altoMapa);
        this.coordenadaX = jugador.componenteHorizontal();
        this.coordenadaY = jugador.componenteVertical();

        Image jugador = new Image("file:img/jugador.jpg");
        imagenDeJugador = new ImageView(jugador);
        imagenDeJugador.setFitWidth(this.ancho);
        imagenDeJugador.setFitHeight(this.alto);
    }


    public void dibujar(Node nodoEnGridPane){

        ImageView imagen = (ImageView) nodoEnGridPane;
        imagen.setImage(new Image("file:img/jugador.jpg"));
    }

    public Node obtenerNodo (int fila, int columna, GridPane gridPane) {
        Node resultado = null;
        ObservableList<Node> hijos = gridPane.getChildren();

        for (Node nodo : hijos) {

            if((GridPane.getRowIndex(nodo) == fila) && (GridPane.getColumnIndex(nodo) == columna)) {
                resultado = nodo;
                break;
            }
        }
        return resultado;
    }

    public void moverVertical(int numero) {

        Node nodoActual = obtenerNodo(coordenadaY, coordenadaX, pane);
        Node nodoSiguiente = obtenerNodo(coordenadaY + numero, coordenadaX, pane);
        ImageView actual = (ImageView) nodoActual;
        ImageView siguiente = (ImageView) nodoSiguiente;

        if (!(((coordenadaY == altoMapa - 1) && (numero == 1)) || ((coordenadaY == 0) && (numero == -1))) && siguiente.getImage().getUrl().equals("file:img/Vacio.png")) {
            actual.setImage(new Image("file:img/Vacio.png"));
            siguiente.setImage(null);

            coordenadaY += numero;
            dibujar(nodoSiguiente);
        }
    }

    public void moverHorizontal(int numero){

        Node nodoActual = obtenerNodo(coordenadaY, coordenadaX, pane);
        Node nodoSiguiente = obtenerNodo(coordenadaY, coordenadaX + numero, pane);
        ImageView actual = (ImageView)nodoActual;
        ImageView siguiente = (ImageView)nodoSiguiente;

        if(!(((coordenadaX == anchoMapa - 1) && (numero == 1)) || ((coordenadaX == 0) && (numero == -1))) && siguiente.getImage().getUrl().equals("file:img/Vacio.png")){
            actual.setImage(new Image("file:img/Vacio.png"));
            siguiente.setImage(null);

            coordenadaX += numero;
            dibujar(nodoSiguiente);

        }
    }

    public void picarVertical(int numero){
        Node nodoAPicar = obtenerNodo(coordenadaY + numero, coordenadaX, pane);
        ImageView material = (ImageView)nodoAPicar;
        material.setImage(new Image("file:img/Vacio.png"));
    }

    public void picarHorizontal(int numero){
        Node nodoAPicar = obtenerNodo(coordenadaY, coordenadaX  + numero, pane);
        ImageView material = (ImageView)nodoAPicar;
        material.setImage(new Image("file:img/Vacio.png"));
    }
}
