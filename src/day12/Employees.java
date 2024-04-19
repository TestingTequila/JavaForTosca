package day12;

public class Employees
{
    public String[] getEmployeeDevices(String empName)
    {
        String[] myDevices=null;

        if(empName.equals("Ravi"))
        {
            String[] devices = {"macbook pro", "ipad", "iphone13"};
            myDevices= devices;
        }
        else if (empName.equals("Jason"))
        {
            String[] devices = {"windows10", "ipad"};
            myDevices= devices;
        }

        else if (empName.equals("Kerrie"))
        {
            String[] devices = {"windows10", "ipad"};
            myDevices= devices;
        }
        return myDevices;
    }
}
