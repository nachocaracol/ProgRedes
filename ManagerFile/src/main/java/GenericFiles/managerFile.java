package GenericFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class managerFile {

	String ruta = "";
	private File file;
	public managerFile( String nombre) {
		
		file = new File(ruta.concat(nombre));
		
		/*file.createNewFile();
		file.delete();
		file.deleteOnExit();
		file.exists();
		file.getAbsoluteFile();
		file.getName();
		file.getParent();
		file.getTotalSpace();
		file.isDirectory();
		file.isHidden();
		file.isFile();
		file.list();
		file.listFiles();
		file.mkdir();
		file.renameTo(file);*/
	}
	
	public void crearFileConPrintStream (File f)
	{
		
		public file getFile() {
			return this.file;
		}
		FileOutputStream fos = null;
		PrintStream fs = null;
		
		
		try {
			
			fos = new FileOutputStream(f);
			fs = new PrintStream(fos);
			
			fs.println("manada enter");
			fs.print("primer renglon");
			fs.append("escribi con append");
			fs.write('n');
			
			fs.flush();
			
		}catch(FileNotFoundException ex) {
			Logger.getLogger(managerFile.class.getName()).log(Level.WARNING, null, ex);
			ex.printStackTrace();
		}finally {
			try {
				if (fs == null) fs.close();
				if (fos == null) fos.close();
			}catch (IOException ex) {
				Logger.getLogger(managerFile.class.getName()).log(Level.WARNING, null, ex);
		}
	}
	}
}
