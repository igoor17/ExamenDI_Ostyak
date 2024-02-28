package com.example.gestionbiblioteca;

import com.example.gestionbiblioteca.models.Libro;
import com.example.gestionbiblioteca.models.Tematica;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BibliotecaController {

    @FXML
    private TableView<Libro> tablaLibros;

    @FXML
    private TableColumn<Libro, String> idColumn;

    @FXML
    private TableColumn<Libro, String> tituloColumn;

    @FXML
    private TableColumn<Libro, String> isbnColumn;

    @FXML
    private TableColumn<Libro, String> autorColumn;

    @FXML
    private TableColumn<Libro, Tematica> tematicaColumn;

}