import java.util.*;   
// activity room class
class ActivityRoom {  
    public String subject;   
    public int id;   
     
    ActivityRoom(String subject, int id)   
    {   
        this.subject = subject;   
        this.id = id;   
    }   
     
}   
// department class   
class Department {   
private String name;
    //list of activity rooms in a department.   
    private List<ActivityRoom> ar; 
     
    Department(List<ActivityRoom> ar)  
    {  
        this.ar = ar;  
    }   
    // Getting total number of colleges  
    public List<ActivityRoom> getActivityRoomsInDepartment()   
    {   
        return ar;   
    }   
}   
class Activity{   
    public static void main(String[] args)   
    {   
        // Creating the Objects of activity room class.   
     ActivityRoom a1 = new ActivityRoom("Technical", 601);   
     ActivityRoom a2 = new ActivityRoom("Business", 602);   
     ActivityRoom a3 = new ActivityRoom("Economics", 603);  
      
        // making the list of activity rooms.   
        List<ActivityRoom> act = new ArrayList<ActivityRoom>();   
        act.add(a1);   
        act.add(a2);   
        act.add(a3);  
         
        // Creating the Object of department class. 
        Department d = new Department(act); 
         
        // making the list of activity rooms in department.   
        List<ActivityRoom> arlist = d.getActivityRoomsInDepartment();   
        for (ActivityRoom a : arlist) {   
            System.out.println(a.subject + " activity room with id " + a.id);   
        }  
         
    }   
}