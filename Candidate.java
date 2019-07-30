import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-07-30
 * Time: 22:10
 **/
class Testcandidate{
     String name;
    private int voteNumber;

    Testcandidate(String s){
        this.name = s;
        this.voteNumber = 0;
    }
    void vote(){
        this.voteNumber++;
    }
}
public class Candidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order;
        String temp;
        Testcandidate candidate[] = new Testcandidate[10];
        int i = 0;
        int wx = 0;
        do {
            order = scanner.nextLine();
            if (order.startsWith("addCandidate")) {
                temp = order.substring("addCandidate".length()).trim();
                if (temp.length() != 0)
                    candidate[i++] = new Testcandidate(temp);
            } else if (order.startsWith("vote")) {
                temp = order.substring("vote".length()).trim();
                try {
                    for (int j = 0; j < candidate.length; j++) {
                        if (candidate[j].name.equals(temp)) {
                            candidate[j].vote();
                            break;
                        }
                    }
                } catch (NullPointerException e) {
                    wx++;
                }
            } else if (order.equals("getVoteResult")) {
                for (int j = 0; j < candidate.length; j++) {
                    if (candidate[j] == null) {
                        System.out.println(wx);
                        System.exit(0);
                    } else {
                        System.out.println(candidate[j].name + " " + candidate[j]);
                    }
                }
            }
        }while (true);
    }
}
    