package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseBallNumber {
    private static int RANGE_START =1;
    private static int RANGE_END = 9;
    private static int numberSize = 3;
    private List<Integer> answer = new ArrayList<>();
    public BaseBallNumber(){
        initiate();
    }
    public int getNumberSize(){
        return numberSize;
    }
    public void initiate(){
        while(answer.size()<numberSize){
            int randomNumber = Randoms.pickNumberInRange(RANGE_START,RANGE_END);
            if(!answer.contains(randomNumber)){
                answer.add(randomNumber);
            }
        }
    }
    public List<Integer> getAnswer(){
        return answer;
    }
}
