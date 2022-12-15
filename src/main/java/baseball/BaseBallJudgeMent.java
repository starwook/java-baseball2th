package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBallJudgeMent {
    private List<Integer> inputNumbers = new ArrayList<>();
    public BaseBallJudgeMent(){

    }
    public void checkException(BaseBallNumber baseBallNumber, String input){
        checkInputSize(baseBallNumber, input);
        checkNumberInRange(input);
        checkInputIsNumber(input);
        for(int i=0;i<input.length();i++){
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

    private void checkInputSize(BaseBallNumber baseBallNumber, String input) {
        if(input.length()!=baseBallNumber.getNumberSize()){
            throw new IllegalArgumentException(ErrorResource.START+ErrorResource.NOT_SIZE);
        }
    }
}
