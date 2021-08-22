package Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class WelcomePage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Terms and Condition");
        //GridPane gp = new GridPane();
        Pane sp = new Pane();
        Label title = new Label("\n\n\t\t\t\t\t\tWelcome To Bicycle Rental System");
        Text txt = new Text();
        Button log = new Button("Login");
        Button reg = new Button("Register");
        log.setLayoutX(120);
        log.setLayoutY(120);
        reg.setLayoutX(320);
        reg.setLayoutY(120);
        sp.getChildren().addAll(title, log, reg);
        //StackPane.setAlignment(log, Pos.CENTER_LEFT);
        //StackPane.setAlignment(reg, Pos.CENTER_RIGHT);
        //gp.add(title, 0, 0, 1, 1);
        Scene scene = new Scene(sp, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
