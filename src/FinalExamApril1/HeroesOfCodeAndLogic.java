package FinalExamApril1;

import java.util.*;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<Integer>> heros = new TreeMap<>();

        for (int i = 0; i < n ; i++) {
            String [] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);

            List<Integer> points = heros.get(name);
            if(points == null) {
                points = new ArrayList<>();
                points.add(hp);
                points.add(mp);
            }else{
                int currenHp = points.get(0);
                int currenMp = points.get(1);
                //-	a hero can have a maximum of 100 HP and 200 MP
                points.set(0,currenHp + hp);
                points.set(1,currenMp + mp);
            }
            heros.put(name,points);
        }
        String input = scan.nextLine();
        while (!input.equals("End")){
            String [] tokens = input.split(" - ");
            String command = tokens[0];
            switch (command){
                case "CastSpell":
                    String heroName = tokens[1];
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    if(heros.get(heroName).get(1) - mpNeeded >= 0){
                        int currentMp = heros.get(heroName).get(1) - mpNeeded;
                        List<Integer> currentPoints = heros.get(heroName);
                        currentPoints.set(1,currentMp);
                        heros.put(heroName,currentPoints);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                                heroName,spellName,currentMp);
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!\n",heroName,spellName);
                    }
                    break;
                case "TakeDamage":
                     heroName = tokens[1];
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int currentH = heros.get(heroName).get(0) - damage;
                    if(currentH > 0){
                        List<Integer> currentHp = heros.get(heroName);
                        currentHp.set(0,currentH);
                        heros.put(heroName,currentHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                                heroName,damage,attacker,currentH);
                    }else{
                        heros.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n",heroName,attacker);
                    }
                    break;
                case   "Recharge":
                    heroName = tokens[1];
                    int amount = Integer.parseInt(tokens[2]);
                    List<Integer> healMp= heros.get(heroName);
                    if (healMp.get(1) + amount > 200){
                        int recovered = 200 - healMp.get(1) ;
                        System.out.printf("%s recharged for %d MP!\n",heroName,recovered);
                        healMp.set(1,200);
                    }else{
                        System.out.printf("%s recharged for %d MP!\n",heroName,amount);
                        int recovered = (healMp.get(1)+amount) ;
                        healMp.set(1,recovered);
                    }
                    heros.put(heroName,healMp);
                    break;
                case "Heal":
                    heroName = tokens[1];
                    amount = Integer.parseInt(tokens[2]);
                    List<Integer> healHp= heros.get(heroName);
                    if(heros.get(heroName).get(0) + amount > 100){
                        int current = 100 - heros.get(heroName).get(0);
                        System.out.printf("%s healed for %d HP!\n",heroName,current);
                        healHp.set(0,100);
                        heros.put(heroName,healHp);
                    }else {
                        int recovered = (healHp.get(0)+amount) ;
                        healHp.set(0,recovered);
                        heros.put(heroName,healHp);
                        System.out.printf("%s healed for %d HP!\n",heroName,amount);
                    }

                    break;
            }

            input = scan.nextLine();
        }

        heros.entrySet().stream().sorted((h1,h2) ->
                h2.getValue().get(0).compareTo(h1.getValue().get(0))).forEach(entry->
                System.out.printf("%s\n HP: %d\n    MP: %d\n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));

    }
}
