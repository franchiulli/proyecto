import javax.swing.JOptionPane;
public class Persona{

//atributos
String nombre;
int edad;
int año_de_nacimiento;
char sexo;
String generacion;

// metodos

// Devuelva los datos personales

	public void leerdatos(String nom,int ed,int año_n,char sex){

		nombre= nom;
		edad= ed;
		año_de_nacimiento= año_n;
		sexo= sex;

	}
//Devuelva el tipo de generación en el que nació según su año de nacimiento.

public String calculargeneracion(int año_n){

if (año_n>=1994 && año_n<=2010); {
	generacion = "Generación z";

}if (año_n>=1981 && año_n<=1993);{
			generacion = "Generación y";
}if (año_n>=1969 && año_n<=1980);{
			generacion = "Generación x";
}if (año_n>=1949 && año_n<=1968);{
			generacion = "Baby Boom";
}if (año_n>=1930 && año_n<=1948);{
			generacion = "Silent Generation";
}
return generacion;
	}

	// metodo para mostrar

	public void mostrarResultados(String generacion){

		System.out.print("\n El nombre es " + nombre);
		System.out.print("\n La edad es " + edad);
		System.out.print("\n El año de nacimiento es " + año_de_nacimiento);
		System.out.print("\n El sexo es " + sexo);
		System.out.print("\n El tipo de generacion en el que nacio segun su año de nacimiento es " + generacion);
		}


}
