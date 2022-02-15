public class LogMessage
{
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }

    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        if (keyword.equals(description))
        {
            return true;
        }
        else if (description.indexOf(keyword + " ") == 0)
        {
            return true;
        }
        else if (description.indexOf(" " + keyword + " ") >= 0)
        {
            return true;
        }
        return false;
    }

    public String getMachineId()
    { return machineId; }

    public String getDescription()
    { return description; }
    // There may be instance variables, constructors, and methods that are not shown.
}