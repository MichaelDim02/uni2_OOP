import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class UserInput { //Class eisagogis dedomenwn apo to pliktrologio
static String getString() { //Methodos gia eisagogi String
 String line;
 InputStreamReader input=new InputStreamReader(System.in);
 BufferedReader in=new BufferedReader(input);
 try {
line=in.readLine();
return line;
 }
 catch(Exception e) {
return "Exception";
 }
}
static short getShort() { // Methodos gia eisagogi short
 String line;
 InputStreamReader input=new InputStreamReader(System.in);
 BufferedReader in=new BufferedReader(input);
 try {
line=in.readLine();
int i=Short.parseShort(line);
return (short)i;
 }
 catch(Exception e){
 return -1;
 }
}
}