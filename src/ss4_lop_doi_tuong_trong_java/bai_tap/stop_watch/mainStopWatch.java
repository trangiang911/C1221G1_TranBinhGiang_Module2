package ss4_lop_doi_tuong_trong_java.bai_tap.stop_watch;

import java.util.Date;

public class mainStopWatch {
    long date;
    long start;
    long end;

    public mainStopWatch() {
        this.date = new Date().getTime();
    }

    public void start() {

        start = new Date().getTime();
    }

    public void end() {

        end = new Date().getTime();
    }

    public long getElapsedTime() {
        return end - start;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public static void main(String[] args) {
        mainStopWatch stopWatch = new mainStopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStart());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.print(".");
            }
        }
        stopWatch.end();
        System.out.println("\n" + stopWatch.getEnd());
        System.out.println(stopWatch.getElapsedTime());
    }
}
