package cursoJava.secao13.application;

import cursoJava.secao13.entites.Comment;
import cursoJava.secao13.entites.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program2 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you");

        Post post1 = new Post(
                sfd1.parse("21/06/2018 13:05:44"),
                "Traveling to New Zeeland",
                "I'm going to visit this wonderful country",
                12);
        Post post2 = new Post(
                sfd1.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        post1.addComment(c1);
        post1.addComment(c2);
        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post1);
        System.out.println(post2);
        
    }
}
