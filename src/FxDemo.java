import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
public  class FxDemo extends Application
{

    public void start(Stage stage)
    {
        Label nameL=new Label("Name:");
        TextField nameT=new TextField();
        Button Ok=new Button("OK");
        Ok.setStyle("-fx-pref-width:100;-fx-pref-height:20");
        Ok.setOnAction(e->
        {
            Alert Alt=new Alert(Alert.AlertType.INFORMATION);
            Alt.setTitle("My Alert");
            Alt.setContentText("Hello"+nameT.getText());
        });
        VBox vb=new VBox(10,nameL,nameT,Ok);
        Scene sc=new Scene(vb,400,400);
        stage.setScene(sc);
        stage.setTitle("My fx application");
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}