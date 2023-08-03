import java.io.File;

public class Question4 {
    public static void main(String[] args) {
        File file = new File("C:/Program Files/Java");
        int fileCount = countFiles(file);
        System.out.println("Number of files: " + fileCount);
    }
    
    public static int countFiles(File dir){
        if(!dir.isDirectory()) {
            System.out.println("Error: File not found");
            return 0;
        }
        int fileCount = 0;
        File[] allFiles = dir.listFiles();
        if(allFiles != null){
            for(File file: allFiles){
                if(file.isDirectory()) fileCount += countFiles(file);
                else fileCount++;
            }
        }
        return fileCount;
    }
}
