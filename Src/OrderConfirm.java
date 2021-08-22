package Main;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.image.*;
import java.io.FileInputStream;
public class OrderConfirm extends Application {
    
    String name="default";
    Button log = new Button("Confirm");
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Order confirm");
        //String name ="Rockrider";
        String customer="Admin";
        String prc = "123";
        //GridPane gp = new GridPane();
        
        Payment pay = new Payment();
        Scene next = pay.getPayment();
        
        FileInputStream file = new FileInputStream("C:\\Users\\yo yo\\Desktop\\SHO 2\\Mission C\\PBLab\\JDBC Application\\images\\"+name+".png");
        Image image = new Image(file);
        ImageView img = new ImageView(image);
        img.setFitWidth(300);
        img.setFitHeight(200);
        
        Label label = new Label("Name: "+name+"\t\tPrice: "+prc+"\nStatus: Availble\tCondition: Good");
        label.setLayoutX(30);
        label.setLayoutY(200);
        
        Label l1 = new Label("Pickup Spot");
        TextField f1 = new TextField();
        Label l2 = new Label("Adhar no.");
        TextField f2 = new TextField();
        l1.setLabelFor(f1);
        f1.setLayoutX(100);
        f1.setLayoutY(250);
        l1.setLayoutX(30);
        l1.setLayoutY(250);
        l2.setLabelFor(f2);
        f2.setLayoutX(100);
        f2.setLayoutY(280);
        l2.setLayoutX(30);
        l2.setLayoutY(280);
        
        Pane sp = new Pane();
        Label title = new Label("\n\n\t\t\t\t\t\tPlease confirm your order");
        Text txt = new Text();
        Button reg = new Button("Cancel");
        log.setLayoutX(80);
        log.setLayoutY(320);
        reg.setLayoutX(180);
        reg.setLayoutY(320);
        log.setOnAction(go_next->{
           primaryStage.setScene(next);
           primaryStage.show();
        });
        sp.getChildren().addAll(title, img, label, l1 ,f1, l2, f2, log, reg);
        //StackPane.setAlignment(log, Pos.CENTER_LEFT);
        //StackPane.setAlignment(reg, Pos.CENTER_RIGHT);
        //gp.add(title, 0, 0, 1, 1);
        Scene scene = new Scene(sp, 300, 360);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Scene getOrder(String name)throws Exception
    {
        //String name="Gunner";
        String customer="Admin";
        String prc = "123";
        //GridPane gp = new GridPane();
        
        FileInputStream file = new FileInputStream("C:\\Users\\yo yo\\Desktop\\SHO 2\\Mission C\\PBLab\\JDBC Application\\images\\"+name+".png");
        Image image = new Image(file);
        ImageView img = new ImageView(image);
        img.setFitWidth(300);
        img.setFitHeight(200);
        
        Label label = new Label("Name: "+name+"\t\tPrice: "+prc+"\nStatus: Availble\tCondition: Good");
        label.setLayoutX(30);
        label.setLayoutY(200);
        
        Label l1 = new Label("Pickup Spot");
        TextField f1 = new TextField();
        Label l2 = new Label("Adhar no.");
        TextField f2 = new TextField();
        l1.setLabelFor(f1);
        f1.setLayoutX(100);
        f1.setLayoutY(250);
        l1.setLayoutX(30);
        l1.setLayoutY(250);
        l2.setLabelFor(f2);
        f2.setLayoutX(100);
        f2.setLayoutY(280);
        l2.setLayoutX(30);
        l2.setLayoutY(280);
        
        Pane sp = new Pane();
        Label title = new Label("\n\n\t\t\t\t\t\tPlease confirm your order");
        Text txt = new Text();
        Button log = new Button("Confirm");
        Button reg = new Button("Cancel");
        log.setLayoutX(80);
        log.setLayoutY(320);
        reg.setLayoutX(180);
        reg.setLayoutY(320);
        sp.getChildren().addAll(title, img, label, l1 ,f1, l2, f2, log, reg);
        //StackPane.setAlignment(log, Pos.CENTER_LEFT);
        //StackPane.setAlignment(reg, Pos.CENTER_RIGHT);
        //gp.add(title, 0, 0, 1, 1);
        Scene scene = new Scene(sp, 300, 360);
        return scene;
    }
    public void OrderConfirmation(String bikename)
    {
        name=bikename;
    }
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
