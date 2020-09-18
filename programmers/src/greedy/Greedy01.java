package greedy;
//https://programmers.co.kr/learn/courses/30/lessons/42862
public class Greedy01 {
	  public int solution(int n, int[] lost, int[] reserve) {

	      int  answer=0;
	         answer= n-lost.length;
	        
	                for(int i=0; i< lost.length; i++) {
	            for(int j=0; j< reserve.length; j++) {

	                if(lost[i] == reserve[j]) {
	                    lost[i] = -1;
	                    reserve[j] = -1;
	                   answer++;
	                    break;
	                }
	            }
	        }
	        
	        
	     for(int i=0; i<lost.length;i++)
	     {
	    	 for(int q=0; q<reserve.length;q++)
	    	 {          
	    if(lost[i]-reserve[q]==1 || lost[i]-reserve[q]==-1)
	    	 {
	             reserve[q]=-1;
	    		answer++;
	    		 
	    		 break;
	    	 }
	            
	    	 }
	     }
	    	
	    	
	        
	        return answer;
	    }
}
