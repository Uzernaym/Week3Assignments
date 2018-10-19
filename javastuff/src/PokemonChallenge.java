public class PokemonChallenge {
    public static void main(String arg[]) {
        String PokemonName = "Blastoise";
        int[] pkmStats = {79, 83, 100, 85, 105, 78}; //HP, Attack, Defense, Special Attack, Special Defense, Speed
        System.out.println(PokemonName + "at Level 100");
        System.out.format("HP = %d%nAttack = %d%nDefense = %d%nSpecial Attack = %d%nSpecial Defense = %d%nSpeed = %d%n", hpMax(pkmStats[0]), statMax(pkmStats[1]), statMax(pkmStats[2]), statMax(pkmStats[3]), statMax(pkmStats[4]), statMax(pkmStats[5]));
    }
    public static int hpMax(int HP) {
        return HP*2+110;
    }
    public static int statMax(int stat) {
            return stat*2+5;
    }
}
