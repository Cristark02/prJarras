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

    public void llena()
    {
        cantidad=capacidad;
    }

    public void vacia()
    {
        cantidad=0;
    }

    public void llenaDesde(Jarra j1)
    {
        if (this == j1)
        {
            throw new RuntimeException("No se puede volcar una jarra desde si misma");
        }
    }
}

