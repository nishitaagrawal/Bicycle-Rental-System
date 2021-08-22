package Main;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.sql.*;
public class DispOne extends Application
{
    Button but = new Button();
    Scene scene = new Scene(but,200,100);
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        OrderConfirm oc = new OrderConfirm();
        Scene[] next = GetScenes();
        Payment pay = new Payment();
        Scene py = pay.getPayment();
        primaryStage.setTitle("Choose Bike Type");
        Button b1 = new Button("  Geared  ");
        Button b2 = new Button("Non-Geared");
        Button b3 = new Button("Mountain");
        GridPane gp = new GridPane();
        gp.add(b1, 0, 0);
        gp.add(b2, 1, 0);
        gp.add(b3, 0, 1);
        gp.setHgap(10);
        gp.setVgap(10);
        
        //ImageView[] img = GetAll(bikes);
        b1.setOnAction(action ->{
        Button ba = new Button("Cowboy");
        Button bb = new Button(" Gunner ");
        Button bc = new Button("Commander");
        Button bd = new Button("MyHybrid");
        GridPane gp2 = new GridPane();
        gp2.add(ba, 0, 0);
        gp2.add(bb, 0, 1);
        gp2.add(bd, 1, 1);
        gp2.add(bc, 1, 0);
        gp2.setHgap(20);
        gp2.setVgap(20);
        ba.setOnAction(X ->{
            primaryStage.setScene(next[0]);
            primaryStage.show();
        });
        bb.setOnAction(X ->{            
            primaryStage.setScene(next[1]);
            primaryStage.show();
        });
        bc.setOnAction(X ->{            
            primaryStage.setScene(next[2]);
            primaryStage.show();
        });
        bd.setOnAction(X ->{            
            primaryStage.setScene(next[3]);
            primaryStage.show();
        });
        Scene scene2 = new Scene(gp2,300,100);
        primaryStage.setScene(scene2);
        primaryStage.show();});
        
        b2.setOnAction(action -> {Button ba = new Button("Traveller");
        Button bb = new Button("TopGear");
        Button bc = new Button("Riverside");
        Button bd = new Button(" 7Speed ");
        GridPane gp2 = new GridPane();
        gp2.add(ba, 0, 0);
        gp2.add(bb, 0, 1);
        gp2.add(bd, 1, 1);
        gp2.add(bc, 1, 0);
        gp2.setHgap(20);
        gp2.setVgap(20);
        ba.setOnAction(X ->{            
            primaryStage.setScene(next[4]);
            primaryStage.show();
        });
        bb.setOnAction(X ->{            
            primaryStage.setScene(next[5]);
            primaryStage.show();
        });
        bc.setOnAction(X ->{            
            primaryStage.setScene(next[6]);
            primaryStage.show();
        });
        bd.setOnAction(X ->{            
            primaryStage.setScene(next[7]);
            primaryStage.show();
        });
        Scene scene2 = new Scene(gp2,300,100);
        primaryStage.setScene(scene2);
        primaryStage.show();});
        
        b3.setOnAction(action -> {Button ba = new Button("Compass");
        Button bb = new Button("  Caliber  ");
        Button bc = new Button("Deadpool");
        Button bd = new Button("Rockrider");
        GridPane gp2 = new GridPane();
        gp2.add(ba, 0, 0);
        gp2.add(bb, 0, 1);
        gp2.add(bd, 1, 1);
        gp2.add(bc, 1, 0);
        gp2.setHgap(20);
        gp2.setVgap(20);
        ba.setOnAction(X ->{            
            primaryStage.setScene(next[8]);
            primaryStage.show();
        });
        bb.setOnAction(X ->{            
            primaryStage.setScene(next[9]);
            primaryStage.show();
        });
        bc.setOnAction(X ->{            
            primaryStage.setScene(next[10]);
            primaryStage.show();
        
        });
        bd.setOnAction(X ->{            
            primaryStage.setScene(next[11]);
            primaryStage.show();
        });
        Scene scene2 = new Scene(gp2,300,100);
        primaryStage.setScene(scene2);
        primaryStage.show();});
        Scene scene = new Scene(gp,300,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Scene[] GetScenes()throws Exception
    {
        OrderConfirm oc = new OrderConfirm();
        Scene[] scenes = new Scene[12];
        String[] bikes = {"Cowboy","Gunner","Commander","MyHybrid","Traveller","TopGear","Riverside","7Speed","Compass","Caliber","Deadpool","Rockrider"};
        for(int i=0;i<12;i++)
        {
            scenes[i] = oc.getOrder(bikes[i]);
        }
        return scenes;
    }
    public void writeTo()throws Exception
    {
        PreparedStatement pst;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Shobhit@123");
        System.out.println("Successful!");
    }
    public static void main(String[] args)throws Exception
    {
        Application.launch(args);
    }
    
}
