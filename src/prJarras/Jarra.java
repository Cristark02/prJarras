package prJarras;

public class Jarra
{
    private final int capacidad;
    private int cantidad;

    public Jarra(int capacidadJarra)
    {
        if (capacidadJarra <= 0)
        {
            throw new RuntimeException("Capacidad imposible");
        }
        capacidad = capacidadJarra;
        cantidad = 0;

    }
}
