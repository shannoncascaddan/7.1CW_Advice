public class Messages
{
    public static void main (String[] args)
    {
        Thought thinking = new Thought();
        Advice speaking =  new Advice();

        thinking.message();

        speaking.message(); // Overriden method
        System.out.println("Shannon Cascaddan");
    }//end main method
}//end class messages
