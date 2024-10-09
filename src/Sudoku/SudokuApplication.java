package Sudoku;

import Sudoku.userinterface.IUserInterfaceContract;
import javafx.application.Application;
import Sudoku.userinterface.UserInterfaceImpl;
import javafx.stage.Stage;
import Sudoku.buildLogic.SudokuBuildLogic;

import java.io.IOException;


public class SudokuApplication extends  Application{
    private IUserInterfaceContract.View uiImpl;

    @Override
    public  void start (Stage primaryStage) throws IOException {
        //Get SudokuGame for a new Game
        uiImpl = new UserInterfaceImpl(primaryStage);

        try{
            SudokuBuildLogic.build(uiImpl);

        } catch (IOException e){
            e.printStackTrace();
            throw  e;
        }

    }

public static void main(String[] args) {
    launch(args);
}
}