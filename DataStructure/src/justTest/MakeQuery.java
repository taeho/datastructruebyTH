package justTest;

import java.util.List;

public class MakeQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tlist = "SELECT USE_FLAG,URL,SERVICE_CLASS,VERSION FROM SFRWK  WHERE PROCESS_ID = '$' AND METHOD = SERVICE_CLASS  AND HOUSE_CODE = '$'";		
		char[] chr = tlist.toCharArray();
		char[] chr2 = tlist.toCharArray();
		int tlen = tlist.length();
		int llen = 0;
//		
		String tpara1 = "SPU_006,100,";
		List tokenList;
		String[] tokens = null;
		
		for(int j=0; j < 10000000; j++){
			tokens = tpara1.split(",");	
		}
		for(int k=0; k< tokens.length; k++){
			System.out.println("tokensk = " + tokens[k]);
		}
//		
//		
//		System.out.println("St");
		int kasd =0;
//		char ttt;
//		for(int i=0 ; i< tlen; i++){
//			//System.out.println(String.valueOf(chr[i]));
//			if(String.valueOf(chr[i]).equals("$") ){
//				System.out.println(">> " + chr[i]);
//				ttt = tokens[kasd++];
//			} else {
//				ttt = chr[i];
//			}
//			chr2[llen++] = ttt;
//		}
		String ttest = "";
		System.out.println(" before = " +  ttest);
		for(int i=0 ; i< tlen; i++){
			
			if(String.valueOf(chr[i]).equals("$") ){
				ttest += tokens[kasd++];
			} else {
				ttest += chr[i];
			}
		}
		System.out.println(" after = " +  ttest);
		
//		System.out.println("ed");
//		
//		System.out.println("chr2 = " + chr2.length);
//		String fflist= "";
//		for(int kk=0; kk <chr2.length; kk++){
//			fflist += chr2[kk];
//		}
//		System.out.println("fflist = " +fflist);
		
//		int llen = 0;
//		char aa[] = null;
//		char tt;
//		
//		for(int i=0 ; i< tlen; i++){
//			tt = (char) tlist.indexOf(i);//        charAt(i);
//			aa[llen++] = tt;			
//			if(String.valueOf(tt) == "$"){
//				 System.out.println(">> " + tt);
//			 }			
//		}
//		System.out.println("llen++ =" + llen++);
		
//		String a1 = "SELECT USE_FLAG,URL,SERVICE_CLASS,VERSION FROM SFRWK  WHERE PROCESS_ID = '$' AND METHOD = SERVICE_CLASS  AND HOUSE_CODE = '$'";		
//		System.out.println("before => " +a1);
//		
//		System.out.println("after => " +a1);
//		
//		
		
	}

}
