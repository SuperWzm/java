/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-08-20
 * Time: 8:17
 **/
public class Emp {

    private String ename;
    private String job;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
    