package com.example.testjavafx;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Text city_history6;

    @FXML
    private Label current_location1;

    @FXML
    private Text desc_history6;

    @FXML
    private AnchorPane historyPane;

    @FXML
    private AnchorPane history_1;

    @FXML
    private AnchorPane history_2;

    @FXML
    private AnchorPane history_3;

    @FXML
    private AnchorPane history_4;

    @FXML
    private AnchorPane history_5;

    @FXML
    private HBox history_6;

    @FXML
    private ImageView icon_history6;

    @FXML
    private Text temp_history6;

    @FXML
    void get_his6(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.initItemHistory(history_1,"a","b","c","d","e");
        this.initItemHistory(history_2, "a","b","c","d","e");
        this.initItemHistory(history_3,"a","b","c","d","e");
        this.initItemHistory(history_4,"a","b","c","d","e");
        this.initItemHistory(history_5,"a","b","c","d","e");
        setupClickEvent(history_1);
        setupClickEvent(history_2);
        setupClickEvent(history_3);
        setupClickEvent(history_4);
        setupClickEvent(history_5);
//        setupClickEvent(history_6);

    }

    private void initItemHistory(AnchorPane parent, String HBoxId, String cityId, String iconId, String tempId, String descId){
        HBox history1 = new HBox();
        history1.setId(HBoxId);
        history1.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        history1.prefWidthProperty().bind(history_1.widthProperty());
        history1.setStyle("-fx-border-radius: 10px;");
        AnchorPane.setBottomAnchor(history1, 0.0);
        AnchorPane.setLeftAnchor(history1, 0.0);
        AnchorPane.setRightAnchor(history1, 0.0);
        AnchorPane.setTopAnchor(history1, 0.0);

        Text cityHistory1 = new Text("Ha Noi");
        cityHistory1.setId(cityId);
        cityHistory1.setWrappingWidth(150);
        cityHistory1.setFont(new Font(18.0));
        HBox.setMargin(cityHistory1, new Insets(0, 0, 0, 20));

        ImageView iconHistory1 = new ImageView(new Image("https://openweathermap.org/img/wn/10d@2x.png"));
        iconHistory1.setId(iconId);
        iconHistory1.setFitHeight(56.0);
        iconHistory1.setFitWidth(51.0);
        iconHistory1.setPickOnBounds(true);
        iconHistory1.setPreserveRatio(true);
        HBox.setMargin(iconHistory1, new Insets(0, 0, 0, 10));

        Text tempHistory1 = new Text("30°C");
        tempHistory1.setId(tempId);
        tempHistory1.setFont(new Font(18.0));
        HBox.setMargin(tempHistory1, new Insets(0, 20, 0, 0));

        Text descHistory1 = new Text("Sunny");
        descHistory1.setId(descId);
        descHistory1.setFont(new Font(14.0));

        history1.getChildren().addAll(cityHistory1, iconHistory1, tempHistory1, descHistory1);
        parent.getChildren().add(history1);
    }
    public static void setupClickEvent(AnchorPane anchorPane) {
        anchorPane.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Clicked on AnchorPane with id: " + anchorPane.getId());
            }
        });
    }
}