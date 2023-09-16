import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.FileInputStream;

/**
 *  This program illustrates the user-friendly view of the model named Parrot by using GUI
 *  components such as 'text-field', 'Button', and 'Label'. It provides a menu interface to
 *  the user to select a parrot and "feed" it or "hit" it. It also tracks and displays the
 *  amount of cracker crumbs, healths and the status of parrot.
 *
 * @author Nisarg Nayak
 */
public class ParrotCraft extends Application {

    // TODO: Instance Variables for View Components and Model

    /** The textfield for entering the amount of crumbs **/
    private TextField crumbsField;

    /** The button to press in order to feed the parrot **/
    private Button feedButton;

    /** The button to press in order to hit the parrot **/
    private Button hitButton;

    /** The button to press in order to start the game **/
    Button startButton;

    /** The button to press in order to quit the game **/
    Button quitButton;

    /** The label that displays the details of parrot **/
    private Label output;

    /** The textfield to select a parrot from menu **/
    private TextField selection;

    /** The first parrot to play with **/
    private Parrot parrot1;

    /** The second parrot to play with **/
    private Parrot parrot2;

    /** The third parrot to play with **/
    private Parrot parrot3;

    /** To view the image **/
    ImageView imageView;

    /** reading streams of data for image1 **/
    FileInputStream inputStream;

    /** reading streams of data for image2 **/
    FileInputStream inputStream2;

    /**  load image1 from given URL **/
    Image displayImage;

    /** load image2 from given URL **/
    Image displayImage2;

    /** the label for exit statement  **/
    Label exitLabel;



    // TODO: Private Event Handlers and Helper Methods

    /**
     * feed action for parrot1
     * @param event access the feed event
     */
    public void feedAction1(ActionEvent event) {
        double crumbs = Double.parseDouble(crumbsField.getText());
        parrot1.feed(crumbs);
        output.setText(parrot1.toString());
    }
    /**
     * feed action for parrot2
     * @param event access the feed event
     */
    public void feedAction2(ActionEvent event) {
        double crumbs = Double.parseDouble(crumbsField.getText());
        parrot2.feed(crumbs);
        output.setText(parrot2.toString());
    }

    /**
     * feed action for parrot3
     * @param event access the feed event
     */
    public void feedAction3(ActionEvent event) {
        double crumbs = Double.parseDouble(crumbsField.getText());
        parrot3.feed(crumbs);
        output.setText(parrot3.toString());
    }

    /**
     * hit action for parrot1
     * @param event access the hit event
     */
    public void hitAction1(ActionEvent event) {
        parrot1.hit();
        output.setText(parrot1.toString());
    }

    /**
     * hit action for parrot2
     * @param event access the hit event
     */
    public void hitAction2(ActionEvent event) {
        parrot2.hit();
        output.setText(parrot2.toString());
    }

    /**
     * hit action for parrot3
     * @param event access the hit event
     */
    public void hitAction3(ActionEvent event) {
        parrot3.hit();
        output.setText(parrot3.toString());
    }

    /**
     * quit action to exit the game
     * @param event access the quit event
     */
    public void quitAction(ActionEvent event) {

        output.setText("You exit! Thanks for playing");
        imageView.setImage(displayImage2);
        exitLabel.setText("BYE! BYE!");
        exitLabel.setStyle("-fx-text-fill: red");
    }

    /**
     * to get started of the game
     * @param event access to the starting of game
     */
    public void getStarted(ActionEvent event) {

        double option = Integer.parseInt(selection.getText());

        imageView.setImage(displayImage);   // show image when game starts

        if (option == 1) {
            output.setText(parrot1.toString());
            feedButton.setOnAction(this::feedAction1);  // feedAction triggers when feed button is pressed for parrot1
            hitButton.setOnAction(this::hitAction1);    // hitAction triggers when hit button is pressed for parrot1
        } else if (option == 2) {
            output.setText(parrot2.toString());
            feedButton.setOnAction(this::feedAction2);  // feedAction triggers when feed button is pressed for parrot2;
            hitButton.setOnAction(this::hitAction2);    // hitAction triggers when hit button is pressed for parrot2;
        } else if (option == 3) {
            output.setText(parrot3.toString());
            feedButton.setOnAction(this::feedAction3);  // feedAction triggers when feed button is pressed for parrot3;
            hitButton.setOnAction(this::hitAction3);    // hitAction triggers when hit button is pressed for parrot3;
        }
}

    /**
     * This is where you create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 600, 600); // set the size here
        stage.setTitle("Play with Parrots"); // set the window title here
        stage.setScene(scene);
        // TODO: Add your GUI-building code here

        // 1. Create the model

        parrot1 = new Parrot("Julia", 3, 3.5);
        parrot2 = new Parrot("Nancy", 3, 2.5);
        parrot3 = new Parrot("Jennifer", 3, 2);


        // 2. Create the GUI components

        crumbsField = new TextField("0.00");
        output = new Label("Parrot details will be shown here...");
        Label display = new Label("How much crumbs do you want to feed?");
        feedButton = new Button("Feed");
        hitButton = new Button("Hit");
        Label choice = new Label("Choose a Parrot to start a game");
        selection = new TextField();
        Label parrotNumber1 = new Label("1). Parrot1: Julia");
        Label parrotNumber2 = new Label("2). Parrot2: Nancy");
        Label parrotNumber3 = new Label("3). Parrot3: Jennifer");
        startButton = new Button("Start");
        quitButton = new Button("Quit");
        inputStream = new FileInputStream("src//welcomeparrot.jpg");
        inputStream2 = new FileInputStream("src/parrotwavingbyy.jpg");
        displayImage = new Image(inputStream);
        displayImage2 = new Image(inputStream2);
        imageView = new ImageView();
        exitLabel = new Label();




        // 3. Add components to the root

        root.getChildren().addAll(crumbsField, output, display, feedButton, quitButton,hitButton,selection,
                                  startButton, choice, parrotNumber1, parrotNumber2, parrotNumber3,imageView,exitLabel);


        // 4. Configure the components (colors, fonts, size, location)

        parrotNumber1.relocate(10, 10);
        parrotNumber1.setFont(new Font("System", 15));
        parrotNumber1.setStyle("-fx-text-fill:green");
        parrotNumber2.relocate(10, 30);
        parrotNumber2.setFont(new Font("System", 15));
        parrotNumber2.setStyle("-fx-text-fill:green");
        parrotNumber3.relocate(10, 50);
        parrotNumber3.setFont(new Font("System", 15));
        parrotNumber3.setStyle("-fx-text-fill:green");
        choice.relocate(10, 70);
        choice.setStyle("-fx-text-fill:blue");
        startButton.relocate(10,120);
        selection.relocate(10, 90);
        crumbsField.relocate(10, 180);
        display.relocate(10, 150);
        display.setStyle("-fx-text-fill:blue");
        display.setFont(new Font("System", 15));
        feedButton.relocate(10, 210);
        hitButton.relocate(60, 210);
        quitButton.relocate(110,210);
        output.relocate(10, 370);
        output.setFont(new Font("System", 20));
        output.setStyle("-fx-text-fill:red");
        imageView.relocate(370,200);
        exitLabel.relocate(370,320);



        // 5. Add Event Handlers and do final setup

        startButton.setOnAction(this::getStarted);  // trigger the getStarted method
        quitButton.setOnAction(this::quitAction);   // trigger the quitAction method



        // 6. Show the stage

        stage.show();

    }

    /**
     * Make no changes here.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
