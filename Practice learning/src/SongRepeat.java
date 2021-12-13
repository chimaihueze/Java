import java.util.Scanner;

public class SongRepeat {
    public static void main(String[] args) {

        System.out.println("Playing current song");
        System.out.println("Do you want to remove song from playlist?");

        Scanner answer = new Scanner(System.in);
        boolean isOnRepeat = true;
        String skipSong = answer.nextLine();
        
        
        while (isOnRepeat) {

            if (skipSong.equals("yes")) {
                isOnRepeat = false;
                   
        answer.close();
            }
            
        }
        System.out.println("Playing next song");
    }
    
}
