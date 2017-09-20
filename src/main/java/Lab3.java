/**
 * @author Karthik Shankar
 * Program that counts the words of a text file
 */

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }

    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}

    public static void main(String[] args) {
     // TODO Auto-generated method stub
        String article = urlToString("http://erdani.com/tdpl/hamlet.txt");
        int spaceCounter = 0;
 //       int lineCounter = 0;
        int wordCounter = 0;



        for(int i  = 0; i < article.length(); i++)
        {
            if(article.substring(i,i+1).equals(" ") && !(article.substring(i+1,i+2).equals(" ")) && !(article.substring(i+1,i+2).equals("\n")) && !(article.substring(i+1,i+2).equals("\t")))
                spaceCounter += 1;
        }
        wordCounter = spaceCounter;
        System.out.println(article);
        System.out.println("Word Counter: " + wordCounter);
    }

}
