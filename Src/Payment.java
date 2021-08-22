package Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import java.io.FileInputStream;
public class Payment extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Payment");
        String name ="QR";
        ThankYou tk = new ThankYou();
        Scene next = tk.getThanks();
        
        FileInputStream file = new FileInputStream("C:\\Users\\yo yo\\Desktop\\SHO 2\\Mission C\\PBLab\\JDBC Application\\images\\"+name+".png");
        Image image = new Image(file);
        ImageView img = new ImageView(image);
        img.setFitWidth(300);
        img.setFitHeight(200);
        
        Label label = new Label("Enter Successful Transaction ID:");
        label.setLayoutX(70);
        label.setLayoutY(200);
        
        TextField txt = new TextField();
        txt.setLayoutX(65);
        txt.setLayoutY(240);
        
        Pane sp = new Pane();
        Label title = new Label("\n\n\t\t\t\t\t\tSCAN TO PAY");
        Button log = new Button("Confirm");
        Button reg = new Button("Cancel");
        log.setLayoutX(60);
        log.setLayoutY(300);
        reg.setLayoutX(150);
        reg.setLayoutY(300);
        sp.getChildren().addAll(title, img, label, txt, log, reg);
        log.setOnAction(Y->{ primaryStage.setScene(next);primaryStage.show(); });
        Scene scene = new Scene(sp, 300, 360);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Scene getPayment()throws Exception
    {
        String name ="QR";
        //GridPane gp = new GridPane();
        
        FileInputStream file = new FileInputStream("C:\\Users\\yo yo\\Desktop\\SHO 2\\Mission C\\PBLab\\JDBC Application\\images\\"+name+".png");
        Image image = new Image(file);
        ImageView img = new ImageView(image);
        img.setFitWidth(300);
        img.setFitHeight(200);
        
        Label label = new Label("Enter Successful Transaction ID:");
        label.setLayoutX(70);
        label.setLayoutY(200);
        
        TextField txt = new TextField();
        txt.setLayoutX(65);
        txt.setLayoutY(240);
        
        Pane sp = new Pane();
        Label title = new Label("\n\n\t\t\t\t\t\tSCAN TO PAY");
        Button log = new Button("Confirm");
        Button reg = new Button("Cancel");
        log.setLayoutX(60);
        log.setLayoutY(300);
        reg.setLayoutX(150);
        reg.setLayoutY(300);
        sp.getChildren().addAll(title, img, label, txt, log, reg);
        //StackPane.setAlignment(log, Pos.CENTER_LEFT);
        //StackPane.setAlignment(reg, Pos.CENTER_RIGHT);
        //gp.add(title, 0, 0, 1, 1);
        Scene scene = new Scene(sp, 300, 360);
        return scene;
    }
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
