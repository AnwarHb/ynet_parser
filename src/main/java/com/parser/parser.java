package com.parser;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;



public class parser {
    // define a varible for table
    private static String tableOfParser="<table>"+"<tr align=\"right\">"
            + "<th>כותרת של הכתבה</th>"
            +"<th>תאריך</th>"
            +"<th> תוכן ותמונה</th>"
            +"<th> קישור</th>"
            +" </tr>";
    // this function iterate through the entries in XML file
    // and convert them to html table entry.
    public static void parse(SyndFeed input) {
        // iterate through XML and detach entries
        for(SyndEntry currentEntry: input.getEntries()) {
            tableOfParser +=
                    "<tr align=\"right\">"
                            + "<th>" + currentEntry.getTitle() + "</th>"
                            +"<td>" + currentEntry.getPublishedDate() + "</td>"
                            + "<td>" + currentEntry.getDescription().getValue() + "</td>"
                            + "<td>" + "<a href=" + currentEntry.getLink() + ">" + "לחץ למעבר לכתבה" + "</a>" + "</td>";

        }
        tableOfParser+= "</table>";



    }


    // the function reads the XML from the given URL
    // convert XML to HTML with the parse method
    //return the HTML - use try and catch/
    public static String getNews() {


        try {
            URL sourceURL = new URL("http://www.ynet.co.il/Integration/StoryRss2.xml");
            SyndFeedInput xml_input = new SyndFeedInput();
            SyndFeed news = xml_input.build(new XmlReader(sourceURL));
            parse(news);
        // catch exceptin - io/feed/malformed URL
        }catch (FeedException ex ) {
            ex.printStackTrace();
        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return tableOfParser;

    }

}
