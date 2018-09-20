import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group grp = new Group();
        Scene scene = new Scene(grp ,400 ,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("加加程式");
        primaryStage.show();

        Text text = new Text("0");
        text.setLayoutX(100);
        text.setLayoutY(50);
        text.setX(100);
        text.setY(50);

        final int[] x = {0};

        Button bt = new Button("ADD");
        bt.setPrefSize(80, 60);
        bt.setLayoutX(300);
        bt.setLayoutY(200);
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                x[0] += 1;

                text.setText(Integer.toString(x[0]));
            }
        });

        grp.getChildren().add(bt);
        grp.getChildren().add(text);

    }
}
