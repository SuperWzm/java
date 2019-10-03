package IO;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-10-03
 * Time: 15:09
 **/
public class ListFile {
    public static void main(String[] args) {
        File file = new File("E:\\WebProjects");
        if(!file.exists()){
            System.out.println("目录不存在");
            return ;
        }
        File[] list = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            if(list[i].isDirectory()){
                System.out.println("Directory:" + list[i].getName());
            }else {
                System.out.println("File:" + list[i].getName());
            }
        }
    }
}    
    