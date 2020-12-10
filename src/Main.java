import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.petproject.javafx.phonesbook.controllers.MainController;
import ru.petproject.javafx.phonesbook.interfaces.impls.CollectionAddressBook;

import java.util.Locale;
import java.util.ResourceBundle;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("ru/petproject/javafx/phonesbook/forms/mainwindow.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("ru/petproject/javafx/phonesbook/bundles/Locale", new Locale("en")));


        //Parent root = FXMLLoader.load(getClass().getResource("ru/petproject/javafx/phonesbook/forms/mainwindow.fxml"));
        Parent fxmlMain = fxmlLoader.load();
        MainController mainController = fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle(fxmlLoader.getResources().getString("address_book"));
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(fxmlMain, 300, 275));
        primaryStage.show();

        testData();
    }

    private void testData(){

        CollectionAddressBook addressBook = new CollectionAddressBook();
        addressBook.fillTestData();
        addressBook.print();
    }
    public static void main(String[] args) {
        launch(args);
    }
}