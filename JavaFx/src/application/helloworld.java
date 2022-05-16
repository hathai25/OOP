package application;
import Sort.MergeSort;
import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
public class helloworld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {   	
    	TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input");
        dialog.setHeaderText("Let 's start!");
        dialog.setContentText("Nhap so phan tu cua day: ");
        Optional<String> result = dialog.showAndWait();
        int n = Integer.valueOf(result.get());
        int[] arr = new int [n];
        for(int i = 0; i<n; i++) {
        	TextInputDialog dialog1 = new TextInputDialog();
            dialog1.setContentText("Phan tu thu "+(i+1));
            dialog1.setTitle("Nhap cac phan tu cua day ");
            Optional<String> result1 = dialog1.showAndWait();
            arr[i] = Integer.valueOf(result1.get());
        }
        Button[] button1 = new Button[n];
        for(int i = 0; i<n; i++) {
        	button1[i] = new Button(String.valueOf(arr[i]));
        	button1[i].setMinHeight(30);
        	button1[i].setMinWidth(50);
        }
        HBox hbox1 = new HBox();
        hbox1.setSpacing(10);
        hbox1.setPadding(new Insets(50, 50, 0, 50));
        hbox1.setAlignment(Pos.CENTER);
        for(int i = 0; i<n; i++)
        hbox1.getChildren().add(button1[i]);
        
        HBox hbox2 = new HBox();
        hbox2.setPadding(new Insets(20, 50, 100, 50));
        hbox2.setSpacing(10);
        hbox2.setAlignment(Pos.CENTER);
        MergeSort.sort(arr,0,n-1);
        Button[] button2 = new Button[n];
        for(int i = 0; i<n; i++) {
        	button2[i] = new Button(String.valueOf(arr[i]));
        	button2[i].setMinHeight(30);
        	button2[i].setMinWidth(50);
        	hbox2.getChildren().add(button2[i]);
        }
        
        VBox vbox = new VBox();
        vbox.setSpacing(20);
        vbox.getChildren().addAll(hbox1,hbox2);
        Scene scene = new Scene(vbox,600,600);
        
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chay thu code");
        primaryStage.show();
        }
    
        
}