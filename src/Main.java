
public class Main {

	public static void main(String[] args) {
			
		for(int i=0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("SaciFox");
			}else {
				if(i%3==0){
					System.out.println("Fox");
				}
				if(i%5==0) {
					System.out.println("Saci");
				}else {
					System.out.println(i);
				}
			}
		}
		
	}

}
