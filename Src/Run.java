package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
public class Run extends Application
{
    OrderConfirm oc = new OrderConfirm();
    @Override
    public void start(Stage primaryStage)throws Exception
    {
        //Welcome Page
        Pane sp = new Pane();
        Label title = new Label("\n\n\t\t\t\t\t\tWelcome To Bicycle Rental System");
        Button log = new Button("Login");
        Button reg = new Button("Register");
        log.setLayoutX(120);
        log.setLayoutY(120);
        reg.setLayoutX(320);
        reg.setLayoutY(120);
        sp.getChildren().addAll(title, log, reg);
        Scene welcome = new Scene(sp, 500, 300);
        
        
        //Registration
        //
        GridPane gridPane = createRegistrationFormPane();
        // Add Header
        Label headerLabel = new Label("Registration Form");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));
        // Add Name Label
        Label nameLabel = new Label("Full Name : ");
        gridPane.add(nameLabel, 0,1);
        // Add Name Text Field
        TextField nameField = new TextField();
        nameField.setPrefHeight(40);
        gridPane.add(nameField, 1,1);
        // Add Email Label
        Label emailLabel = new Label("Email ID : ");
        gridPane.add(emailLabel, 0, 2);
        // Add Email Text Field
        TextField emailField = new TextField();
        emailField.setPrefHeight(40);
        gridPane.add(emailField, 1, 2);
        // Add Password Label
        Label passwordLabel = new Label("Password : ");
        gridPane.add(passwordLabel, 0, 3);
        // Add Password Field
        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(40);
        gridPane.add(passwordField, 1, 3);
        // Add Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 4, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
        // Create a scene with registration form grid pane as the root node
        Scene RegisterForm = new Scene(gridPane, 800, 500);
        
        //Login
        //
        GridPane gridPane2 = createRegistrationFormPane();
        // Add Header
        Label headerLabel2 = new Label("Login Form");
        headerLabel2.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane2.add(headerLabel2, 0,0,2,1);
        GridPane.setHalignment(headerLabel2, HPos.CENTER);
        GridPane.setMargin(headerLabel2, new Insets(20, 0,20,0));
        // Add Name Label
        Label nameLabel2 = new Label("Full Name : ");
        gridPane2.add(nameLabel2, 0,1);
        // Add Name Text Field
        TextField nameField2 = new TextField();
        nameField2.setPrefHeight(40);
        gridPane2.add(nameField2, 1,1);
        // Add Email Label
        Label emailLabel2 = new Label("Email ID : ");
        gridPane2.add(emailLabel2, 0, 2);
        // Add Email Text Field
        TextField emailField2 = new TextField();
        emailField2.setPrefHeight(40);
        gridPane2.add(emailField2, 1, 2);
        // Add Password Label
        Label passwordLabel2 = new Label("Password : ");
        gridPane2.add(passwordLabel2, 0, 3);
        // Add Password Field
        PasswordField passwordField2 = new PasswordField();
        passwordField2.setPrefHeight(40);
        gridPane2.add(passwordField2, 1, 3);
        // Add Submit Button
        Button submitButton2 = new Button("Submit");
        submitButton2.setPrefHeight(40);
        submitButton2.setDefaultButton(true);
        submitButton2.setPrefWidth(100);
        gridPane2.add(submitButton2, 0, 4, 2, 1);
        GridPane.setHalignment(submitButton2, HPos.CENTER);
        GridPane.setMargin(submitButton2, new Insets(20, 0,20,0));
        // Create a scene with registration form grid pane as the root node
        Scene LoginForm = new Scene(gridPane2, 800, 500);
        
        //ProductDisplay
        OrderConfirm oc = new OrderConfirm();
        Scene[] next = GetScenes();
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
        Scene product = new Scene(gp,300,100);
        
        //Controls - Linking
        if(b1.isPressed())
        {
            primaryStage.setScene(welcome);
        }
        reg.setOnAction(Register->{
            primaryStage.setScene(RegisterForm);
            primaryStage.show();
        });
        log.setOnAction(login->{
            primaryStage.setScene(LoginForm);
            primaryStage.show();
        });
        submitButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(emailField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                    return;
                }

                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
                System.out.println(nameField.getText());
                System.out.println(emailField.getText());
                System.out.println(passwordField.getText());
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Shobhit@123");
                    System.out.println("Successful!");
                    PreparedStatement pst;
                    pst = con.prepareStatement("insert into userdata(usn,pwd,email) values(?,?,?)");
                    pst.setString(1, nameField.getText());
                    pst.setString(2, passwordField.getText());
                    pst.setString(3, emailField.getText());
                    pst.executeUpdate();
                    pst.close();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                primaryStage.setScene(product);
                primaryStage.show();
            }
        });
        submitButton2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                if(nameField2.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(emailField2.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                    return;
                }
                if(passwordField2.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                    return;
                }

                
                System.out.println(nameField2.getText());
                System.out.println(emailField2.getText());
                System.out.println(passwordField2.getText());
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Shobhit@123");
                    System.out.println("Successful!");
                    Statement st;
                    ResultSet rs;
                    st = con.createStatement();
                    rs = st.executeQuery("select * from userdata where usn='"+nameField2.getText()+"'");
                    int flag=0;
                    while (rs.next())
                    {
                        if(rs.getString("pwd").equals(passwordField2.getText()))
                        {
                            flag=1;
                        }
                    }
                    if(flag == 1)
                    {
                        showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
                        primaryStage.setScene(product);
                        primaryStage.show();
                    }
                    else
                    {
                        showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Username or Password is incorrect", "Please retry");
                        primaryStage.setScene(RegisterForm);
                        primaryStage.show();
                    }
                    st.close();
                    rs.close();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
               
            }
        });
        primaryStage.setScene(welcome);
        primaryStage.show();
    }
    
    
    private GridPane createRegistrationFormPane() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    public Scene[] GetScenes()throws Exception
    {
        Scene[] scenes = new Scene[12];
        String[] bikes = {"Cowboy","Gunner","Commander","MyHybrid","Traveller","TopGear","Riverside","7Speed","Compass","Caliber","Deadpool","Rockrider"};
        for(int i=0;i<12;i++)
        {
            scenes[i] = oc.getOrder(bikes[i]);
        }
        return scenes;
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
