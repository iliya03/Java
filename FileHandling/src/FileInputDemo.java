import java.io.FileInputStream;

public class FileInputDemo {
    public static void main (String args[]){
        try{
            FileInputStream fin = new FileInputStream(("Player.txt"));
            int i=0;
            while ((i= fin.read()) !=-1){
                System.out.print((char) i); //print helps to display the characters in a single line instead of using 'println' for line breaks or different lines.

            }
            fin.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
