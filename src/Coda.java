public class Coda {
    private Nodo head;
    private Nodo tail;

    public Coda() {
        head = null;
        tail = null;
    }

    private Nodo creaNodo(Invitato persona, Nodo link) {
        Nodo p = new Nodo(persona);
        p.setLink(link);
        return p;
    }

    public void enqueue(Invitato persona) {
        Nodo p = creaNodo(persona, null);
        if (head==null){ // coda vuota?
            tail=p;
            head=tail;
        }
        else {
            tail.setLink(p);
            tail = p;
        }
    }

    public Invitato dequeue() {
        Nodo p;
        if (head==null) // coda vuota?
            return null;
        p = head;
        head = head.getLink();
        if (head==null) // ultimo elemento della coda?
            tail=null;
        return p.getInfo();
    }

    public String toString() {
        Nodo p = head;
        String lista;
        if (p==tail) // coda di un solo elemento?
            lista = new String("head/tail->");
        else
            lista = new String("head->");
        if (p==null)
            return lista + "null";
        while (p!=null) {
            lista = lista+"[" + p.getInfo().toString() + "|";
            if (p.getLink()==tail)
                lista = lista + "+]-(tail)->";
            else {
                if (p.getLink()==null)
                    lista = lista + "null]";
                else
                    lista = lista + "+]->";
            }
            p = p.getLink();
        }
        return lista;
    }
}
