package com.example.stringtochars;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Text txt1;
    public Text txt2;
    public Button btn1;
    public AnchorPane rootPane;
    private String[] words;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        words = new String[]{"cat", "dog", "trampoline", "truck", "popular", "race", "rabbit", "pork", "lad"};
        Random random = new Random();
        pickWordArrayPosition(random);

        btn1.setOnAction(e -> {


            getAChar(random);

        });
    }

    private void getAChar(Random random) {
        int randNum = pickWordArrayPosition(random);
        String chosenWord = words[randNum];
        char[] guessArray = chosenWord.toCharArray();
        int guessChar = random.nextInt(guessArray.length);
        txt1.setText(String.valueOf(guessArray[guessChar]));
    }

    private int pickWordArrayPosition(Random random) {
        return random.nextInt(words.length);
    }

}
