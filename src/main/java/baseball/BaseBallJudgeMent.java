package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBallJudgeMent {
    private List<Integer> inputNumbers = new ArrayList<>();
    public BaseBallJudgeMent(){

    }

    public void getResult(BaseBallNumber baseBallNumber,String input){
        checkException(baseBallNumber.getNumberSize(),input);
        createInputNumber(input);
        calculate();
    }
    public void checkException(int numberSize, String input){
        checkInputSize(numberSize, input);
        checkNumberInRange(input);
        checkInputIsNumber(input);
    }
    public void calculate(){

    }

    private void createInputNumber(String input) {
        for(int i = 0; i< input.length(); i++){
            inputNumbers.add(input.charAt(i)-'0');
        }
    }

    private void checkInputIsNumber(String input) {
        try{
            Integer.parseInt(input);
        }
        catch(Exception e){
            throw new IllegalArgumentException(ErrorResource.START+ErrorResource.NOT_NUMBER);
        }
    }

    private void checkNumberInRange(String input) {
        for(int i = 0; i< input.length(); i++){
            if(input.charAt(i) =='0'){
                throw new IllegalArgumentException(ErrorResource.START+ErrorResource.NOT_IN_RANGE);
            }
        }
    }

    private void checkInputSize(int numberSize, String input) {
        if(input.length()!=numberSize){
            throw new IllegalArgumentException(ErrorResource.START+ErrorResource.NOT_SIZE);
        }
    }
}
