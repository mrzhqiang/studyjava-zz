import com.github.mrzhqiang.example1.IpSearch;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // 16.1.4 范例1：获得内网的所有IP地址（ping得通）
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 12; i++) {
            int startIp = (i - 1) * 25;
            int endIp = i * 25;
            if (endIp >= 256) {
                endIp = 255;
            }
            IpSearch ipSearch = new IpSearch(startIp, endIp);
            ipSearch.start();
            ipSearch.setStartTime(startTime);
        }

        Thread.sleep(50000);
        System.out.println("主线程结束");
    }
}
