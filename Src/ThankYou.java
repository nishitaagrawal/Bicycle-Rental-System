package Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class ThankYou extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("BYE BYE");
        //GridPane gp = new GridPane();
        Pane sp = new Pane();
        Label title = new Label("\n\tYour Order is Confirmed\n\tTHANKS FOR USING BRS");
        Text txt = new Text();
        Button log = new Button("    Exit    ");
        log.setLayoutX(60);
        log.setLayoutY(60);
        sp.getChildren().addAll(title, log);
        //StackPane.setAlignment(log, Pos.CENTER_LEFT);
        //StackPane.setAlignment(reg, Pos.CENTER_RIGHT);
        //gp.add(title, 0, 0, 1, 1);
        Scene scene = new Scene(sp, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Scene getThanks()
    {
        Pane sp = new Pane();
        Label title = new Label("\n\tYour Order is Confirmed\n\tTHANKS FOR USING BRS");
        Text txt = new Text();
        Button log = new Button("    Exit    ");
        log.setLayoutX(60);
        log.setLayoutY(60);
        sp.getChildren().addAll(title, log);
        Scene scene = new Scene(sp, 200, 100);
        return scene;
    }
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
