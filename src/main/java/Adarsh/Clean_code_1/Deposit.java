package Adarsh.Clean_code_1;

public class Deposit implements SimpleInterest, CompoundInterest {
    private Double principleAmount;
    private Integer timeInterval;
    private Double rateOfInterest;
    Deposit(Double principleAmount, Integer timeInterval, Double rateOfInterest){
        this.principleAmount = principleAmount;
        this.timeInterval = timeInterval;
        this.rateOfInterest = rateOfInterest;
    }
    public Double compoundInterest() {
        return principleAmount * Math.pow(( 1 + rateOfInterest/100 ), timeInterval );
    }
    public Double simpleInterest() {
        return (principleAmount * timeInterval * rateOfInterest)/100;
    }
}