package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        //print the top line of numbers
        System.out.print("  ");
        for (int i = 0; i < model.getWidth(); i++){
            System.out.print(i);
        }
        System.out.print("\n\n");
        int c = 0;
        while(c < model.getWidth()){
            System.out.print(c + " ");
            
            for (int i=0; i < model.getWidth(); i++){
                System.out.print(model.getMark(i, c));
            }
            c++;
            System.out.print("\n");
        }

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if (model.isXTurn() == true){
            System.out.println("Player 1 (X) Move: ");
        } else {
            System.out.println("Player 2 (O) Move: ");
        }

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        System.out.println("INPUT IS OUT OF RANGE. PLEASE INPUT PROPER VALUES");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}