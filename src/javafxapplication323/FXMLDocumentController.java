/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication323;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 *
 * @author blj0011
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private ListView listView;

    @FXML
    private void searchAgain(ActionEvent event)
    {
        System.out.println("You pressed Btn: searchAgain");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        InfoObject infoObject1 = new InfoObject("test 1", "test 1", "text 1", getIpsumString());
        InfoObject infoObject2 = new InfoObject("test 2", "test 2", "test 2", "test 2");
        InfoObject infoObject3 = new InfoObject("test 3", "test 3", "test 3", "test 3");
        InfoObject infoObject4 = new InfoObject("test 4", "test 4", "test 4", "test 4");

        ObservableList<InfoObject> items = FXCollections.observableArrayList(infoObject1, infoObject2, infoObject3, infoObject4);
        listView.setCellFactory(listView1 -> new ListViewCell());
        listView.setItems(items);
    }

    String getIpsumString()
    {
        return "What is Lorem Ipsum?\n"
                + "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n"
                + "\n"
                + "Why do we use it?\n"
                + "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
    }
}
