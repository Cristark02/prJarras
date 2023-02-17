package prJarras;

public class EjemploUsoMesa
{
    public static void main (String[] args)
    {
        Mesa m = new Mesa(7, 5);

        m.llena(2);
        System.out.println(m);

        m.llenaDesde(2);
        System.out.println(m);

        m.llena(2);
        System.out.println(m);

        m.llenaDesde(2);
        System.out.println(m);

        m.vacia(2);
        System.out.println(m);

        m.llenaDesde(2);
        System.out.println(m);

        m.llena(2);
        System.out.println(m);

        m.llenaDesde(2);
        System.out.println(m);
    }
}
