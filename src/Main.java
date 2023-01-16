public class Main {
    public static void main(String[] args) {

        LandLine l1 = new LandLine("123");
        LandLine l2 = new LandLine("456");

        l1.power_on();
        l2.power_on();

        l1.call("456");
        l2.receive_call("456");
        System.out.println( l2.answer_call());
        System.out.println(l2.isRinging());
        l2.endCall();

        l1.power_off();
        l2.power_off();
    }
}