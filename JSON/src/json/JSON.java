/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author lil_ninja88
 */

/* 
 * This Class allows writing an array to a .json file.
 */

public class JSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        // Ask the user for information about a recording artist and song
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of recording artist: ");
        String artistName = input.nextLine();

        // Create new JSON object for the artist and all songs
        JSONObject artistObject = new JSONObject();

        // Add the Artist Name value pair
        artistObject.put("Artist Name", artistName);

        // Create JSON array to hold all the songs entered by the user
        JSONArray songInfo = new JSONArray();

        // Retrieve song information from the user
        while (true) {

            // Get the title of the song
            System.out.println("Enter song title (leave blank and press ENTER to quit): ");
            String songTitle = input.nextLine();

            // Check if user pressed ENTER to quit entering songs
            if (songTitle.length() == 0) {
                break;
            }

            //  Get the album name for the song
            System.out.println("Enter album name: ");
            String albumName = input.nextLine();

            // Get the genre for the song
            System.out.println("Enter genre: ");
            String genreType = input.nextLine();

            // Create JSON object and array; store song class object
            JSONObject songObject = new JSONObject();
            songObject.put("title", songTitle);
            songObject.put("album", albumName);
            songObject.put("genre", genreType);

            // Add the song information to the array of songs
            songInfo.add(songObject);
        }

        // Add the array of songs to the artist object
        artistObject.put("Song Information", songInfo);
        
        // Display the information that will be written to the JSON file
        System.out.println("Here is the information that will be written to the JSON file:\n\t" + artistObject.toJSONString() + "\n");

        // Create and write to file
        File file = new File("C:\\Users\\lil_n\\Documents\\Braden\\BYU-I\\CIT 360\\JSON\\artistFile.json");

        try (PrintWriter writeFile = new PrintWriter(file)) {
            writeFile.print(artistObject.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        // Read the file
        System.out.println("File created.\n\n** Press ENTER to display the file **");
        input.nextLine();
        
        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while (input.hasNextLine()){
                jsonIn.append(input.nextLine());
            }
                System.out.println(jsonIn.toString());
                
                JSONParser parser = new JSONParser(); // Parse objects
                
                JSONObject objAname = (JSONObject) parser.parse(jsonIn.toString()); // Cast object
                
                System.out.println("Recording Artist: " + objAname.get("Artist Name").toString() + "\n");
                
                JSONArray songsIn = (JSONArray) objAname.get("Song Information");
                
                for(int i = 0; i < songsIn.size(); i++) {
                    JSONObject songIn = (JSONObject) songsIn.get(i);
                    String songTitleIn = (String) songIn.get("title");
                    String songAlbumIn = (String) songIn.get("album");
                    String songGenreIn = (String) songIn.get("genre");
                    
                    System.out.println("Song Information:" + "\n\t" + songTitleIn + "\n\t" + songAlbumIn + "\n\t" + songGenreIn);
                }
                
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());  
        }
    }
    
}
