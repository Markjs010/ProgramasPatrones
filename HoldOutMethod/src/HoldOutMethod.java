import java.io.File;
import java.io.FileReader;

public class HoldOutMethod {
    public static void main(String[] args) throws Exception {
        File f1 = new File("/home/marcos/Downloads/wine/wine.data"); //getting the file path
        FileReader fr = new FileReader(f1);  // reading the file data
        char[] cArr = new char[(int) f1.length()];  // Creating an character array
        fr.read(cArr); // Reading the character array
        String s1 = new String(cArr); // converting to string array
        String[] arrar = s1.split(',');
        for(int i=0; i<arrar.length;i++){
            System.out.println(arrar[i]);
        }
        System.out.println("Data present in File is : "+ s1);
        fr.close();
    }
}
