/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class P2
{
 public static void main (String args[]){
 Mother1 m= new Mother1 ( );
 m.show( ); // show of Mother is called
 Child1 ch=new Child1 ( ); 
 ch.show ( ); // show ( ) inherited in Child from Mother is called
 }
}
