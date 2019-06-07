package Function;


import System_Support.Random_Number_Generator;
public class Dice {

    private int diceNum;
    private int randomNumber;
    private int isSet;
    private int[] dis;
    private int disNum;
    Random_Number_Generator random;

    public Dice() {
        diceNum = 1;
        isSet = 8;
        random = new Random_Number_Generator();
        random.setModeNum(6);
        randomNumber = random.getRandom();
        disNum = 0;
        dis = new int[] {4,0,0,disNum,0,0,isSet};
    }

    public void run(int check) {
        if (isSet == 8) {
            if (check == 5) {
                enterSetMode();
            } else if (check == 3)
                rollDice();
        } else {
            if (check == 5) {
                exitSetMode();
            } else
                setDice(check);
        }
    }
    private void enterSetMode(){
        isSet = 7;
    }
    private void exitSetMode(){
        isSet = 8;
        disNum = 0;
    }
    public void setDice(int check) {
        if (check == 1 || check == 2) changeDice(); // up이나 down버튼 누르면 다이스 개수 변경
        disNum = diceNum;
    }

    private void changeDice() {
        if (diceNum == 1) {
            diceNum++;
        } else {
            diceNum--;
        }
    }

    private void rollDice() {
        randomNumber = random.getRandom();
        if(diceNum==2)randomNumber += random.getRandom();
        disNum = randomNumber;
    }

    public int[] getDis() {
        dis[3] = disNum;
        dis[6] = isSet;
        int [] arr=new int[]{dis[0],dis[1],dis[2],dis[3],dis[4],dis[5],dis[6]};
        return arr;
    }
    public int getdisNum(){
        return disNum;
    }

    public int getdiceNum(){
        return diceNum;
    }
}
