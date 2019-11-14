package org.convertator.view;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        String from;
        VerticalLayout todosList = new VerticalLayout();
        ComboBox<String> select = new ComboBox<>("Select from unit");
        select.setItems("Miles", "Meters", "Foots", "Inchs");
        ComboBox<String> selectTo = new ComboBox<>("Select to unit");
        selectTo.setItems("Miles", "Meters", "Foots", "Inchs");
        TextField taskField = new TextField();
        Button convertButton = new Button("Convert");
        convertButton.addClickShortcut(Key.ENTER);


        add(
                new H1("Converter"),
                todosList,
                new HorizontalLayout(
                        select,
                        selectTo,
                        taskField,
                        convertButton
                )
        );
    }
}