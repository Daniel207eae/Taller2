package adtmatriz_proyecto;

public interface Matriz{
    
    ADTMatriz_proyecto suma(Matriz matriz) throws Exception;
    
    ADTMatriz_proyecto producto();

    int hashIDs();
    
    int getFilas();

    int getColumnas();
    
    public void setMatriz(int[][] matriz);
    
    public int[][] getMatriz();
    
}