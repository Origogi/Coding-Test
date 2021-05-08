package hackerrank.practice;

public class StrangerCounter {
    static long strangeCounter(long t) {


        long timerLength = 3;
        long startTimer = 3;
        long i = 0;

        while (timerLength < t) {
            startTimer = startTimer * 2;
            timerLength +=  startTimer;
        }

        timerLength -= startTimer;

        long remain = t - timerLength;

        return startTimer - remain + 1;
    }

}
