import java.io.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.lang.String;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Affichage TA = new Affichage("Bonjour");
		Affichage TB = new Affichage("BB");

		TB.start();

		TA.start();
	}

}
