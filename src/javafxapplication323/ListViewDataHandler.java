/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication323;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 *
 * @author blj0011
 */
public class ListViewDataHandler implements Initializable
{

    @FXML
    private VBox vBoxRoot;
    @FXML
    private Label descTl, nameTl, authorTl;
    @FXML
    private TextArea textArea;
    @FXML
    private Button openBtn;

    public ListViewDataHandler()
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListViewCellGUI.fxml"));
            fxmlLoader.setController(this);
            fxmlLoader.setClassLoader(getClass().getClassLoader());

            fxmlLoader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public VBox getRootNode()
    {
        return vBoxRoot;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    public void setButtonOnAction(EventHandler<ActionEvent> handler)
    {
        openBtn.setOnAction(handler);
    }

    public void setTextFields(InfoObject infoObject)
    {
        System.out.println("test: " + infoObject.getDescTl());
        descTl.setText(infoObject.getDescTl());
        nameTl.setText(infoObject.getNameTl());
        authorTl.setText(infoObject.getAuthorTl());
        textArea.setText(infoObject.getTextField());
    }
}
