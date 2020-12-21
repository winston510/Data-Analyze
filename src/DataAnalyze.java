import java.util.Arrays;
import java.util.Scanner;
public class DataAnalyze {
	public static void main(String[] args) {
	// ask for inputs and then create the table for the array
	Scanner input = new Scanner(System.in);
	
	String concur = "The trials concur with each other!";
	String notConcur = "The trials do NOT concur!";
	String match = "The trials match EXACTLY!";
	
	double min1;
	double min2;
	double min3;
	double min4;
	
	//total amount of the input values
	int i=0;
	double total1 = 0;
	double total2 = 0;
	double total3 = 0;
	double total4 = 0;
	
	//the average of every trial
	double average1 =0;
	double average2 =0;
	double average3 =0;
	double average4 =0;
	
	double sampleSize;
	double max = 0;
	double min = 0;
	
	//Beginning
	System.out.println("Please enter the sample size: ");
	sampleSize = input.nextDouble();
	
	//if sample size is zero. Do not run
	if(sampleSize == 0) {
		System.out.println("No data to analyze. Ending program.");
		System.exit(1);
	}
	
	double sampleCount [] = new double[(int) sampleSize];
	
	double trial1 [] = new double[(int) sampleSize];
	double trial2 [] = new double[(int) sampleSize];
	double trial3 [] = new double[(int) sampleSize];
	double trial4 [] = new double[(int) sampleSize];
	
	//trial 1
	System.out.println("Enter numbers for Trial 1");
	for(i=0; i < sampleSize; i++) {
		System.out.println("Enter sample #" + (i+1) + ": ");
		trial1[i] = input.nextInt();
		total1 += trial1[i];
	}
	average1 = (total1/sampleSize);
	
	//trial 2
	System.out.println("Enter numbers for Trial 2");
	for(i=0; i < sampleSize; i++) {
		System.out.println("Enter sample #" + (i+1) + ": ");
		trial2[i] = input.nextInt();
		total2 += trial2[i];	
	}
	average2 = (total2/sampleSize);
	
	//trial 3
	System.out.println("Enter numbers for Trial 3");
	for(i=0; i < sampleSize; i++) {
		System.out.println("Enter sample #" + (i+1) + ": ");
		trial3[i] = input.nextInt();
		total3 += trial3[i];		
	}
	average3 = (total3/sampleSize);
	
	//trial 4
	System.out.println("Enter numbers for Trial 4");
	for(i=0; i < sampleSize; i++) {
		System.out.println("Enter sample #" + (i+1) + ": ");
		trial4[i] = input.nextInt();
		total4 += trial4[i];		
	}
	
	//Sample number counter
	for(i = 0; i < sampleSize; i++) {
		sampleCount[i] = i + 1;
	}
	average4 = (total4/sampleSize);
	
	//Prints all the numbers
	System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
	for(i = 0; i < sampleSize; i++) {
		System.out.println("\t" + (int)sampleCount[i] + "\t" + "\t" + (int)trial1[i] + "\t" + (int)trial2[i] +"\t" +  (int)trial3[i] + "\t" + (int)trial4[i]);
	}
	System.out.println("\t-----------------------------------------------");
	
	//Prints average of each row
	System.out.println("Averages: " + "\t" + "\t" + average1 + "\t" + average2 + "\t" + average3 + "\t" + average4);
	
	//array for all the averages
	double [] allAverages = new double[4];
	allAverages[0] = average1;
	allAverages[1] = average2;
	allAverages[2] = average3;
	allAverages[3] = average4;
	
	//loop to see which average is the min
	for(i = 0; i < allAverages.length; i++) {
		if((average1 < allAverages[i])){
			min = average1;
		}
		if((average2 < allAverages[i]) && (average2 < average1)){
			min = average2;
		}
		if((average3 < allAverages[i]) && average3 < average2){
			min = average3;
		}
		if((average4 < allAverages[i]) && average4 < average3){
			min = average4;
		}
		if((average1 == allAverages[i]) && (average2 == allAverages[i]) && (average3 == allAverages[i]) && (average4 == allAverages[i])){
			min = ((average1 + average2 + average3 + average4)/4);
		}
	}
	System.out.println("Min Average: " + min);
	
	//loop to see which average is the max
	for(i = 0; i < allAverages.length; i++) {
		if((average1 > allAverages[i])){
			max = average1;
		}
		if((average2 > allAverages[i]) && (average2 > average1)){
			max = average2;
		}
		if((average3 > allAverages[i]) && (average3 > average2)){
			max = average3;
		}
		if((average4 > allAverages[i]) && (average4 > average3)){
			max = average4;
		}
		if((average1 == allAverages[i]) && (average2 == allAverages[i]) && (average3 == allAverages[i]) && (average4 == allAverages[i])) {
			max = ((average1 + average2 + average3 + average4)/4);
		}
	}
	System.out.println("Max Average: " + max);
	
	// final print line if statement
	if(max == min) {
		System.out.println(match);
	}
	else if(max < (min * 2)) {
		System.out.println(concur);
	}
	else {
		System.out.println(notConcur);
	}
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	//Testing (prints out the arrays)
	//System.out.println(Arrays.toString(trial1));
	

	}
}
