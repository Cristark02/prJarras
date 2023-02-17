package prJarras;

public class Mesa
{
    private Jarra jarra1;
    private Jarra jarra2;

    public Mesa(Jarra j1, Jarra j2)
    {
        if (j1 == j2)
            throw new RuntimeException("No se puede crear una mesa con dos Jarras iguales");
        else
        {
            this.jarra1 = j1;
            this.jarra2 = j2;
        }
    }
    public Mesa(int c1, int c2)
    {
        this.jarra1 = new Jarra(c1);
        this.jarra2 = new Jarra(c2);
    }

    public int capacidad(int i)
    {
        int ret;
        if (i == 1)
            ret = jarra1.capacidad();
        else if(i == 2)
            ret = jarra2.capacidad();
        else
            throw new RuntimeException("Indice de Jarras erroneos");
        return ret;
    }

    public int cantidad(int i)
    {
        int ret;
        if (i == 1)
            ret = jarra1.cantidad();
        else if (i == 2)
            ret = jarra2.cantidad();
        else
            throw new RuntimeException("Indice de Jarras erroneo");
        return ret;
    }

    public void llena(int i)
    {
        if (i == 1)
            jarra1.llena();
        if (i == 2)
            jarra2.llena();
        else
            throw new RuntimeException("Indice de Jarras erroneo");
    }

    public void vacia(int i)
    {
        if (i == 1)
            jarra1.vacia();
        if (i == 2)
            jarra2.vacia();
        else
            throw new RuntimeException("Indice de Jarras erroneo");
    }

    public void llenaDesde(int i)
    {
        if (i == 1)
            jarra1.llenaDesde(jarra1);
        if (i == 2)
            jarra2.llenaDesde(jarra2);
        else
            throw new RuntimeException("Indice de Jarras erroneo");
    }

    public String toString()
    {
        return "M(" + jarra1 + "," + jarra2 + ")";
    }

}
