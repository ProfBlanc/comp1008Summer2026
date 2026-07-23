package wk11;

public interface GasPowered {

    double MIN_GAS_AMOUNT = 0;
    double MAX_GAS_AMOUNT = 60;

    boolean isRunningLow();
    boolean isEmpty();
    boolean isFull();

    boolean runningFast();

    void fillTank(double gasAmount);
}
