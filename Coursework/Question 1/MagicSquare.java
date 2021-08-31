//Rohan Dewan C1946553

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class MagicSquare {


    private int[][] squareArray;
    private int size;
    public final int target; //final so that once the target is set, it cannot be changed as it is a public attribute


    public MagicSquare(int inSize) {
        size = inSize;
        target = (size*((size*size)+1))/2;
        squareArray = new int[size][size];
        int x = 1;
        int y = (size+1)/2;

        setNumber(x,y,1);

        for(int i = 2; i <= size*size; i++) {
            if(getNumber(getIndex(x-1,size),getIndex(y-1,size)) == 0) {
                x = getIndex(x-1,size);
                y = getIndex(y-1,size);
            } else {
                x = getIndex(x+1,size);
            }
            setNumber(x,y,i);
        }
    }

    public void printSquare() {
        for(int[] row : squareArray) {
            for(int i = 0; i <= size-1; i++) {
                System.out.print(row[i]);
                if(i != size-1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    //handles setting the numbers into the 2d array and shifting the indexes to compensate for starting at 0
    public void setNumber(int row, int column, int value) {
        row = getIndex(row,squareArray[0].length)-1;
        column = getIndex(column,squareArray[0].length)-1;
        squareArray[row][column] = value;
    }

    //allows the retrieval of values from the array
    public int getNumber(int row, int column) {
        row = getIndex(row,squareArray[0].length)-1;
        column = getIndex(column,squareArray[0].length)-1;
        return squareArray[row][column];
    }

    //allows to use indexes starting at 1 and provides the wrapping mechanism
    public int getIndex(int index, int length) {
        if(index<0) {
            return Math.floorMod(index,length)+1;
        } else {
            if(Math.floorMod(index,length) == 0) {
                return length;
            } else {
                return Math.floorMod(index,length);
            }
        }
    }

    //returns a list of all of the indexes of the neighbours of a given set of indexes
    List<int[]> getNeighbourIndexes(int row, int column) {
        List<int[]> neighbours = new ArrayList<int[]>();
        neighbours.add(new int[] {getIndex(row+1, size),column});
        neighbours.add(new int[] {getIndex(row-1, size),column});
        neighbours.add(new int[] {row,getIndex(column+1,size)});
        neighbours.add(new int[] {row,getIndex(column-1,size)});
        return neighbours;
    }

    //provides functionality to check if two magic squares are equal, including different rotations of squares
    public boolean equals(MagicSquare squareB) {
        boolean flag = true;
        
        //sum each row
        for(int row = 1; row <= squareB.size; row++) {
            int total = 0;
            for(int column = 1; column <= squareB.size; column++) {
                total += squareB.getNumber(row, column);
            }
            if(total != target) {
                flag = false;
                break;
            }
        }

        //sum each column
        for(int column = 1; column <= squareB.size; column++) {
            int total = 0;
            for(int row = 1; row <= squareB.size; row++) {
                total += squareB.getNumber(column, row);
            }
            if(total != target) {
                flag = false;
                break;
            }
        }

        //sum the top left to bottom right diagonal
        int total = 0;
        for(int i = 1; i <= size; i++) {
            total+=getNumber(i,i);
        }
        if(total != target) {
            flag = false;
        }

        //sum the bottom left to top right diagonal
        total = 0;
        for(int i = 1; i <= size; i++) {
            total+=getNumber(-i,i);
        }
        if(total != target) {
            flag = false;
        }


        return flag;
    }

    //provides functionality to swap two given items in the array
    public void swap(int row, int column, int row2, int column2) {
        int firstValue = getNumber(row, column);
        int secondValue = getNumber(row2,column2);
        setNumber(row,column,secondValue);
        setNumber(row2,column2,firstValue);
    }

    //provides functionality to shuffle an array size^2 times
    public void shuffle() {
        Random randomInt = new Random();
        for(int i = 0; i <= size*size; i++) {
            int row = randomInt.nextInt(size)+1;
            int column = randomInt.nextInt(size)+1;
            List<int[]> neighbours = getNeighbourIndexes(row, column);
            int[] neighbourIndex = neighbours.get(randomInt.nextInt(neighbours.size()));
            swap(row,column,neighbourIndex[0],neighbourIndex[1]);
        }
        
    }
}