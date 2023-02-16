package prJarras;

public class EjemploUsoJarras
{
    public static void main(String[] args)
    {

    int n = 5;

    Jarra jarraA = new Jarra(5);
    Jarra jarraB = new Jarra(7);

        jarraA.llena();
        System.out.println(jarraA + "\t" + jarraB);

        jarraB.llenaDesde(jarraA);
        System.out.println(jarraA + "\t" + jarraB);

        jarraB.vacia();
        System.out.println(jarraA + "\t" + jarraB);

        jarraB.llenaDesde(jarraA);
        System.out.println(jarraA + "\t" + jarraB);

    }

}
