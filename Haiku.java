public class Haiku extends Poem {
    public Haiku(){
        super(3);
    }

    public int getNumlines(){
        return super.getNumlines();
    }

    public int getSyllables(int k){
        int syllables = 0;
        if(k == 1 || k == 3){
            syllables = 5;
        } else if(k == 2){
            syllables = 7;
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