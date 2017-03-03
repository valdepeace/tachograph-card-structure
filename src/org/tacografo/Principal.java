package org.tacografo;


//import java.io.File;

import org.tacografo.file.FileBlockTGD;
import org.tacografo.file.FileTGD;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Andres Carmona Gil
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if (args.length>0){
			FileBlockTGD fbt=new FileBlockTGD(args[0]);
			System.out.println(fbt.getJson());
		}else{
			System.out.println("sin argumentos");
			//Path path=Paths.get("./F__100000053533501204051503.C1B");
			//byte[] data=Files.readAllBytes(path);
			//FileBlockTGD fbt=new FileBlockTGD(data);
			//System.out.println(fbt.getJson());
		}

	}
	
	private static FileTGD FileTGD() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void mostrar(String str){
		System.out.println(str);
	}
	
	
	
	
}

