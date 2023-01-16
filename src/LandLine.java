import java.sql.SQLOutput;

public class LandLine implements Phone{

    private String ph_NO;
    private boolean powerOn;
    private boolean isRinging;

    LandLine(String ph_NO){
        this.ph_NO = ph_NO;
        powerOn = false;
        isRinging = false;
    }

    @Override
    public void power_on() {
        powerOn = true;
    }

    @Override
    public void call(String ph_no) {
        if (powerOn){
            System.out.println("Calling this no: " + ph_no + " form " + this.ph_NO);
        }
    }

    @Override
    public void receive_call(String ph_NO) {
        if (ph_NO.equals(this.ph_NO)){
            isRinging = true;
            answer_call();
        }
    }

    @Override
    public boolean answer_call() {
        if (powerOn && isRinging)
            return true;
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public String getPh_NO() {
        return ph_NO;
    }

    public void setPh_NO(String ph_NO) {
        this.ph_NO = ph_NO;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public boolean endCall() {
        System.out.println("Call ended");
        isRinging = false;
        return true;
    }

    @Override
    public void power_off() {
        this.powerOn = false;
    }
}
