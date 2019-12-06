public class Processos {

    public Processos() {

    }

    public int testeJunitInt(int a, int b) {
        System.out.println("valores A: " + a + " B: " + b);
        return (a + b);
    }

    public boolean testeJunitString(String a, String b) {
        System.out.println("valores A: " + a + " B: " + b);
        return a.equalsIgnoreCase(b);
    }

    public boolean testeJunitObject(Object a, Object b) {
        System.out.println("valores A: " + a.toString() + " B: " + b.toString());
        return a.equals(b);
    }

    public int[] testJunitArrayInt(int a, int b, int c) {

        System.out.println("valores A:" + a + " B: " + b + " C: " + c);
        return new int[]{ a, b, c };
    }



}
