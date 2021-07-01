package cn.edu.whut.sept.zuul;
import java.util.Scanner;

/**
*这个类是“Zuul世界”应用程序的一部分。
*“Zuul的世界”是一个非常简单的，基于文本的冒险游戏。
*
*此解析器读取用户输入并尝试将其解释为“冒险”命令。
*每次调用它时，它都从终端读取一条线路尝试将该行解释为两个单词的命令。
*它返回命令作为类命令的对象。
*解析器有一组已知的命令字。
*它检查用户的输入已知命令，如果输入不是已知命令之一，则返回标记为未知命令的命令对象。
* @author  Michael Kölling and David J. Barnes
* @version 1.0
*/

public class Parser
{
    private CommandWords commands;  // holds all valid command words
    private Scanner reader;         // source of command input

    /**
     * Create a parser to read from the terminal window.
     * 创建从终端窗口读取的解析器。
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * 从用户返回下一个命令。
     */
    public Command getCommand()
    {
        String inputLine;   // 将保留完整的输入行
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // 输入提示  

        inputLine = reader.nextLine();

        // 查找输入的最多两个单词
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // 得到输入的第一个单词
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // 得到输入的第二个单词
                // 注意：我们只忽略输入行的其余部分。
            }
        }

        // 现在检查这个词是否已知。如果是，请创建一个命令使用它。如果不是，则创建一个“null”命令（对于未知命令）。
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**   
     * 打印出有效命令词的列表。
     */
    public void showCommands()
    {
        commands.showAll();
    }
}

