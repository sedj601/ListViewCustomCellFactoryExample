/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication323;

import javafx.scene.control.ListCell;

/**
 *
 * @author blj0011
 */
public class ListViewCell extends ListCell<InfoObject>
{

    ListViewDataHandler dataHandler = new ListViewDataHandler();

    @Override
    public void updateItem(InfoObject item, boolean empty)
    {

        super.updateItem(item, empty);
        if (item == null || empty) {
            setGraphic(null);
            setText(null);
        }
        else {
            dataHandler.setTextFields(item);
            setGraphic(dataHandler.getRootNode());
            System.out.println("running!");
        }
    }
}
