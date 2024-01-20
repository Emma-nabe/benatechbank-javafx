module com.btech.benatechbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.btech.benatechbank to javafx.fxml;
    exports com.btech.benatechbank;
    exports com.btech.benatechbank.Controllers;
    exports com.btech.benatechbank.Controllers.Admin;
    exports com.btech.benatechbank.Controllers.Client;
    exports com.btech.benatechbank.Models;
    exports com.btech.benatechbank.Views;
}