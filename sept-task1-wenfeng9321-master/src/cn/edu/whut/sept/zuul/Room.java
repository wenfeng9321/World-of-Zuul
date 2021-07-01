package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;

    /**
    *定义房间和房间的出口
    */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }
    
    /**
    *输出每个房间的相邻房间信息
    */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }
    
    /**
     * @return
     */
    public String getShortDescription()
    {
        return description;
    }
    
    /**
    *@return 输出所在位置
    */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
    

    /**
     * @return 出口方向
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
    
    /**
     * @param direction 要走的出口方向
     * @return 走到下一个房间
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


