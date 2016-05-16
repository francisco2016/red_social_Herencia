
public class JoinGroupPost extends Post
{
	private String group;
  
  /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author, String nombreGrupo)
    {
        // initialise instance variables
        super(author);
        this.group = nombreGrupo; 
        
    }

}