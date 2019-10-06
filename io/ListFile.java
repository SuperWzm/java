package IO;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-03
 * Time: 15:09
 **/
public class ListFile {
    public static void main(String[] args) {
         showFile(new File("E:\\WebProjects"),1);
    }

    public static void showFile(File f,int leval){
        File[] files = f.listFiles();
        for(File file : files){
            //通过这个leval在前面加 -
            for (int i = 0; i < leval; i++) {
                System.out.print("- ");
            }
            System.out.println(file.getName());
            if(file.isDirectory()) {
                //向下继续进行遍历查看
                showFile(file, leval + 1);
            }
        }
    }
}    
    