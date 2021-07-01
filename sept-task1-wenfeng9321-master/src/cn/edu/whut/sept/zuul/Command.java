/**
 * 这个类是“Zuul世界”应用程序的一部分。
 * 是对用户输入的命令来进行处理的一个类，
 */

package cn.edu.whut.sept.zuul;

public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * @param firstWord 得到用户输入命令的第一个单词
     * @param secondWord 得到用户输入命令的第二个单词
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * @return 用户输入命令的单词
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * @return
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * @return 判断信息是否与已知相匹配，匹配就返回1，不匹配就返回0
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * @return 判断用户输入的命令有没有第二个单词，有就返回1，反正返回0
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
