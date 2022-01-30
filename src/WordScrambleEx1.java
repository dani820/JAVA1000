public class WordScrambleEx1 {
 public static void main(String[] args) { 
     String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

     String answer = getAnswer(strArr); 
     String question = getScrambledWord(answer); 

     System.out.println("Question:"+question); 
     System.out.println("Answer:"+answer); 
   } // main 

   public static String getAnswer(String[] strArr) { 
	   int index = (int)(Math.random() * strArr.length) + 1;
	   String answer = strArr[index - 1];
	   System.out.println("answer : " + answer); // for check
	   
	   return answer;
   } 
   
   public static String getScrambledWord(String str) {
	   String question = "";
	   int[] newWordIndexList = new int[str.length()] ; // 문자열 인덱스 값을 넣을 리스트
	   
	   System.out.println("str.length() : " + str.length()); // for check
	   
	   // 문자열 인덱스 랜덤 추출
	   for(int i = 0; i < str.length(); i++) {
		   newWordIndexList[i] = (int)(Math.random() * str.length()) + 1; 
		   System.out.println("newWordIndexList[" + i + "] : " + newWordIndexList[i]);
		   
		   // 인덱스 중복 제거
		   for(int j = 0; j <= i-1; j++) {
			   if(newWordIndexList[i] == newWordIndexList[j]) {
				   System.out.println("newWordIndexList[" + i + "] : " + newWordIndexList[i] + " == newWordIndexList[" + j + "] : " + newWordIndexList[j]);
				   newWordIndexList[i] = (int)(Math.random() * str.length()) + 1; // 문자열 인덱스 다시 랜덤 추출
				   System.out.println("newWordIndexList[" + i + "] : " + newWordIndexList[i]);
			   }
		   }
	   }
	   
	   // 문자열 인덱스 길이만큼 for 문을 돌려서 최종 문자열 만들기
	   for(int k = 0; k < newWordIndexList.length; k++) {
		   char oneChar = str.charAt(newWordIndexList[k]-1); // 인덱스에 해당하는 한 글자 추출
		   String charToStr = String.valueOf(oneChar);
		   question += charToStr;
	   }
	   
	   return question;
   } // scramble(String str) 

}
