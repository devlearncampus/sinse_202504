class StringTest2{
	public static void main(String[] args) {
		/* String 불변의 특징이 있다.
		즉 변경될 수 없다...immutable 수정불가하다 */
		String x="korea";
		for(int i=1;i<=100;i++){
			x=x+i;//"korea1", "korea1".....
			System.out.println(x);
		}
		//String x="korea";

		
		System.out.println(x);
	}
}
