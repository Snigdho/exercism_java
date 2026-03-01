// https://exercism.org/tracks/java/exercises/bird-watcher

import java.util.Arrays;

class BirdWatcher {

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.birdsPerDay).anyMatch(i -> i == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int arrayIterationLimit = numberOfDays <= 7 ? numberOfDays : 7;
        for (int i = 0; i < arrayIterationLimit; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int eachDayCount : this.birdsPerDay) {
            if (eachDayCount >= 5) busyDaysCount++;
        }
        return busyDaysCount;
    }
}
