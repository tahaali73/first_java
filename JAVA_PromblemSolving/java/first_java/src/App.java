public class App{

    public static void main(String[] argv){
        String[] rank = {"2","3","4","5","6","7","8","9","10","Q", "K","A","j"};
        String[] suit = {"*","**","***","****"};
        String[] deck = new String[52];
        for(int j =0; j < 4;j++){
            for(int i =0; i < 13;i++ ){
                deck[i + 13*j] = rank[i] + suit[j];
            }
        }
        for(int p=0; p < 52; p++){
         System.out.print(deck[p]);
        }
        System.out.println(" ");
        for(int x =0;x <52;x++){
            int r = x + (int)(Math.random()* (52 - x));
            String t = deck[r];
            deck[r] = deck[x];
            deck[x] = t;
        }
        for(int z=0; z < 52; z++){
            System.out.print(deck[z]);
           }
        }
    }

