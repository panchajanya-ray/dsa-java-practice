// LeetCode 1185. Day of the Week
// Pattern:Math
// Time Complexity: O(1)
// Space Complexity: O(1)

package math;

public class DayOfTheWeek {
	public String dayOfTheWeek(int day, int month, int year) {
        String [] days = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int [] monthDays = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

        int totalDays=0;

        for(int y = 1971; y<year; y++) totalDays += isLeap(y) ? 366: 365;
        
        for(int m=1; m<month; m++)
        {
            if(m==2) totalDays += isLeap(year)? 29: 28;
            else totalDays += monthDays[m-1];
        }

        totalDays+= day;

        return days[(totalDays + 4)%7]; // 4 = 1st January 1971 was Thursday = 4 index
    }

    public boolean isLeap(int year)
    {
        return (year%400 == 0) || (year%4==0 && year%100!=0);
    }
}
