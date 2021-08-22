package Main;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
//import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
public class PolicyPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Terms and Condition");
        //GridPane gp = new GridPane();
        StackPane sp = new StackPane();
        Label title = new Label("Terms and Condition");
        Text txt = new Text("Following are the Terms and Conditions, Please read carefully\n\n"+"PICKUP & DROP\nBicycle can be picked up from nearest depot \n and needs to be dropped at any depot\n\n"+"RENTAL FEE\n"+"The rent is applied on a daily basis based on bicycle variety,\npayment is done via app\n\n"+"BICYCLE DAMAGE\n"+"-If a Breakdown occurs please contact Customer Service,\n-If customer reparis the bike himself then the Company will not bear the cost\n-As a rule,Cost of repair will be charged to customer");
        Button bt = new Button("I agree");
        sp.getChildren().addAll(title, txt, bt);
        StackPane.setAlignment(title, Pos.TOP_CENTER);
        StackPane.setAlignment(txt, Pos.CENTER);
        StackPane.setAlignment(bt, Pos.BOTTOM_CENTER);
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
