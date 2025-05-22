/*
메모장과 같은 텍스트파일이 아닌, 이미지,동영상 등의 바이너리 파일을
읽어보자
*/
package gui.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class BinaryLoader{
									//실행중인 프로그램으로 데이터를 읽어들여야 하므로, 
									//입력스트림 객체가 필요 
	FileInputStream fis; //파일을 대상으로 한 입력 스트림
	FileOutputStream fos; //파일을 대상으로 한 출력 스트림 
	
	String name="C:/lecture_workspace/back_workspace/java_workspace/guiproject/res/img0.jpg";
	String target="C:/lecture_workspace/back_workspace/java_workspace/guiproject/res/img0_copy.jpg";
	
	public BinaryLoader(){
		//컴파일 시 예외 처리를 강요하는 예외방식을 가리켜 강제 예외라함
		try{
			fis = new FileInputStream(name);
			fos= new FileOutputStream(target);
			
			int data;

			while(true){
				data = fis.read(); //1byte 읽어들임.호출 시마다 다음 데이터접근	
				if(data==-1)break;
				System.out.println(data);
				//읽어들인 바이트 데이터를 내벹는 빨대를 이용하여 출력해버리자..
				fos.write(data);
			}			
		}catch(FileNotFoundException e){
			System.out.println("파일이 존재하지 않습니다.파일명을 확인해주세요");
		}catch(IOException e){
			System.out.println("입출력 수행 불가");
		}finally{
			if(fos !=null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
			if(fis !=null){
				try{
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public static void main(String[] args){
		new BinaryLoader();	
	}
}
