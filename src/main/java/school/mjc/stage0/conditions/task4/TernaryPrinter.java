package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        boolean moreOrNo = first > second;
        System.out.println(moreOrNo ? "first" : "second");
    }
}
