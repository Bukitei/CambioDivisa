package dad.javafx.cambiodivisa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class badgeChange extends Application {

	private TextField firstn, result;
	private ComboBox<String> firstb, secondb;
	private Button change;
	private Divisa euro = new Divisa("Euro", 1.00);
	private Divisa libra = new Divisa("Libra", 0.89);
	private Divisa dolar = new Divisa("Dolar", 1.09);
	private Divisa yen = new Divisa("Yen", 1183.59);
	private Divisa origin;
	private Divisa destiny;

	@Override
	public void start(Stage primaryStage) throws Exception {

		firstn = new TextField();
		result = new TextField();
		firstb = new ComboBox<String>();
		secondb = new ComboBox<String>();
		change = new Button();

		HBox firstf = new HBox(5, firstn, firstb);
		HBox secondf = new HBox(5, result, secondb);
		HBox thirdf = new HBox(5, change);

		VBox root = new VBox(5, firstf, secondf, thirdf);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);

		firstn.setPrefColumnCount(4);
		result.setPrefColumnCount(4);
		result.setEditable(false);
		
		firstb.getItems().addAll("Euro", "Dolar", "Libra", "Yen");
		firstb.getSelectionModel().selectFirst();
		secondb.getItems().addAll("Euro", "Dolar", "Libra", "Yen");
		secondb.getSelectionModel().select(3);

		change.setText("Cambiar");
		change.setDefaultButton(true);
		change.setOnAction(a -> OnChangeBadge(a));

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Calculo Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

	public void OnChangeBadge(ActionEvent a) {
		
		try {
			switch(secondb.getSelectionModel().getSelectedItem()) {
			case "Euro":
				toEuro(firstb.getSelectionModel().getSelectedItem(), Double.valueOf((firstn.getText())));
				break;
				
			case "Dolar":
				toDolar(firstb.getSelectionModel().getSelectedItem(), Double.valueOf((firstn.getText())));
				break;
			
			case "Libra":
				toLibra(firstb.getSelectionModel().getSelectedItem(), Double.valueOf((firstn.getText())));
				break;
			
			case "Yen":
				toYen(firstb.getSelectionModel().getSelectedItem(), Double.valueOf((firstn.getText())));
				break;
			}
		}catch(NumberFormatException e){
			Alert alert = new Alert(AlertType.ERROR);
			 
			alert.setTitle("Error");
			alert.setHeaderText("Number Exception");
			alert.setContentText("You can't put in any character that is not a number!");
			 
			alert.showAndWait();
		}
		
	}

	public void toEuro(String firstb, double cuantity) {

		destiny = euro;

		switch (firstb) {
		case "Euro":
			origin = euro;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Dolar":
			origin = dolar;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Libra":
			origin = libra;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Yen":
			origin = yen;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		}

	}

	public void toDolar(String firstb, double cuantity) {

		destiny = dolar;

		switch (firstb) {
		case "Euro":
			origin = euro;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Dolar":
			origin = dolar;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Libra":
			origin = libra;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Yen":
			origin = yen;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		}

	}

	public void toLibra(String firstb, double cuantity) {

		destiny = libra;

		switch (firstb) {
		case "Euro":
			origin = euro;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Dolar":
			origin = dolar;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Libra":
			origin = libra;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Yen":
			origin = yen;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		}

	}

	public void toYen(String firstb, double cuantity) {

		destiny = yen;

		switch (firstb) {
		case "Euro":
			origin = euro;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Dolar":
			origin = dolar;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Libra":
			origin = libra;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		case "Yen":
			origin = yen;
			result.setText(String.valueOf(destiny.fromEuro(origin.toEuro(cuantity))));
			break;
		}

	}

}
