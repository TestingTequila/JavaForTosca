package day12;

public class LaunchBrowser
{
    public String openBrowserWindow(String browserName)
    {
        String browser=null;
        if(browserName.equals("Chrome"))
        {
            browser= "Chrome";
        }
        else if (browserName.equals("Edge"))
        {
            browser="Edge";
        }
        else if (browserName.equals("Firefox"))
        {
            browser=  "Firefox";
        }
        else if (browserName.equals("Safari"))
        {
            browser=  "Safari";
        }

        return browser;
    }
}
