import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-29
 * Time: 13:32
 **/
public class GradePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        int total_course ;
        int i,j,k;
        int[] course_GPA = new int[10];
        int[] course_Grades = new int[10];
        while(scanner.hasNext()){
            int total_GPA = 0;
            float sum = 0;
            total_course = scanner.nextInt();
            for ( i = 0; i < total_course; i++) {
                course_GPA[i] = scanner.nextInt();
                total_GPA += course_GPA[i];
            }
            for ( j = 0; j < total_course; j++) {
                course_Grades[j] = scanner.nextInt();
            }
            for ( k = 0; k < total_course; k++) {
                if(course_Grades[k] >= 90){
                    sum += 4.0*course_GPA[k];
                }
                if(course_Grades[k] >= 85 && course_Grades[k] <= 89){
                    sum += 3.7*course_GPA[k];
                }
                if(course_Grades[k] >= 82 && course_Grades[k] <= 84){
                    sum += 3.3*course_GPA[k];
                }
                if(course_Grades[k] >= 78 && course_Grades[k] <= 81){
                    sum += 3.0*course_GPA[k];
                }
                if(course_Grades[k] >= 75 && course_Grades[k] <= 77){
                    sum += 2.7*course_GPA[k];
                }
                if(course_Grades[k] >= 72 && course_Grades[k] <= 74){
                    sum += 2.3*course_GPA[k];
                }
                if(course_Grades[k] >= 68 && course_Grades[k]<= 71){
                    sum += 2.0*course_GPA[k];
                }
                if(course_Grades[k] >= 64 && course_Grades[k] <= 67){
                    sum += 1.5*course_GPA[k];
                }
                if(course_Grades[k] >= 60 && course_Grades[k] <= 63){
                    sum += 1.0*course_GPA[k];
                }
                if(course_Grades[k] < 60){
                    sum += 0.0*course_GPA[k];
                }
            }
            //System.out.println("总绩点" +sum+"总学分"+total_GPA);
            System.out.println(decimalFormat.format(sum/total_GPA));
            //System.out.println("\n");
        }
    }
}    
    