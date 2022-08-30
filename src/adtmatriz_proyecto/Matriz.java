package adtmatriz_proyecto;

public interface Matriz{
    
    ImplementacionMatriz Suma(Matriz matriz) throws Exception;
    
    ImplementacionMatriz Producto(Matriz matriz) throws Exception;
    
    ImplementacionMatriz Potencia(double k) throws Exception;
    
    String toString();
    
    boolean equals(Object matriz);

    int hashIDs();
    
    int getFilas();

    int getColumnas();
    
    public void setMatriz(double[][] matriz);
    
    public double[][] getMatriz();
    
}
