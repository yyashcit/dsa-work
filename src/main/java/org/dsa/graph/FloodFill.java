package org.dsa.graph;

public class FloodFill {

    public static void main(String[] args) {
        FloodFill obj = new FloodFill();
        int ar[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
       int ans[][]= obj.floodFill(ar, 1, 1, 2);
        // Loop through all rows
        for (int i = 0; i < ans.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // O(n) time | O(n) space
        int color = image[sr][sc];

        if(color != newColor)   DFS(image, sr, sc, color, newColor);

        return image;
    }

    public void DFS(int[][] image, int x, int y, int color, int newColor)
    {
        if(image[x][y] == color)
        {
            image[x][y] = newColor;

            if(x >= 1)  DFS(image, x-1, y, color, newColor);// top
            if(y >= 1)  DFS(image, x, y-1, color, newColor); //left
            if(x+1 < image.length)  DFS(image, x+1, y, color, newColor); // down
            if(y+1 < image[0].length)   DFS(image, x, y+1, color, newColor);//right
        }
    }
}