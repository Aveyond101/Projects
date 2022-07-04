class Board {
	private int [][] Board;
	
	private int size;
	private int counter;
	
	private int positionx;
	private int positiony;
	
	public Board(int c){
		size = c;
		Board = new int[size][size];
		
		for (int i = 0; i != size; i = i+1){
			for ( int j = 0; j != size; j = j+1  ){
				Board[i][j] = -1;
			}
		}
		
		positionx = 0;
		positiony = 0;
		counter = 0;
		Board[positionx][positiony] = counter;
	}
	
	public boolean knight_moves(int newPositionx, int newPositiony){
		boolean legal;
		
		legal = newPositionx >= 0 && newPositionx < size && newPositiony >= 0 && newPositiony < size && Board[newPositionx][newPositiony] == -1;
		
		if ( legal ) {
			legal = (( newPositionx == positionx +1 || newPositionx == positionx -1)
						&& (newPositiony == positiony + 2 || newPositiony == positiony - 2))
					||
					(( newPositiony == positiony +1 || newPositiony == positiony - 1)
						&& (newPositionx == positionx + 2 || newPositionx == positionx - 2));
		}
		
		if ( legal ) {
			positionx = newPositionx;
			positiony = newPositiony;
			counter = counter +1;
			Board[positionx][positiony] = counter;
			
		}
		if ( counter > 0 ){
		    System.out.println("You made it in "+ counter +" steps.");
		}
		return legal;
	}
	
	public int getPositionx(){
		return positionx;
	}
	
	public int getPositiony(){
		return positiony;
	}
	
	
	
	public void printBoard(){ 
	    for ( int i = 0; i != size; i = i+1 ){ 
	        printHorizontalLine();
            for ( int j = 0; j != size; j = j+1 ){ 
                System.out.print("|");   
                if ( Board[i][j] == -1 ){ 
                    System.out.print("  "); 
                    
                }
                else if ( Board[i][j] < 10 ){ 
                    System.out.print(" " + Board[i][j]); 
                
                    
                }
                else { 
                    System.out.print(Board[i][j]); 
                
                    
                }
            }
            System.out.println("|");
        }
    printHorizontalLine();
  }

  
  private void printHorizontalLine()
  { for ( int i = 0; i != size; i = i+1 )
        { System.out.print("+--"); }
    System.out.println("+");
  }
	

	
}

public class FinalProject2_KnightsTravails {
	public static void main (String[] args){
		Board x = new Board(8);
	
		System.out.println("Move 1,2 legal? " + x.knight_moves(1,2));
	    x.printBoard();
		System.out.println("Move 3,3 legal? " + x.knight_moves(3,3));
		x.printBoard();
       
		System.out.println("Current position is " + x.getPositionx() + "," + x.getPositiony());
		
	}
}
	
