package in.com.oop;

public class Logic_All {
	public static void sum(int a,int b) {
		int c=a+b;
		System.out.println("sum="+c);
		}
    public void ArmStrong(int number) {
    	int a=153,r=0,b=a,sum=0;
		while(b>0) {
			r=b%10;
			sum=sum+(r*r*r);
			b=b/10;
		}
	   if(a==sum) {
		   System.out.println(a +"  it is arm strong number");
	   }
	   else {
		   System.out.println(a +"  it is not arm strong number");
	   }
    }
      public void secondLargest(int[] arr) {
    	    
    	    int min=0;
    	    int max=0;
    	    
    	    for(int i=0;i<arr.length;i++) {
    	    	if(arr[i]>max) {
    	    		min=max;
    	    		max=arr[i];
    	    	}
    	    	
    	    	if(min<arr[i]&&max>arr[i]) {
    	    		min=arr[i];
    	    	}
    	    }
    	    System.out.print("Second largest="+ min);
    	}
       
        public void noteCount(int amount) {
        	int number=5555;
    		int count=0;
    		int[] notes= {2000,500,200,100,50,20,10,5,2,1};
    		
    		for(int i=0;i<notes.length;i++) {
    			count=number/notes[i];
    			number=number%notes[i];
    			
    			if(count>0) {
    				System.out.println(notes[i]+"="+count);
    			}
    		}
    	}
        }


   