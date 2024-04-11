public class Limerick extends Poem {
    public Limerick(){
        super(5);
    }

    public int getNumlines(){
        return super.getNumlines();
    }

    public int getSyllables(int k){
        int syllables = 0;
        if(k == 1 || k == 2 || k == 5){
            syllables = 9;
        } else if(k == 3 || k == 4){
            syllables = 6;
        }
        return syllables;
    }

    public void printRhythm(){
        int line = 0;
        for(int i = 0; i < getNumlines(); i++){
            line++;
            System.out.println();
            for(int j = 0; j < getSyllables(line); j++){
                System.out.print("ta ");
            }
        }
    }
}
