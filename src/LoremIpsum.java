import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class LoremIpsum {

    public static void writeString(List<String>strings){
        File  file = new File("filtered_lorem_ipsum.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String string = "";
            for (String s:strings) {
                string += s + " ";
            }
            bufferedWriter.write(string);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readString(){
        String str = "";

        try(FileReader reader = new FileReader("input.txt")) {
            int c;
            while((c = reader.read()) != -1){
               str += (char)c;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        return str;
    }

    public static List<String> analyze(String str){
        String[]strings = str.split("\\s+");
        List<String>result = new LinkedList<>();

        for (String s: strings) {
            if (s.length() > 3){
                result.add(s);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String string = LoremIpsum.readString();
        List<String>strings = LoremIpsum.analyze(string);
        LoremIpsum.writeString(strings);
    }
}
