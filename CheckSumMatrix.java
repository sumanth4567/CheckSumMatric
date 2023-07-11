import java.util.*;
class CheckSumMatrix {
	public static void main (String[] args) {
		//code
		int i,j,n,m,t;
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of test cases:");
		t=sc.nextInt();
		for(i=0;i<t;i++){
		    boolean isTrue=true;
            System.out.println("enter the rows and columns:");
		    n=sc.nextInt();
		    m=sc.nextInt();
		    int arr[][]=new int[n][m];
		    System.out.println("enter into array:");
		    for(i=0;i<n;i++){
		        for(j=0;j<m;j++){
		            arr[i][j]=sc.nextInt();
		        }
		    }
            //if given no of rows are even
		    if(n%2==0){
		        for( i=0;i<n/2;i++){
		            int sum1=0,sum2=0;
		            for(j=0;j<m;j++){
		                sum1+=arr[i][j];
		                sum2+=arr[n-i-1][j];
		            }
		            if(sum1==sum2){
		                isTrue=true;
		            }
		            else{
		                isTrue=false;
		                break;
		            }
		        }
		    }
            //if no of given rows are odd
		    else{
		        for( i=0;i<n/2;i++){
                    //ignoring the i value for n/2 case
		            if(i!=n/2){
		                int sum1=0,sum2=0;
		                for(j=0;j<m;j++){
		                    sum1+=arr[i][j];
		                    sum2+=arr[n-i-1][j];
		                }
		                if(sum1==sum2){
		                    isTrue=true;
		                }
		                else{
		                    isTrue=false;
		                    break;
		                }
		            }
		        }
		    }
		    if(isTrue){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
