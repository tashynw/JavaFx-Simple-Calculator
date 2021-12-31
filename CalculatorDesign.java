package com.example.calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.math.BigDecimal;
import com.udojava.evalex.Expression;


public class CalculatorDesign {
    @FXML
    private TextField resultBox;

    public void button0(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("0");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="0");
        }
    }

    public void button1(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("1");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="1");
        }
    }

    public void button2(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("2");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="2");
        }
    }

    public void button3(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("3");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="3");
        }
    }

    public void button4(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("4");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="4");
        }
    }

    public void button5(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("5");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="5");
        }
    }

    public void button6(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("6");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="6");
        }
    }

    public void button7(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("7");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="7");
        }
    }

    public void button8(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("8");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="8");
        }
    }

    public void button9(ActionEvent event){
        if (resultBox.getCharacters().isEmpty()){
            resultBox.setText("9");
        }
        else{
            String content = resultBox.getText();
            resultBox.setText(content+="9");
        }
    }

    public void addButton(ActionEvent event){
        //Prevent user typing in ++ twice!!
        if (!(resultBox.getCharacters().isEmpty())){
            String content = resultBox.getText();
            resultBox.setText(content+="+");
        }
    }

    public void minusButton(ActionEvent event){
        //Prevent user typing in ++ twice!!
        if (!(resultBox.getCharacters().isEmpty())){
            String content = resultBox.getText();
            resultBox.setText(content+="-");
        }
    }

    public void multiplyButton(ActionEvent event){
        //Prevent user typing in ++ twice!!
        if (!(resultBox.getCharacters().isEmpty())){
            String content = resultBox.getText();
            resultBox.setText(content+="*");
        }
    }

    public void divideButton(ActionEvent event){
        //Prevent user typing in ++ twice!!
        if (!(resultBox.getCharacters().isEmpty())){
            String content = resultBox.getText();
            resultBox.setText(content+="/");
        }
    }

    public void computeButton(ActionEvent event){
        if (!(resultBox.getCharacters().isEmpty())) {
            try {
                BigDecimal result=null;
                Expression expression=new Expression(resultBox.getText());
                // Lowering the precision.
                expression.setPrecision(13);
                result=expression.eval();
                String resultText = result.toPlainString();
                resultBox.clear();
                resultBox.setText(resultText);
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic expression false!");
            }
            catch(Exception e){
                System.out.println("Error!");
            }
        }
    }

    public void clearScreen(ActionEvent event){
        if(!(resultBox.getCharacters().isEmpty())) {
            try {
                resultBox.clear();

            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public void leftBracket(ActionEvent event){

        String content = resultBox.getText();
        resultBox.setText(content+="(");

    }

    public void rightBracket(ActionEvent event){

        String content = resultBox.getText();
        resultBox.setText(content+=")");

    }

    public void backSpace(ActionEvent event){
        if (!(resultBox.getCharacters().isEmpty())){
            String content = resultBox.getText();
            resultBox.setText(content.substring(0,content.length()-1));
        }
    }
}
