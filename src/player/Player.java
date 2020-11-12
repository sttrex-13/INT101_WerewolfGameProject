package player;

import role.RoleList;


public class Player {
    private String name;
    private RoleList card;
    private boolean isDead = false;


    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCard(int card){
        switch (card){
            case 1:
            case 2:
            case 3:
                this.card = RoleList.Villager;
                break;
            case 4:
                this.card = RoleList.Seer;
                break;
            case 5:
                this.card = RoleList.Werewolf;
                break;
            default:
                isDead = true;
                break;
        }
    }
    public void setDead() {
        isDead = true;
    }

    public RoleList getCard() {
        return card;
    }
    public String getName() {
        return name;
    }

    public boolean isDead() {
        return isDead;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Name='" + name + '\'' +
                ", Card=" + card +
                ", Dead status=" + isDead +
                '}';
    }
}
