package ReflectionTesting;

//import

public class FullReflection {
    public static void main(String[] args) {
        FTPGetter ftp = null;
        try {
            ftp = new FTPGetter("192.168.0.x", "ftpuser", "alpine");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ftp.downloadFile("exampleAuton-shippable.json", "findme");



    }
}
