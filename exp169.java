public class exp169 {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 directions)");
    }
}

class rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class king implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 directions only one step)");
    }
}