package IO;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-03
 * Time: 15:20
 **/
public class GetImage {
    public static void main(String[] args) {
        String url = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
        String url2 = "https://www.baidu.com/s?wd=%e6%96%b0%e4%b8%ad%e5%9b%bd%e6%88%90%e7%ab%8b70%e5%91%a8%e5%b9%b4&sa=ire_dl_gh_logo&rsv_dl=igh_logo_pc";

        byte[] btImg = getImageFromNetByUrl(url);
        if( null != btImg && btImg.length>0){
            System.out.println("读取到：" + btImg.length + "字节");
            String fileName = "百度.jpg";
            writeImageToDisk(btImg, fileName);

        }else{
            System.out.println("没有从连接获取到内容");
        }
    }

    //将图片写入磁盘
    private static void writeImageToDisk(byte[] btImg, String fileName) {
        File file = new File("E:\\" + fileName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(btImg);
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("图片已经写入E盘");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //根据url获取图片字节流
    private static byte[] getImageFromNetByUrl(String strurl) {
        try {
            URL url = new URL(strurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5*1000);
            InputStream inStream = conn.getInputStream();//通过输入流获取图片数据
            byte[] btImg = readInputStream(inStream);//得到图片的二进制数据
            return btImg;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //从输入流中获取数据
    private static byte[] readInputStream(InputStream inStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1){
            outputStream.write(buffer,0,len);
        }
        inStream.close();
        return outputStream.toByteArray();
    }
}    
    