package role;

import java.util.Random;

public class RoleCard {

    public int [] rolePlayer = new int[5];

    Random random = new Random();

    public RoleCard() {

    }
    public int randomCard(){
        int [] shuffleArray = new int[5];
        for (int i = 1; i <= 5; i++) {
            shuffleArray[i-1] = i;
        }
        for (int i = 0; i < 5; i++) {
            int j = random.nextInt(5);
            int tmp = shuffleArray[i];
            shuffleArray[i] = shuffleArray[j];
            shuffleArray[j] = tmp;
        }
        for (int i = 0; i < rolePlayer.length; i++) {
            rolePlayer[i] = shuffleArray[i];
        }
        //System.out.println(Arrays.toString(rolePlayer));

        return 0;
    }
    public int getRole(int numberPlayer){
        int getRole;
        getRole = rolePlayer[numberPlayer];
        return getRole;
    }

}
