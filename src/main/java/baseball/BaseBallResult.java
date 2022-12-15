package baseball;

public class BaseBallResult {
    private static int STANDARD_SUCCESS_NUMBER =3;
    private int strike;
    private int ball;
    public BaseBallResult(){
        strike =0;
        ball =0;
    }
    public int getBall(){
        return ball;
    }
    public int getStrike(){
        return strike;
    }
    public boolean isSuccess(){
        if(strike ==STANDARD_SUCCESS_NUMBER){
            return true;
        }
        return false;
    }
}
