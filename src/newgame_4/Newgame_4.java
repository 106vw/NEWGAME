package newgame_4;

import java.util.Scanner;

public class Newgame_4 {

    static String username;
    static String input;
    static String choice;
    static String pickup;
    static String onechoice;
    static String attack;
    static String digtwo;
    static String startover;
    static String moveforward;
    static String move;
    static String Direction;
    static String take;

    //STATIC BOOLEANS
    
    public static void main(String[] args) {
        System.out.println("This game was created By Felix Reyes, and the help of Jason conklin, Mr. davis, and the dude that showed how to conect methods that sits in the corner ");
        start();
    }

    static void start() {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        username = name.nextLine().trim();
        System.out.println("Good morning " + username);
        if (username.equalsIgnoreCase(username)) {
            firstquestion();

        }
    }

    static void firstquestion() {
        System.out.println("Are you ready to start your day?");
        Scanner yesorno = new Scanner(System.in);
        onechoice = yesorno.nextLine().trim();

        if ("yes".equalsIgnoreCase(onechoice)) {
            continuegame();

        } else if ("no".equalsIgnoreCase(onechoice)) {
            firstquestion();

        }

    }

    static void continuegame() {
        System.out.println(" You need to pick up backpack " + username + " in order to go out.");
        Scanner pickup1 = new Scanner(System.in);
        pickup = pickup1.nextLine().trim();
        if ("pick up backpack".equalsIgnoreCase(pickup)) {
            gooutside();

        }

    }

    static void gooutside() {
        System.out.println("would like to go to the city or to the woods?");
        Scanner cityorwoods = new Scanner(System.in);
        choice = cityorwoods.nextLine().trim();
        if ("city".equalsIgnoreCase(choice)) {
            farfaraway();
        } else if ("woods".equalsIgnoreCase(choice)) {
            woods();
        }
        

    }

    static void farfaraway() {
        System.out.println("You have arrived to far far away, currently the city is offering a vaccine against rabbies, would you like to have your vaccine? yes or no");
        Scanner vaccine = new Scanner(System.in);
        take = vaccine.nextLine().trim();
        if("yes".equalsIgnoreCase(take)){
            vaccinee();
        }
        else if("no".equalsIgnoreCase(take)){
            novaccine();
        }
    }
    static void novaccine(){
        System.out.println("UH OH a zombie outbreak has happened, would you like to ''go home''? or ''the woods''? ");
        Scanner backhome=new Scanner (System.in);
        choice = backhome.nextLine().trim();
        if("go home".equalsIgnoreCase(choice)){
            deathtwo();
        }
        if("woods".equalsIgnoreCase(choice)){
            death();
            
        }
    }
    static void deathtwo(){
        System.out.println("there was a zombie in your house and he has killed you, type next");
        Scanner over = new Scanner(System.in);
        startover = over.nextLine().trim();
        if ("next".equalsIgnoreCase(startover)){
            death();
        }

    }
    static void vaccinee(){
        System.out.println("Uh OH the vaccine you have taken was the wrong one, you have died, Type next");
       Scanner over = new Scanner(System.in);
        startover = over.nextLine().trim();
        if ("next".equalsIgnoreCase(startover)){
            death();
        }
        
    }

    static void woods() {
        System.out.println("You have arrived to the wonderful woods of australia, you have a shovel in you back pack that will allow you to dig where ever. TRY dig");
        Scanner digone = new Scanner(System.in);
        digtwo = digone.nextLine().trim();
        if ("dig".equalsIgnoreCase(digtwo)) {
            woodstwo();
        }

    }

    static void woodstwo() {
        System.out.println("you found a sword, would you like to keep moving forward or go back?");
        Scanner movef = new Scanner(System.in);
        moveforward = movef.nextLine().trim();
        if ("keep moving forward".equalsIgnoreCase(moveforward)) {
            woodsf();
        }
        else if ("Go back".equalsIgnoreCase(moveforward)){
            novaccine();
        }

    }

    static void woodsf() {
        System.out.println("you have encountered a bear try SWING to kill the bear");
        Scanner kill = new Scanner(System.in);
        attack = kill.nextLine().trim();
        if ("kill".equalsIgnoreCase(attack)) {
            killed();
        }

    }

    static void killed() {
        System.out.println("Nice you have killed that bear and he dropped a gun, PICK UP GUN");
        Scanner gun = new Scanner(System.in);
        pickup = gun.nextLine().trim();
        if ("Pick up gun".equalsIgnoreCase(pickup)) {
            pickedupgun();
        }
    }

    static void pickedupgun() {
        System.out.println("Lets keep moving forward, move forward");
        if ("move forward".equalsIgnoreCase(moveforward)) {
            camp();
        }
    }

    static void camp() {
        System.out.println("You have found a camp would you like to search it");
        Scanner search = new Scanner(System.in);
        choice = search.nextLine().trim();
        if ("yes".equalsIgnoreCase(choice)) {
            campyes();
        }
    }

    static void campyes() {
        System.out.println("Be very careful, Command Line ''Search''");
        Scanner ssearch = new Scanner(System.in);
        move = ssearch.nextLine().trim();
        if ("search".equalsIgnoreCase(move)) {
            campissearched();

        }
    }

    static void campissearched() {
        System.out.println("you found steroids, you can use steroids to help you skip a fight");
        Scanner movef = new Scanner(System.in);
        moveforward = movef.nextLine().trim();
        if ("move forward".equalsIgnoreCase(moveforward)) {
            death();

        }
    }

    static void death() {
        System.out.println("You have died, type START OVER or you can also type end and will finish the game ");
        Scanner over = new Scanner(System.in);
        startover = over.nextLine().trim();
        if ("start over".equalsIgnoreCase(startover)){
            start();
        }
        if ("end".equalsIgnoreCase(startover)){
            questionend();
        }
        

    }
    static void questionend(){
        System.out.println("Did you enjoy this game? yes or no");
        Scanner answer= new Scanner(System.in);
        boolean goodanswer = false;
        while (!goodanswer) {
        choice = answer.nextLine().trim();
        if (choice.contains("Y")||choice.contains("y")){
            System.out.println("Good job you are right");
            goodanswer=true;
            }else if  (choice.contains("N")||choice.contains("n")){
           
            
        }
        
    }
}
}

         //The code above is just the intro