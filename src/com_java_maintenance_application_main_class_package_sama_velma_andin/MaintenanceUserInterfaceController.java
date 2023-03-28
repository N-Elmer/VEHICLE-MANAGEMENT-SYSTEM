package com_java_maintenance_application_main_class_package_sama_velma_andin;

import com_java_maintenance_application_model_package_sama_velma_andin.MaintenanceSchedule;
import com_java_maintenance_application_model_package_sama_velma_andin.MaintenanceInventory;
import com_java_maintenance_application_DAL_package_sama_velma_andin.MaintenanceScheduleDAO;
import com_java_maintenance_application_DAL_package_sama_velma_andin.MaintenanceInventoryDAO;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class MaintenanceUserInterfaceController implements Initializable {
    
    @FXML
    private Button addButton;
    
    @FXML
    private Button deleteButton;
    
    @FXML 
    private Button clearMaintenanceScheduleButton;

    @FXML
    private Button clearMaintenanceInventoryButton;

    @FXML
    private TextField vehicle_inserter;

    @FXML
    private TextField maintenancePart_inserter;

    @FXML
    private TextField maintenanceTime_inserter;
    
    @FXML
    private TableView<MaintenanceSchedule> maintenanceTable;

    @FXML
    private TableColumn<MaintenanceSchedule, String> vehicle_matricule;

    @FXML
    private TableColumn<MaintenanceSchedule, String> maintenance_part;

    @FXML
    private TableColumn<MaintenanceSchedule, String> maintenance_time;
    
    @FXML
    private TextField brand_inserter;

    @FXML
    private TextField transmission_inserter;

    @FXML
    private TextField color_inserter;

    @FXML
    private Button addButton2;

    @FXML
    private Button deleteButton2;

    @FXML
    private TextField seat_inserter;

    @FXML
    private TextField quantity_inserter;

    @FXML
    private TextField price_inserter;

    @FXML
    private TextField discount_inserter;

    @FXML
    private DatePicker date_inserter;

    @FXML
    private TableView<MaintenanceInventory> inventoryTable;

    @FXML
    private TableColumn<MaintenanceInventory, String> Car_Name;

    @FXML
    private TableColumn<MaintenanceInventory, String> Transmission;

    @FXML
    private TableColumn<MaintenanceInventory, String> Color;

    @FXML
    private TableColumn<MaintenanceInventory, String> Seat;

    @FXML
    private TableColumn<MaintenanceInventory, String> Quantity;

    @FXML
    private TableColumn<MaintenanceInventory, String> Price;

    @FXML
    private TableColumn<MaintenanceInventory, String> Discount;

    ObservableList<MaintenanceSchedule> maintenanceList = FXCollections.observableArrayList();
    
    ObservableList<MaintenanceInventory> maintenanceList2 = FXCollections.observableArrayList();
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vehicle_matricule.setCellValueFactory(new PropertyValueFactory<>("vehicle_matricule"));
        maintenance_part.setCellValueFactory(new PropertyValueFactory<>("maintenance_part"));
        maintenance_time.setCellValueFactory(new PropertyValueFactory<>("maintenance_time"));
        maintenanceList = MaintenanceScheduleDAO.getTableData();
        maintenanceTable.setItems(maintenanceList);
        maintenanceTable.setEditable(true);
        vehicle_matricule.setCellFactory(TextFieldTableCell.forTableColumn());
        maintenance_part.setCellFactory(TextFieldTableCell.forTableColumn());
        maintenance_time.setCellFactory(TextFieldTableCell.forTableColumn());
        maintenanceTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Car_Name.setCellValueFactory(new PropertyValueFactory<>("Car_Name"));
        Transmission.setCellValueFactory(new PropertyValueFactory<>("Transmission"));
        Color.setCellValueFactory(new PropertyValueFactory<>("Color"));
        Seat.setCellValueFactory(new PropertyValueFactory<>("Seat"));
        Quantity.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        Price.setCellValueFactory(new PropertyValueFactory<>("Price"));
        Discount.setCellValueFactory(new PropertyValueFactory<>("Discount"));
        maintenanceList2 = MaintenanceInventoryDAO.getTableData2();
        inventoryTable.setItems(maintenanceList2);
        inventoryTable.setEditable(true);
        Car_Name.setCellFactory(TextFieldTableCell.forTableColumn());
        Transmission.setCellFactory(TextFieldTableCell.forTableColumn());
        Color.setCellFactory(TextFieldTableCell.forTableColumn());
        Seat.setCellFactory(TextFieldTableCell.forTableColumn());
        Quantity.setCellFactory(TextFieldTableCell.forTableColumn());
        Price.setCellFactory(TextFieldTableCell.forTableColumn());
        Discount.setCellFactory(TextFieldTableCell.forTableColumn());
        inventoryTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    
    
    @FXML
    private void addData(ActionEvent event) {
        MaintenanceSchedule newData = new MaintenanceSchedule(
                                vehicle_inserter.getText(),
                                maintenancePart_inserter.getText(),
                                maintenanceTime_inserter.getText());  
        maintenanceTable.getItems().add(newData);

        vehicle_inserter.clear();
        maintenancePart_inserter.clear();
        maintenanceTime_inserter.clear();
        brand_inserter.clear();
        transmission_inserter.clear();
        color_inserter.clear();
        seat_inserter.clear();
        quantity_inserter.clear();
        price_inserter.clear();
        discount_inserter.clear();
    }
    
    @FXML
    private void addData2(ActionEvent event) {
        MaintenanceInventory newData = new MaintenanceInventory(
                                brand_inserter.getText(),
                                transmission_inserter.getText(),
                                color_inserter.getText(),
                                seat_inserter.getText(),
                                quantity_inserter.getText(),
                                price_inserter.getText(),
                                discount_inserter.getText());
        inventoryTable.getItems().add(newData);

        vehicle_inserter.clear();
        maintenancePart_inserter.clear();
        maintenanceTime_inserter.clear();
        brand_inserter.clear();
        transmission_inserter.clear();
        color_inserter.clear();
        seat_inserter.clear();
        quantity_inserter.clear();
        price_inserter.clear();
        discount_inserter.clear();
    }
    
    @FXML
    private void clearData(ActionEvent event) {
        vehicle_inserter.clear();
        maintenancePart_inserter.clear();
        maintenanceTime_inserter.clear();
    }
    
    @FXML
    private void clearData2(ActionEvent event) {
        brand_inserter.clear();
        transmission_inserter.clear();
        color_inserter.clear();
        seat_inserter.clear();
        quantity_inserter.clear();
        price_inserter.clear();
        discount_inserter.clear();
    }
    
    @FXML
    private void deleteData(ActionEvent event) {
        ObservableList<MaintenanceSchedule> selectedRows, allDatas;
        allDatas = maintenanceTable.getItems();
        selectedRows = maintenanceTable.getSelectionModel().getSelectedItems();
        for (MaintenanceSchedule data: selectedRows)
        {
            allDatas.remove(data);
        }
    }
    
    @FXML
    private void deleteData2(ActionEvent event) {
        ObservableList<MaintenanceInventory> selectedRows, allDatas;
        allDatas = inventoryTable.getItems();
        selectedRows = inventoryTable.getSelectionModel().getSelectedItems();
        for (MaintenanceInventory data: selectedRows)
        {
            allDatas.remove(data);
        }
    }
    
    @FXML
    private void changeVehicle_matricule(CellEditEvent edittedCell) {
        MaintenanceSchedule dataSelected = maintenanceTable.getSelectionModel().getSelectedItem();
        dataSelected.setVehicle_matricule(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeMaintenance_part(CellEditEvent edittedCell) {
        MaintenanceSchedule dataSelected = maintenanceTable.getSelectionModel().getSelectedItem();
        dataSelected.setMaintenance_part(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeMaintenance_time(CellEditEvent edittedCell) {
        MaintenanceSchedule dataSelected = maintenanceTable.getSelectionModel().getSelectedItem();       
        dataSelected.setMaintenance_time(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeCar_name(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();
        dataSelected.setCar_Name(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeTransmission(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();
        dataSelected.setTransmission(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeColor(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();       
        dataSelected.setColor(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeSeat(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();
        dataSelected.setSeat(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeQuantity(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();       
        dataSelected.setQuantity(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changePrice(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();
        dataSelected.setPrice(edittedCell.getNewValue().toString());
    }
    
    @FXML
    private void changeDiscount(CellEditEvent edittedCell) {
        MaintenanceInventory dataSelected = inventoryTable.getSelectionModel().getSelectedItem();       
        dataSelected.setDiscount(edittedCell.getNewValue().toString());
    }

}
