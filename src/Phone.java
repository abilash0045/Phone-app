public interface Phone {
    void power_on();
    void call(String ph_no);
    void receive_call(String ph_no);
    boolean answer_call();
    boolean isRinging();
    boolean endCall();
    void power_off();
}
