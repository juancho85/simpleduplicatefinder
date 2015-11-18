import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateFinder 
{
    public static void main(String args[]) {
        Set<String> unique = new HashSet<String>();
        Set<String> dupe = new HashSet<String>();
        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            lines.forEach(s ->  {
        	if(unique.contains(s)){
        	    dupe.add(s);
        	    unique.remove(s);
        	}else if(!dupe.contains(s) && s!=null && s.matches("\\d{9}")){
        	    unique.add(s);
        	}
            });
        } catch (IOException ex) {
            System.out.println("The file could not be read. Please check that the path provided is correct and that you have rights to read the file.");
        }
        System.out.println("Unique sirens count: "+ unique.size());
        System.out.println("Duplicate sirens count: "+ dupe.size());
    }
}