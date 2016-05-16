
import java.util.ArrayList;

public class PostWithComments extends Post
{
		private ArrayList<String> comments;
      
    /**
     * Constructor for objects of class Comments
     */
    public PostWithComments(String username)
    {
        super(username);
        comments = new ArrayList<>();
    }  
  
		public void addComment(String comment)
    {
        comments.add(comment);
    }	
}