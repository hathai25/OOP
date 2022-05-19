package application;

import Sort.BubbleSort;
import Sort.MergeSort;
import Sort.SelectionSort;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import utils.SplitArray;

public class helloworld extends Application {
	public void start(Stage stage) {
        TextField text1 = new TextField();
        text1.setAlignment(Pos.CENTER);
        Label label1 = new Label("Nhap vao so phan tu cua day: ");
        label1.setMinWidth(250);
        label1.setMinHeight(30);
        label1.setFont(new Font("Arial",15));
        HBox hbox1 = new HBox();
        hbox1.setSpacing(15);
        hbox1.setPadding(new Insets(20, 50,10,20));
        hbox1.getChildren().addAll(label1,text1);
        
        
        TextField text2 = new TextField();
        text2.setAlignment(Pos.CENTER);
        Label label2 = new Label("Nhap vao cac phan tu cua day: ");
        label2.setMinWidth(250);
        label2.setMinHeight(30);
        label2.setFont(new Font("Arial",15));
        HBox hbox2 = new HBox();
        hbox2.setSpacing(15);
        hbox2.setPadding(new Insets(10, 50, 20, 20));
        hbox2.getChildren().addAll(label2,text2);
                                                                      
       Button Button1 = new Button("Merge Sort");
       Button Button2 = new Button("Bubble Sort");
       Button Button3 = new Button("Selection Sort");
       Button Button4 = new Button("Bucket Sort");
       
       
       Button button2 = new Button("Cancel");
       button2.setOnAction(new EventHandler<ActionEvent>() {
    	   public void handle(ActionEvent event) {
    		   System.exit(0);
    	   }
       });
       
       HBox hbox = new HBox(Button1, Button2 , Button3, Button4 , button2);
       hbox.setSpacing(20);
       hbox.setPadding(new Insets(10,50,50,100));
      
       VBox vbox = new VBox();
       vbox.setPadding(new Insets(20,50, 100, 50));
       vbox.getChildren().addAll(hbox1,hbox2,hbox);
       
       Button1.setOnAction(new EventHandler<ActionEvent>() {
    	   public void handle(ActionEvent event) {
    		   //tach mang
	    	   int n = Integer.valueOf(text1.getText());
	    	   String b = text2.getText();
		       int [] arr = new int [n];
		       SplitArray.split(n, b, arr);
	
		        //
		       Button[] button1 = new Button[n];
		       for(int i = 0; i<n; i++) {
		        	button1[i] = new Button(String.valueOf(arr[i]));
		        	button1[i].setMinHeight(30);
		        	button1[i].setMinWidth(50);
		       }
		        
		        
		       HBox hbox4 = new HBox();
		       hbox4.setSpacing(10);
		       hbox4.setPadding(new Insets(50, 50, 0, 50));
		       hbox4.setAlignment(Pos.CENTER);
		       for(int i = 0; i<n; i++)
		           hbox4.getChildren().add(button1[i]);	      
		       
		        
		       HBox hbox5 = new HBox();
		       hbox5.setPadding(new Insets(20, 50, 100, 50));
		       hbox5.setSpacing(10);
		       hbox5.setAlignment(Pos.CENTER);
		       MergeSort.sort(arr,0,n-1);
		       Button[] button2 = new Button[n];
		       for(int i = 0; i<n; i++) {
		    	   button2[i] = new Button(String.valueOf(arr[i]));
		    	   button2[i].setMinHeight(30);
		    	   button2[i].setMinWidth(50);
		    	   hbox5.getChildren().add(button2[i]);
		       }
		        
		       VBox vbox2 = new VBox();
		       vbox2.setSpacing(20);
		       vbox2.getChildren().addAll(hbox4,hbox5);  
		       vbox.getChildren().add(vbox2);     	  
    	   }
	   });
       Button2.setOnAction(new EventHandler<ActionEvent>() {
    	   public void handle(ActionEvent event) {
    		   //tach mang
	    	   int n = Integer.valueOf(text1.getText());
	    	   String b = text2.getText();
		       int [] arr = new int [n];
		       SplitArray.split(n, b, arr);
	
		        //
		       Button[] button1 = new Button[n];
		       for(int i = 0; i<n; i++) {
		        	button1[i] = new Button(String.valueOf(arr[i]));
		        	button1[i].setMinHeight(30);
		        	button1[i].setMinWidth(50);
		       }
		        
		        
		       HBox hbox4 = new HBox();
		       hbox4.setSpacing(10);
		       hbox4.setPadding(new Insets(50, 50, 0, 50));
		       hbox4.setAlignment(Pos.CENTER);
		       for(int i = 0; i<n; i++)
		           hbox4.getChildren().add(button1[i]);	      
		       
		        
		       HBox hbox5 = new HBox();
		       hbox5.setPadding(new Insets(20, 50, 100, 50));
		       hbox5.setSpacing(10);
		       hbox5.setAlignment(Pos.CENTER);
		       BubbleSort.sort(arr);
		       Button[] button2 = new Button[n];
		       for(int i = 0; i<n; i++) {
		    	   button2[i] = new Button(String.valueOf(arr[i]));
		    	   button2[i].setMinHeight(30);
		    	   button2[i].setMinWidth(50);
		    	   hbox5.getChildren().add(button2[i]);
		       }
		        
		       VBox vbox2 = new VBox();
		       vbox2.setSpacing(20);
		       vbox2.getChildren().addAll(hbox4,hbox5);  
		       vbox.getChildren().add(vbox2);     	  
    	   }
	   });
       
       Button3.setOnAction(new EventHandler<ActionEvent>() {
    	   public void handle(ActionEvent event) {
    		   //tach mang
	    	   int n = Integer.valueOf(text1.getText());
	    	   String b = text2.getText();
		       int [] arr = new int [n];
		       SplitArray.split(n, b, arr);
	
		        //
		       Button[] button1 = new Button[n];
		       for(int i = 0; i<n; i++) {
		        	button1[i] = new Button(String.valueOf(arr[i]));
		        	button1[i].setMinHeight(30);
		        	button1[i].setMinWidth(50);
		       }
		        
		        
		       HBox hbox4 = new HBox();
		       hbox4.setSpacing(10);
		       hbox4.setPadding(new Insets(50, 50, 0, 50));
		       hbox4.setAlignment(Pos.CENTER);
		       for(int i = 0; i<n; i++)
		           hbox4.getChildren().add(button1[i]);	      
		       
		        
		       HBox hbox5 = new HBox();
		       hbox5.setPadding(new Insets(20, 50, 100, 50));
		       hbox5.setSpacing(10);
		       hbox5.setAlignment(Pos.CENTER);
		       SelectionSort.sort(arr, n);
		       Button[] button2 = new Button[n];
		       for(int i = 0; i<n; i++) {
		    	   button2[i] = new Button(String.valueOf(arr[i]));
		    	   button2[i].setMinHeight(30);
		    	   button2[i].setMinWidth(50);
		    	   hbox5.getChildren().add(button2[i]);
		       }
		        
		       VBox vbox2 = new VBox();
		       vbox2.setSpacing(20);
		       vbox2.getChildren().addAll(hbox4,hbox5);  
		       vbox.getChildren().add(vbox2);     	  
    	   }
	   });
       
       //vbox.setMargin(button1,new Insets(10,10,10,200));
       Scene scene1 = new Scene(vbox,800,600);
       stage.setScene(scene1);
       stage.setTitle("Merge Sort ");
       stage.show();
       
	}

	public static void main(String args[]) {
		launch(args);
	}
}