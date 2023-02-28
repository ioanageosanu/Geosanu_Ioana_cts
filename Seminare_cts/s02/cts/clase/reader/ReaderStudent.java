package cts.clase.reader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.clase.Aplicant;
import cts.clase.Student;

public class ReaderStudent extends ReaderAplicant{
	private String file;
	Scanner input = new Scanner(new File(file));
	input.useDelimiter(",|\n");
	List<Aplicant> student = new ArrayList<Aplicant>();

	while (input.hasNext()) {
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nr = Integer.valueOf(input.nextInt());
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		int an_studii = input.nextInt();
		String facultate = (input.next()).toString();
		Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
		student.add(s);
	}

	@Override
	public List<Aplicant> readAplicants(String file) {
		// TODO Auto-generated method stub
		return null;
	}
	input.close();
	return student;
}
