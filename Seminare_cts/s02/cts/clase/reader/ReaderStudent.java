package cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cts.clase.Aplicant;
import cts.clase.Student;

public class ReaderStudent extends ReaderAplicant{

	@Override
	public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(file));
		scanner.useDelimiter(",|\n");
		List<Aplicant> student = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student1=new Student();
			super.readAplicant(student1, scanner);
			student1.setAn_studii(scanner.nextInt());
			student1.setFacultate(scanner.next());
			student.add(student1);
		}
	scanner.close();
	return student;
	}
}