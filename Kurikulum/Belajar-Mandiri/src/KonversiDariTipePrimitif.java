public class KonversiDariTipePrimitif {
    public static void main(String[] args) {
        int age =30;
        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long inilong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(inilong2);
    }

}
