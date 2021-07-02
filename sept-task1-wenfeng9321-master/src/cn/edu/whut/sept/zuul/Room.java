package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;


    /**
     * @param description 创建一个描述为“description”的房间。
     * 最初，它没有出口。
     * “description”有点像一个“厨房”或“露天庭院”
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }
    
    /**
    *定义此房间的出口。
    *@param direction 出口的方向。
    *@param neighor 沿着给定的方向靠近房间
    */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }
    
    /**
     * @return 房间名称 房间的描述
     */
    public String getShortDescription()
    {
        return description;
    }
    
    /**
    *返回此房间的详细描述，格式为：
    *你在__里。出口：__
    *@return 房间的描述，包括出口
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
    
    public Room backExit()
    {
        return exits.get(Command.k);
    }
}


