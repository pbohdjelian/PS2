package base;

public class c {
	public static void main (String[]args) {
	double[] myList = {1.2, 2.3, 4.2, 1.0, 5.5, 6.2};
	double sum = 0;
    for(int x=0; x < myList.length ; x++)
        sum += myList[x];
    double avg = sum / myList.length;
    System.out.println("average is "+ avg);

}
}

