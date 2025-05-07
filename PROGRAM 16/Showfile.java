import java.io.*;
class Showfile {
public static void main(String[] args) {
String source = "Hello World";
byte buf[] = source.getBytes();
FileInputStream fin;
int i;
try 
{
            
            FileOutputStream f1 = new FileOutputStream("file.txt"); 
            for (i = 0; i < buf.length; i++) {
                f1.write(buf[i]);
            }
            f1.close(); 
        } catch (IOException e) {
            System.out.println("An I/O error occurred ");
        }

        try {

            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }

            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: Showfile <filename>");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
            fin.close(); 
        } catch (IOException e) {
            System.out.println("An I/O error occurred ");
        }
    }
}
