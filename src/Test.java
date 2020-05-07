public class Test {
    public static void main(String[] args) {
        Invitato inv1 = new Invitato("Bianchi Giovanni",'M',"0586 854822");
        Invitato inv2 = new Invitato("Rossi Marta",'F',"0586 844853");
        Invitato inv3 = new Invitato("Signo Cri",'M',"0586 844853");

        Coda coda = new Coda();
        coda.enqueue(inv1);
        coda.enqueue(inv2);
        coda.enqueue(inv3);
        System.out.println(coda);

        Invitato inv = coda.dequeue();
        if (inv==null)
            System.out.println("Coda vuota");
        else
            System.out.println(inv);
        System.out.println(coda);

        inv = coda.dequeue();
        if (inv==null)
            System.out.println("Coda vuota");
        else
            System.out.println(inv);
        System.out.println(coda);

        inv = coda.dequeue();
        if (inv==null)
            System.out.println("Coda vuota");
        else
            System.out.println(inv);

        inv = coda.dequeue();
        if (inv==null)
            System.out.println("Coda vuota");
        else
            System.out.println(inv);
    }
}
