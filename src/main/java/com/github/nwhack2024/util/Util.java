package com.github.nwhack2024.util;

import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Util {

    public static int getStage(String s){
        if(Objects.equals(s, "Seedling")) return 1;
        if(Objects.equals(s, "Germination")) return 2;
        return 0;
    }

    public static int getLife(int progress, Date date){
        Date currentDate = new Date();
        long diffInMilliseconds = currentDate.getTime() - date.getTime();
        long diffInDays = TimeUnit.DAYS.convert(diffInMilliseconds, TimeUnit.MILLISECONDS);
        return (int) diffInDays;
    }
    public static int getProgress(int progress, Date date){

        long diffInDays = getLife(progress,date);

        if (diffInDays == 0) {
            return 0;
        }

        int progressPerDay = (int) (diffInDays/progress*100);

        if(progressPerDay>100) return 100;
        return progressPerDay;
    }
}
