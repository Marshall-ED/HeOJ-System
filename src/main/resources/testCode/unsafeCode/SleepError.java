
/**
 * @Author Marshall
 * @Date 2025/4/30 15:33
 * @Description: 无限睡眠（阻塞程序执行）
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60 * 60 * 100L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}
