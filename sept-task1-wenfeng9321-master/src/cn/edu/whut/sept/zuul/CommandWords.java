package cn.edu.whut.sept.zuul;

public class CommandWords
{
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    /**
     * 还未开发
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * @param aString 输入的命令，由解析器从用户输入内容生成
     * @return 判断输入的命令是否是符合标准的，如果符合标准返回true，否则返回false
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    /**
     * 向用户输出进行操作之后得到的信息
     */
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
