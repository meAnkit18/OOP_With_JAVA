package pack;

public class DateDiffernce {
	public static void main(String[] args) {
		 int birth_day = 28;
	        int birth_month = 1;
	        int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	        int current_day = 11;
	        int current_month = 8;
	        int days = months[current_month-1] - current_day;
	        if (birth_day > current_day && birth_month == current_month){
	            days = birth_day - current_day;
	        }
	        else if((birth_month < current_month) || ((birth_day < current_day) && (birth_month == current_month)) ){
	            for (int i=current_month; i<12;i++){
	                days+=months[i];
	            }
	            for(int i=0 ; i < birth_month-1; i++){
	                days += months[i];
	            }
	            days+=birth_day;
	        }
	        else {
	            for(int i = current_month; i < birth_month-1; i++){
	                days+=months[i];
	            }
	            days+=birth_day;
	        }
	        System.out.println(days);


	}
}
