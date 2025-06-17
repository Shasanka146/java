import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
public class SumOfTwoNumberUsingJFx extends Application
{
    public void start(Stage stage)
    {
        Label nameL=new Label("Num 1:");
        TextField nameT=new TextField();
        Label nameM=new Label("Num 2:");
        TextField nameN=new TextField();
        Label nameO=new Label("Result:");
        TextField nameP=new TextField();
        Button Sum=new Button("Sum");
        Sum.setOnAction(e->
        {
            try {
                double num1 = Double.parseDouble(nameT.getText());
                double num2 = Double.parseDouble(nameN.getText());
                double S1= num1 * num2;
                nameP.setText(""+S1);
            } catch (NumberFormatException ex) {
                nameP.setText("Please enter valid numbers.");
                ex.printStackTrace();
            }
        });

        VBox vbox = new VBox(10,nameL, nameT, nameM, nameN, nameO, nameP, Sum);
        Scene scene = new Scene(vbox,500,500);
        stage.setScene(scene);

        stage.show();

    }
    public static void main(String[] args)
    {
        launch(args);
    }

}
