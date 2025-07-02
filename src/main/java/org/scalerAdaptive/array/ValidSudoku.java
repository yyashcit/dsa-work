package org.scalerAdaptive.array;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {

        //System.out.println('0'- '0'); // Output: 7
        System.out.println(isValidSudoku(new char[][]{{'.','.','4','.','.','.','6','3','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','9','.'},
                {'.','.','.','5','6','.','.','.','.'},
                {'4','.','3','.','.','.','.','.','1'},
                {'.','.','.','7','.','.','.','.','.'},
                {'.','.','.','5','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}})); // Output: true
    }

    public static boolean isValidSudoku(char[][] board) {

        int n = board.length;
        int rolLength = board[0].length;
        int colLength = board[0].length;
        int colIndx = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            if (colIndx < colLength) {
                int element = board[i][colIndx] - '0';
                if (element >= 0) {

                if (!rowSet.contains(element)) {
                    rowSet.add(element);
                } else {
                    return false; // Duplicate found in row
                }}

                //check subMatrix
                int subRowStart = (i / 3) * 3;
                int subColStart = (colIndx / 3) * 3;
                int subRowEnd = subRowStart + 3;
                int subColEnd = subColStart + 3;
                HashSet<Integer> subMatrixSet = new HashSet<>();
                int tempRowIndx = subRowStart;
                while (tempRowIndx < subRowEnd && subColStart < subColEnd) {
                    int tempColIndx = subColStart;
                    while (tempColIndx < subColEnd) {
                        int subElement = board[tempRowIndx][tempColIndx] - '0';
                        if (subElement < 0) {
                            tempColIndx++;
                            continue; // Skip empty cells
                        }
                        if (!subMatrixSet.contains(subElement)) {
                            subMatrixSet.add(subElement);
                        } else {
                            return false; // Duplicate found in sub-matrix
                        }
                        tempColIndx++;
                    }
                    tempRowIndx++;

                }
                //check column
                HashSet<Integer> colSet = new HashSet<>();

                for (int j = 0; j < n; j++) {
                    int colElement = board[j][colIndx] - '0';
                    if (colElement < 0) {

                        continue; // Skip empty cells
                    }
                    if (!colSet.contains(colElement)) {
                        colSet.add(colElement);
                    } else {
                        return false; // Duplicate found in row
                    }
                }
                colIndx++;
            }

        }


        return true;


    }

}
