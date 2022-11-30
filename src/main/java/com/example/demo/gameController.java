package com.example.demo;

import com.example.demo.Player;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class gameController implements Initializable
{

    public Button button4;
    public Button button3;
    public Button button2;
    public Button button1;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Label playerLabel;
    public GridPane gamePane;
    Player player1;
    Player player2;
    Player currentPlayer;
    String marker;
    ArrayList<String> buttonLabels;

    public void buttonPressed(ActionEvent event)
    {
        Button button = (Button) event.getSource();
        if(button.getText().isEmpty()){
            this.marker = currentPlayer.getMarker();
            button.setText(this.marker);
            if (checkIfWin()){
                System.out.println("DU VANN!!!");
                playerLabel.setText("DU VANN!!!");
            }
            else{
                if(currentPlayer == player1){
                    currentPlayer = player2;
                }
                else if(currentPlayer == player2){
                    currentPlayer = player1;
                }
                playerLabel.setText(currentPlayer.getName());
            }


        }

    }

    private boolean checkIfWin()
    {
        String currentMarker;
        currentMarker = button1.getText();
        if (!currentMarker.isEmpty()){
            if(button2.getText().equals(currentMarker) && button3.getText().equals(currentMarker)){
                System.out.println("1");
                return true;
            }
            else if(button4.getText().equals(currentMarker) && button7.getText().equals(currentMarker)){
                System.out.println("2");
                return true;
            }
            else if(button5.getText().equals(currentMarker) && button9.getText().equals(currentMarker)){
                System.out.println("3");
                return true;
            }
        }
        currentMarker = button2.getText();
        if (!currentMarker.isEmpty()){
            if(button1.getText().equals(currentMarker) && button3.getText().equals(currentMarker)){
                System.out.println("1");
                return true;
            }
            else if(button5.getText().equals(currentMarker) && button8.getText().equals(currentMarker)){
                System.out.println("2");
                return true;
            }
        }
        currentMarker = button3.getText();
        if (!currentMarker.isEmpty()){
            if(button1.getText().equals(currentMarker) && button2.getText().equals(currentMarker)){
                System.out.println("1");
                return true;
            }
            else if(button6.getText().equals(currentMarker) && button9.getText().equals(currentMarker)){
                System.out.println("2");
                return true;
            }
            else if(button5.getText().equals(currentMarker) && button7.getText().equals(currentMarker)){
                System.out.println("3");
                return true;
            }
        }
        currentMarker = button4.getText();
        if (!currentMarker.isEmpty()){
            if(button5.getText().equals(currentMarker) && button6.getText().equals(currentMarker)){
                System.out.println("1");
                return true;
            }
            else {
                System.out.println("4");
                return false;
            }

        }
        currentMarker = button7.getText();
        if (!currentMarker.isEmpty()){
            if(button8.getText().equals(currentMarker) && button9.getText().equals(currentMarker)){
                System.out.println("1");
                return true;
            }
        }
        return false;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        this.player1 = new Player("X", "Player 1");
        this.player2 = new Player("O", "Player 2");
        this.currentPlayer = player1;
        playerLabel.setText(currentPlayer.getName());
        buttonLabels = new ArrayList<>();
        buttonLabels.add("button1");
        buttonLabels.add("button2");
        buttonLabels.add("button3");
        buttonLabels.add("button4");
        buttonLabels.add("button5");
        buttonLabels.add("button6");
        buttonLabels.add("button7");
        buttonLabels.add("button8");
        buttonLabels.add("button9");
    }
}
