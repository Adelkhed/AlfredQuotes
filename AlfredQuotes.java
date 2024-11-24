import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    public String guestGreeting(String name, String dayPeriod) {
        
        String message ;
        if (dayPeriod == "morning") {
            message= String.format("Hello, %s  . Lovely to see you", name);
        }else if (dayPeriod == "afternoon") {
            message= String.format("Good Afternoon, %s  . Lovely to see you", name);
        } else {
            message= String.format("Good evening, %s  . Lovely to see you", name);
        }
        
        return message;
    }
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently "+date+ "." ;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        String message;
        String name1 = "Alexis";
        String name2 = "Alfred";

        if(conversation.indexOf(name1) != -1){
            message = "Right away, sir. She certainly isn't sophisticated enougt for that";
        } 
        else if(conversation.indexOf(name2) != -1){
            message = "At your service. As you wish, naturally";
        }
            else{
                message = "Right. And with that I shall retire.";
            }
        return message;
        }
}
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!


