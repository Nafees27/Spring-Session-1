/*
    (3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
 */

package SpringSession1;

public class Ques3 {
}

@Component("msgObject")
class Message
{

    private String message;

    @Autowired
    public void setMessage(String message)
    {
        this.message=message;
    }

    public String getMessage()
    {
        return message;
    }
}