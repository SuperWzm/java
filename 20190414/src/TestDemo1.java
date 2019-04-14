/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-04-14
 * Time: 9:04
 **/

class Sex{
    private String title;
    public static final int MALE_FLAG = 1;
    public static final int FEMALE_FLAG = 2;
   private static final Sex MALE = new Sex("男");
    private static final Sex FEMALE = new Sex("女");
    private Sex(String title){
        this.title = title;
    }
    public static Sex getInstance(int flag) {
        switch(flag){
            case MALE_FLAG:
                return MALE;
            case FEMALE_FLAG:
                return FEMALE;
            default:
                return null;
        }
    }
}


public  class TestDemo1{
    public static void main(String[] args) {
        Sex male = Sex.getInstance(Sex.MALE_FLAG);
        System.out.println(male);

    }
}
    