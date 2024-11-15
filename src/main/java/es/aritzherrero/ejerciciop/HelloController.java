package es.aritzherrero.ejerciciop;

import es.aritzherrero.ejercicioo.ProductoLabel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase que controla los eventos de la ventana
 */
public class HelloController implements Initializable {
    @FXML // fx:id="product1"
    private ProductoLabel product1; // Value injected by FXMLLoader

    @FXML // fx:id="product2"
    private ProductoLabel product2; // Value injected by FXMLLoader

    @FXML // fx:id="product3"
    private ProductoLabel product3; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se carga la ventana
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Producto 1
        product1.setImage(new Image(getClass().getResourceAsStream("images/pan.png")));
        product1.setNombre("Pan");
        product1.setStock(10);
        // Producto 2
        product2.setImage(new Image(getClass().getResourceAsStream("images/manzana.png")));
        product2.setNombre("Manzana");
        product2.setStock(200);
        // Producto 3
        product3.setImage(new Image(getClass().getResourceAsStream("images/leche.png")));
        product3.setNombre("Leche");
        product3.setStock(50);
    }

}}