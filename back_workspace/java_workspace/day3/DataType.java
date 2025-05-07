class DataType{
	public static void main(String[] args){
		/*
		정수	:  byte < short < int   < long
					1			2		 4		   8	
		실수	:						float  < double 
											4			8
		문자	:	char 
		*/
		//Java는 전세계 주요 국가의 문자를 수용할 수 있으므로, 영미권 위주의
		//아스키 코드 보다 확장된 유니코드 기반이다...한국어,중국어..
		//char c='강';
		
		short s=7;
		byte b=9;
		long k=10;
		
		//int 보다 작은 자료형 간 연산 시, 자동 int 형으로 변환 발생
		int x=s+b;
		
		//int 형보다 큰 자료형 간 연산 시, int형으로의 변환 발생 하지 않음 
		? = k+s;
	}
	
}
