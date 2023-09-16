/**
 * This class represents the model of parrot with a name, health ,
 * amount of cracker crumbs, and state of the parrot whether it is
 * alive or not. It also emphasizes that parrot is flying or sitting.
 *
 * @author Nisarg Nayak
 */
public class Parrot {

    /**  Parrot name  **/
    private final String name;

    /**  Parrot health  **/
    private int  health;

    /**  Amount of cracker crumbs in its stomach **/
    private double amountOfCrackerCrumbs=0;

    /**  Parrot is in alive state  **/
    private boolean alive=true;


    /**
     * Create the parrot having a name, health and the amount of crumbs
     * @param name the name of parrot
     * @param health the health of parrot
     * @param amountOfCrackerCrumbs the amount of crumbs in parrot's stomach
     */
    public Parrot(String name,int health,double amountOfCrackerCrumbs) {
        this.name = name;
        if (health >= 0) {
            this.health = health;
        }
        if (amountOfCrackerCrumbs >= 0) {
            this.amountOfCrackerCrumbs = amountOfCrackerCrumbs;
        }
    }

    /**
     * Feed the parrot by providing the new amount of crumbs
     * @param crackerCrumbs the new cracker crumbs
     */
    public void feed(double crackerCrumbs){
        if(alive) {
            if (crackerCrumbs > 0) {
                amountOfCrackerCrumbs = amountOfCrackerCrumbs + crackerCrumbs;
                health += 1;
                    if (health <= 0) {
                        health = 0;
                    }
            }
        }
    }

    /**
     * set the state of parrot
     * @return the state whether it is 'alive' or 'dead'
     */
    public String state(){
        if(health<=0){
            this.health=0;
            alive=false;
            return "Dead";
        }
        return "Alive";
    }

    /**
     * set the status of parrot
     * @return the status of parrot
     */
    public String flying(){
        if(amountOfCrackerCrumbs>=10 && amountOfCrackerCrumbs<=15){
            return "Sitting";
        }
        if (amountOfCrackerCrumbs>=15 && amountOfCrackerCrumbs <=25){
            health=health-3;
            return "My tummy is full";
        }
        if(amountOfCrackerCrumbs>=25 || !alive) {
                alive = false;
                health = 0;
                return "you killed me!";
        }
        return "Flying";
    }

    /**
     * hit the parrot
     */
    public void hit() {
        if (alive) {
            health=health-2;
        }
        else{
            health=0;
        }
    }

    @Override
    public String toString(){
        return "Parrot name: " + name + ", Amount of Crumbs: " + amountOfCrackerCrumbs + "gm, Health: " + health + " \n" +
                "Status: " + state() + "\n" + flying();
        }
}
