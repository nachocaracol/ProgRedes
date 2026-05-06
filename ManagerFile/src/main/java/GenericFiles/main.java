package GenericFiles;

public class main {

	public static void main(String[] args) {
		
		managerFile mF = new managerFile("probando.txt");
		
		mF.crearFileConPrintStream(mF.getFile);
	}
}
