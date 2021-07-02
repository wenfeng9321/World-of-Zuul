package cn.edu.whut.sept.zuul;

public class Main {

    public static void main(String[] args) {
    	Command [] k=new Command[5];

    	for(int i=0;i<5;i++){
        	k[i]=null;
    		k[i]=new Command(null, null);
    	}
        Game game = new Game();
        game.play();
    }
}
