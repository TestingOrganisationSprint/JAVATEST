public class compile{
	static final SecureRandom secureRandom = new SecureRandom();

	 int GenerateRandomValue(){
		 System.out.print("print");
        return secureRandom.nextInt();
    }
}
