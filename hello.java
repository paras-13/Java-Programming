// Getting Started with JAVA
/*
 * Developed by a team led by James Gosling at Sun Microsystems
 * Sun Microsystems later purchased by Oracle in 2010.
 * Designed in the year 1991, originally called oak, for use in embedded chips in consumer electronic appliances.
 * Redisgned in the year 1995 and named JAVA for developing Web Applications.
 * Java is:
 		*Simple
 		*Secure 
 		*Portable
 		*Multithreaded
 		*Object Oriented
 		*Distributed
 		*High Performance, and
 		*Dynamic
 		*Platform Independent
*/

// Some terminologies like JDK, JRE and JVM
/*
 * JDK -> Java Development Kit[JDK] is a software development kit that includes tools, executables,
 		  and binaries for developing, compiling, debugging, and running Java applications.
 		  
		*Components:- JRE, compiler (javac), an interpreter/loadre (java), an archiver (jar), a documentation generator (Javadoc) and other developmental tools.
		*Usage:- To create, compile, and debug Java applications.

 * JRE -> Java Run Time Environment[JRE] provides necessary runtime libraries, including JVM, to execute java applications
 		*Components: JVM, libraries, Java Class libraries, and other supporting files required to run Java application.
 		*Usage: Who only need to run java application use JRE, does not contain compiler and debugger
 
 * JVM -> Java Virtual Machine[JVM] is a computing machine that provides the runtime environment in which Java Bytecode can be executed.
  		* JVM interprets and executes Java bytecode, which is an intermediate representation of the Java source code.
*/

// First java program
public class hello
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		System.out.println("Welcome to Java!");
		System.out.println("Programming is fun");
		System.out.println("Fundamental is First");
		System.out.println("Problem Driven");
	}
}