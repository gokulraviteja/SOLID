
### SLAP
Single level of Abstraction Principle - To demonstrate it. 

```
private void play() {
   
    currentPlayer = whoGoesFirst();
    drawBoard();
       
    while (currentPlayer.moves() && gameNotOver()) {
        currentPlayer = otherPlayer();
        System.out.printf("%n%n%s turn to move.%n", currentPlayer);
    }
  
    if (gameWasWon) {
        System.out.printf("%n%s wins!%n", currentPlayer);
    } else {
        System.out.printf("%nIt's a draw.%n");
    }
}
```

#### Reading the code out ! 

Ok, when we start playing, the currentPlayer becomes whoever goes first. Then we draw the board. While the currentPlayer makes his/her move and the game isn't over, the other player becomes the current player. Blah blah blah current player. If the game was won, then blah blah blah currentPlayer, otherwise blah blah blah
<br><br>
Added 'blah blah blah' when we try to interpret code as it's not at the same level of abstraction.

#### Fix it ! 
```
private void play() {
    currentPlayer = whoGoesFirst();
    drawBoard();
      
    while (currentPlayer.moves() && gameNotOver()) {
        currentPlayer = otherPlayer();
        sayWhoseTurnItIs();
    }
      
    announceResult();
}
  
private void sayWhoseTurnItIs() {
    System.out.printf("%n%n%s turn to move.%n", currentPlayer);
}
```


### Cohesion
Cohesion is a measure of the degree to which the elements of the module are functionally related. It is the degree to which all elements directed towards performing a single task are contained in the component. Basically, cohesion is the internal glue that keeps the module together. A good software design will have high cohesion.
* Code which is narrow , focused and does one thing well is a cohesive code.
* It changes very less frequently .
* Like things are together , don't merge the code dealing with db along with the code dealing with ui .

### Coupling
Coupling: Coupling is the measure of the degree of interdependence between the modules. A good software will have low coupling. 