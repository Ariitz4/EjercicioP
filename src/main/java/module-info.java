module es.aritzherrero.ejerciciop {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.aritzherrero.ejercicioo;

    opens es.aritzherrero.ejerciciop to javafx.fxml,javafx.base;
    exports es.aritzherrero.ejerciciop;
}