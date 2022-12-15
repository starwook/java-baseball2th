package baseball;

public class BaseBallResult {
    private int successNumber;
    private int strike;
    private int ball;
    public BaseBallResult(int strike,int ball,int successNumber){
        this.strike = strike;
        this.ball = ball;
        this.successNumber = successNumber;
    }
    public int getBall(){
        return ball;
    }
    public int getStrike(){
        return strike;
    }
    public boolean isSuccess(){
        if(strike ==successNumber){
            return true;
        }
        return false;
    }
    public boolean nothingMatch(){
        if(strike ==0&& ball ==0){
            return true;
        }
        return false;
    }
}
